/*****************************************************************************/
/***  (c) 2002-2013, DevWizard (DevWizard@free.fr)                         ***/
/***                                                                       ***/
/***                                                                       ***/
/***   Example 7                                                           ***/
/***                                                                       ***/
/*****************************************************************************/

package com.devwizard.javaexe.examples.example7;


import java.awt.*;
import java.util.*;
import javax.swing.*;

import com.devwizard.javaexe.examples.common.*;


/*****************************************************************************/
public class Example7 extends Examples_Frame
{
	JTextArea txtLog = new JTextArea("", 10, 40);
	JCheckBox chkIns = new JCheckBox("Allow multiple instances (2-click again on the .exe file)");


	/*******************************************/
	public Example7()
	{
		this("");
	}

	/*******************************************/
	public Example7(String firstStr)
	{
		super("One/Multiple Instance");

		Examples_UtilsGUI.initComponent(new JComponent[] { txtLog,chkIns });

		txtLog.setEditable(false);
		chkIns.setFocusable(false);

		Container c = getContentPane();

		c.setLayout(new BorderLayout());
		c.add("Center", new JScrollPane(txtLog));
		c.add("South", chkIns);

		if(!"".equals(firstStr))
			appendStr("main args :\n"+firstStr);

		pack();
		setVisible(true);
	}

	/*******************************************/
	public void appendStr(String str)
	{
		txtLog.append(str+"\n");
		txtLog.setCaretPosition(txtLog.getText().length());
	}


	/*---------------------------------------------------*/

	static Example7 frame = null;


	/*******************************************/
	static String getStrArgs(String[] args)
	{
		StringBuffer str = new StringBuffer();

		if(args != null)
			for(int i=0;i < args.length;i++)
				str.append("\t["+i+"] = "+args[i]+"\n");

		return str.toString();
	}

	/*******************************************/
	public static void main(String[] args)
	{
		Example7_Config.init();
		frame = new Example7(getStrArgs(args));
	}


	/*---------------------------------------------------*/
	// JavaExe_I_ApplicationManagement

	/*******************************************/
	public static boolean isOneInstance(String[] args)
	{
		boolean isOne = false;

		if(frame != null)
		{
			isOne = !frame.chkIns.isSelected();

			if(isOne)
				frame.toFront();

			String str1 = getStrArgs(args);
			String str2 = "  *** method isOneInstance() is called";

			if(!"".equals(str1))
				str2 += " with\n"+str1;

			frame.appendStr(str2+"  => "+isOne);
		}

		return isOne;
	}
}
