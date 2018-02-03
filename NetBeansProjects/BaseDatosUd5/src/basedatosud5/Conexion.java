package basedatosud5;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Conexion {
        public static ObjectContainer conexion() {
        ObjectContainer odb = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "Departamentos.yap");
        return odb;
    }
}
