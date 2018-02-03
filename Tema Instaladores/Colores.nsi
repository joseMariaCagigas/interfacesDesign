; Colores.nsi

     ;

     ; Este instalador toma todos los archivos los instala en archivos de programas o en un directorio

     ; que el usuario seleccione, luego crea un desintalador además de crear en el menú de inicio

     ; crea accesos directos uno para el programa y otro para el desinstalado.

     ;

     ;--------------------------------

     

     ; Nombre del instalador

     Name "InfoLol"

     

     ; El Archivo de Salida

     OutFile "InfoLol.exe"

     

     ; El directorio default para la instalación

     InstallDir $PROFILE\InfoLol

     

     ; Clave en el registro de Windows chequeado para el directorio (Si existe, Este 

     ; se sobre escribirá en el viejo)

     InstallDirRegKey HKLM "Software\InfoLol" "Install_Dir"

     

     ; Requerir permisos para Windows Vista

     RequestExecutionLevel admin

     

     ;--------------------------------

     

     ; Paginas

     

     Page components

     Page directory

     Page instfiles

     

     UninstPage uninstConfirm

     UninstPage instfiles

     

     ;--------------------------------

     

     ; El material para la instalación

     Section "InfoLol"

     

       SectionIn RO

     

       

       ; Pone los Archivos a instalar

		File "InfoLol.jar"
		File "lib\commons-configuration-1.10.jar"
		File "lib\commons-lang-2.6.jar"
		File "lib\commons-logging-1.2.jar"
		File "lib\DJNativeSwing-SWT.jar"
		File "lib\DJNativeSwing.jar"
		File "lib\gson-2.8.0.jar"
		File "lib\sqlite-jdbc-3.7.15-m1.jar"

       ; Escribimos los registros de instalación dentro del directorio del registro

       ; WriteRegStr HKLM SOFTWARE\InfoLol "Install_Dir" "$PROFILE"

       

       ; Escribimos las claves de desinstalación de Windows

     

       WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\InfoLol" "DisplayName" "InfoLol"

       WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\InfoLol" "UninstallString" '"$INSTDIR\uninstall.exe"'

       WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\InfoLol" "NoModify" 1

       WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\InfoLol" "NoRepair" 1

       WriteUninstaller "uninstall.exe"

       

     SectionEnd

     

     ; Sección opcional (Pudiera ser deshabilitada pero en este caso necesitamos crear todo.)

     Section "Start Menu Shortcuts"

       CreateDirectory "$PROFILE\InfoLol"

       CreateShortCut "$PROFILE\InfoLol\Uninstall.lnk" "$INSTDIR\uninstall.exe" "" "$INSTDIR\uninstall.exe" 0

     SectionEnd
	 
     ;--------------------------------
	 
     ; Desinstalador

     Section "Uninstall"

  ; Remover las claves del Registro
     DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\Merge"
     DeleteRegKey HKLM SOFTWARE\Merge

       ; Eliminados los archivos y los desinstalamos

       Delete $INSTDIR\InfoLol.jar

       Delete $INSTDIR\uninstall.exe

       ; Eliminamos todos los accesos directos del menú de inicio

       Delete "$SMPROGRAMS\InfoLol\*.*"

       ; Eliminamos las carpetas creadas

       RMDir "$INSTDIR\InfoLol"

       RMDir "$INSTDIR"

     SectionEnd