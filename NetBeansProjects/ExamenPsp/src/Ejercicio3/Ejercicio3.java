/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.security.AccessControlException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author El_Ma
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Map<String, String> props = new LinkedHashMap();
        
        props.put("Nombre SO: ", "os.name");
        props.put("Versión SO: ", "os.version");
        props.put("Arquitectura: ", "os.arch");
        props.put("Versión JDK: ", "java.version");
        //props.put("Directorio JRE: ", "java.home");
        props.put("Usuario: ", "user.name");
        props.put("Directorio Usuario: ", "user.home");
        props.put("Directorio de ejecución: ", "user.dir");
        props.put("Ruta de ejecución: ", "java.class.path");
        props.put("Separador de archivos: ", "file.separator");
        props.put("Separador de directorios: ", "path.separator");
        props.put("Separador de líneas: ", "line.separator");
     
        System.setProperty("java.security.policy","./policy.policy");
        
        System.setSecurityManager(new SecurityManager());

        // Itering map
        System.out.println("Accediendo a las Propiedades del Sistema:\n");
        try {
            for (Map.Entry<String, String> entry : props.entrySet()) {
                //unsecureProperties.put(entry.getKey(), entry.getValue());
                System.out.println(entry.getKey() + System.getProperty(entry.getValue()));
            }
        } catch (AccessControlException ac) {
            System.out.println("\nPropiedades del sistema protegidas. ");
        }
    }
    }


