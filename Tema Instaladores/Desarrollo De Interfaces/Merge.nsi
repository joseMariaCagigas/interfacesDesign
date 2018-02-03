; Colores.nsi

     ;

     ; Este instalador toma todos los archivos los instala en archivos de programas o en un directorio

     ; que el usuario seleccione, luego crea un desintalador adem�s de crear en el men� de inicio

     ; crea accesos directos uno para el programa y otro para el desinstalado.

     ;

     ;--------------------------------

     

     ; Nombre del instalador

     Name "Colores"

     

     ; El Archivo de Salida

     OutFile "Instalador_Colores.exe"

     

     ; El directorio default para la instalaci�n

     InstallDir $PROGRAMFILES\Colores

     

     ; Clave en el registro de Windows chequeado para el directorio (Si existe, Este 

     ; se sobre escribir� en el viejo)

     InstallDirRegKey HKLM "Software\Colores" "Install_Dir"

     

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

     

     ; El material para la instalaci�n

     Section "Colores (requerido)"

     

       SectionIn RO

       

       ; Toma el directorio de que se selecciono para la instalaci�n.

     

       SetOutPath $INSTDIR

       

       ; Pone los Archivos a instalar

       File "Di_Presentacion.jar"

       ; Escribimos los registros de instalaci�n dentro del directorio del registro

       WriteRegStr HKLM SOFTWARE\Colores "Install_Dir" "$INSTDIR"

       

       ; Escribimos las claves de desinstalaci�n de Windows

     

       WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\Colores" "DisplayName" "Colores"

       WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\Colores" "UninstallString" '"$INSTDIR\uninstall.exe"'

       WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\Colores" "NoModify" 1

       WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\Colores" "NoRepair" 1

       WriteUninstaller "uninstall.exe"

       

     SectionEnd

     

     ; Secci�n opcional (Pudiera ser deshabilitada pero en este caso necesitamos crear todo.)

     Section "Start Menu Shortcuts"

     

       CreateDirectory "$SMPROGRAMS\Colores"

       CreateShortCut "$SMPROGRAMS\Colores\Uninstall.lnk" "$INSTDIR\uninstall.exe" "" "$INSTDIR\uninstall.exe" 0

       CreateShortCut "$SMPROGRAMS\Colores\Colores (MakeNSISW).lnk" "$INSTDIR\Di_Presentacion.jar" "" "$INSTDIR\Di_Presentacion.jar" 0

       

     SectionEnd

     

     ;--------------------------------

     

     ; Desinstalador

     

     Section "Uninstall"

       

  ; Remover las claves del Registro
     DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\Merge"
     DeleteRegKey HKLM SOFTWARE\Merge

     

       ; Eliminados los archivos y los desinstalamos

       Delete $INSTDIR\Di_Presentacion.jar

       Delete $INSTDIR\uninstall.exe

       ; Eliminamos todos los accesos directos del men� de inicio

       Delete "$SMPROGRAMS\Colores\*.*"

     

       ; Eliminamos las carpetas creadas

       RMDir "$SMPROGRAMS\Colores"

       RMDir "$INSTDIR"

     

     SectionEnd