name "Quinto Ejercicio"

InstallDir "$SMPROGRAMS"
outfile "$SMPROGRAMS\Ejercicio5.exe"

RequestExecutionLevel admin

Section
SetOutPath $SMPROGRAMS

fileOpen $0 "$SMPROGRAMS\AccesoAlDesinstalador.bat" w
fileWrite $0 "start Uninstaller.exe"
fileClose $0

WriteUninstaller "$SMPROGRAMS\Uninstaller.exe"

SectionEnd

Section "Uninstall"

delete "$SMPROGRAMS\AccesoAlDesinstalador.bat"
delete "$SMPROGRAMS\Ejercicio5.exe"
delete "$SMPROGRAMS\Uninstaller.exe"

SectionEnd

name "Cuarto Ejercicio"

InstallDir "$SMPROGRAMS"
outfile "$SMPROGRAMS\Ejercicio4.exe"
RequestExecutionLevel admin

Section
SetOutPath $SMPROGRAMS
File "Basura.txt"

fileOpen $0 "$SMPROGRAMS\NuevoAccesoDirecto.bat" w
fileWrite $0 "start Ejercicio4.exe"
fileClose $0

WriteUninstaller "$SMPROGRAMS\Uninstaller.exe"

SectionEnd

Section "Uninstall"

delete "$SMPROGRAMS\AccesoDirecto.bat"
delete "$SMPROGRAMS\Basura.txt"
delete "$SMPROGRAMS\Ejercicio4.exe"
delete "$SMPROGRAMS\Uninstaller.exe"

SectionEnd