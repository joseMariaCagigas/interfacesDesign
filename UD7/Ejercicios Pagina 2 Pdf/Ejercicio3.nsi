name "Tercer Ejercicio"

InstallDir "$DESKTOP"
outfile "Ejercicio3.exe"
RequestExecutionLevel admin

Section
SetOutPath $INSTDIR
File "Basura.txt"

fileOpen $0 "$INSTDIR\Basura.bat" w
fileWrite $0 "start Ejercicio3.exe"
fileClose $0

WriteUninstaller "Uninstaller.exe"

SectionEnd

Section "Uninstall"

delete "$INSTDIR\Basura.txt"
delete "$INSTDIR\Uninstaller.exe"

SectionEnd



