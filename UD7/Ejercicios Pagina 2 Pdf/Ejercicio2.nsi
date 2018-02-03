name "Tercer Ejercicio"

outfile "Ejercicio3.exe"

Var RutaOriginal
Var RutaNueva


RequestExecutionLevel admin

Section "Copiar Archivo"

CreateDirectory "$Desktop\Aqui"
CreateDirectory "$Desktop\Aqui2"

StrCpy $RutaOriginal "$DESKTOP\Aqui"
StrCpy $RutaNueva "$DESKTOP\Aqui2"

fileOpen $0 "$RutaOriginal\Basura.txt" w
fileWrite $0 "Hola Mundo"
fileClose $0

CopyFiles $RutaOriginal\Basura $RutaNueva 

WriteUninstaller "$Ruta\Aqui\Uninstall.exe"

SectionEnd

Section "Uninstall"

delete "$RutaOriginal\Basura.txt"
delete "$RutaNueva\Basura.txt"
RMDir $RutaOriginal
RMDir $RutaNueva

SectionEnd