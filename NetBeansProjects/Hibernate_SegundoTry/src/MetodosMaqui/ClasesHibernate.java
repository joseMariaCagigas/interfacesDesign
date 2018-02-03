package MetodosMaqui;

import Clases.CarrPro;
import Clases.Carritos;
import Clases.Productos;
import Clases.Secciones;
import Clases.Usuarios;
import Fuentes.NewHibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.NonUniqueResultException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClasesHibernate {

    public ClasesHibernate() {

    }

    // Para acceder a una base de datos a través de Hibernate debemos crear un instancia de Session
    public Session iniciarSesion() {
        Session sesion = NewHibernateUtil.getSessionFactory().openSession();

        return sesion;
    }

    //Y cuando terminamos cerramos la sesión mediante la instrucción
    public void cerrarSesion(Session sesion) {
        sesion.close();
    }

    public void transaccionHibernate(Session session) {
        // Una transacción en Hibernate debe estar dentro de una sesión. La manera de comenzarla es
        Transaction tx = session.beginTransaction();

        // Si todo va bien.
        tx.commit();

        // Si algo falla.
        tx.rollback();
    }

    // Manipulación de la base de datos a través de las clases
    // En primer lugar hay que crear una instancia Session para conectarse a la base de datos a través de Hibernate
    // iniciarSesion();
    // -------------------------------------------------------
    //Captura y visualización de un Carrito mediante get
    public void manipulacionBaseMetodoGet() {
        Session sesion = iniciarSesion();

        try {
            Usuarios d = new Usuarios();

            d = (Usuarios) sesion.get(Usuarios.class, (int) 11);
            if (d == null) {
                System.out.println("El usuario no existe");
            } else {
                System.out.println(d.getNombre()+ " " + d.getContrasena()+" "+d.getPUsuario());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cerrarSesion(sesion);
            System.exit(0);
        }

    }

    // La diferencia entre get y load es la siguiente. Si get no encuentra nada devuelve un nulo,
    // en cambio load genera la excepción ObjectNotFoundException
    // Captura y visualización de un usuario mediante load
    public void manipulacionBaseMetodoLoad() {

        Session sesion = iniciarSesion();

        try {
            Usuarios d = new Usuarios();
            d = (Usuarios) sesion.load(Usuarios.class, (int) 11);
            System.out.println(d.getNombre()+ " " + d.getContrasena()+" "+d.getPUsuario());
        } catch (ObjectNotFoundException e) {
            System.out.println(" El Carrito no existe");
        } finally {
            sesion.close();
            System.exit(0);
        }
    }

    // Captura de los Empleados de un Departamento a través del atributo Set empleadoses de la clase Departamentos
    public void capturaDatosMetodoSet() {

        Session sesion = iniciarSesion();

        try {
            Secciones d = new Secciones();
            d = (Secciones) sesion.get(Secciones.class, (int) 11);
            if (d == null) {
                System.out.println("El Departamento no existe");
            } else {
                System.out.println(d.getPSeccion()+ " " + d.getNombre());
                Iterator it = d.getProductoses().iterator();

                while (it.hasNext()) {
                    Productos e = (Productos) it.next();
                    System.out.println(e.getDescripcion()+ " " + e.getPvp()+ " " +e.getStock()+ " " +e.getPProducto());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sesion.close();
            System.exit(0);
        }
    }

    // Inserción de un objeto Departamento
    public void insercionObjetoUsuario() {

        Session sesion = iniciarSesion();

        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Usuarios d = new Usuarios();
            d.setPUsuario(5);
            d.setNombre("MaQui");
            d.setContrasena("Con");
            sesion.save(d);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            sesion.close();
            System.exit(0);
        }
    }

    // Inserción de un objeto Empleado
//    public void insercionObjetoEmpleado() {
//
//        Session sesion = iniciarSesion();
//
//        Transaction tx = null;
//        try {
//            tx = sesion.beginTransaction();
//            Empleados e = new Empleados();
//            e.setPEmpleado(91);
//            Departamentos d = (Departamentos) sesion.get(Departamentos.class, (int) 90);
//            e.setDepartamentos(d);
//            e.setApellidos("APELLIDO91");
//            e.setOficio("OFICIO91");
//            Date fecha = null;
//            try {
//                fecha = new SimpleDateFormat("yyyy-mm-dd").parse("2000-12-29");
//            } catch (ParseException ep) {
//                ep.printStackTrace();
//            }
//            e.setFechaAlta(fecha);
//            e.setSalario(1113f);
//            e.setComision(13f);
//            sesion.save(e);
//            tx.commit();
//        } catch (Exception e) {
//            tx.rollback();
//            e.printStackTrace();
//        } finally {
//            sesion.close();
//            System.exit(0);
//        }
//
//    }

    // Modificación de un objeto Departamento
    public void modificarObjetoUsuario() {

        Session sesion = iniciarSesion();
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Usuarios d = new Usuarios();
            d = (Usuarios) sesion.get(Usuarios.class, (int) 5);
            if (d == null) {
                System.out.println("El Departamento no existe");
            } else {
                d.setContrasena("Contra");
                tx.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sesion.close();
            System.exit(0);
        }

    }

    public void borradoObjetoDepartamento() {

        Session sesion = iniciarSesion();

        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Usuarios d = new Usuarios();
            d = (Usuarios) sesion.get(Usuarios.class, (int) 90);
            if (d == null) {
                System.out.println("El Departamento no existe");
            } else {
                sesion.delete(d);
                tx.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sesion.close();
            System.exit(0);
        }
    }

    public void modificarObjetoEmpleado() {
        Session sesion = iniciarSesion();
        Transaction tx = null;
        try {
            tx = sesion.beginTransaction();
            Productos e = new Productos();
            e = (Productos) sesion.get(Productos.class, (int) 91);
            if (e == null) {
                System.out.println("El Empleado no existe");
            } else {
                sesion.delete(e);
                tx.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sesion.close();
            System.exit(0);
        }
    }
    //-----------------------------------------------------------------------------
    // Dudas de que hacer probar si o si cuando tengamos lo base de datos
    //-----------------------------------------------------------------------------
    // Acceso a la base de datos a través de consultas HQL en Java
    // HQL Consultas de selección de datos
    // Datos de los departamentos utilizando List.

    // Este sistema captura de la BD todos los datos solicitados de una vez. Si la cantidad es
    // muy alta el tiempo de respuesta puede alargarse
    public void sacarDatosEnList() {
        Session sesion = iniciarSesion();

        try {
            Query q = sesion.createQuery("from Productos d where d.PProducto > 0");
            Productos d = new Productos();
            List<Productos> lista = q.list();
            Iterator<Productos> iter = lista.iterator();
            while (iter.hasNext()) {
                d = iter.next();
                System.out.println(d.getPProducto()+ " " + d.getDescripcion()
                        + " " + d.getStock()+" "+d.getPvp());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sesion.close();
            System.exit(0);
        }
    }

    // Datos de los departamentos utilizando Iterator.
    // Captura cada vez un número de instancias determinaado por setFetchSize
    public void sacarDatosConIterator() {
        Session sesion = iniciarSesion();

        try {
            Query q = sesion.createQuery("from Productos d where d.PProducto > 0");
            Productos d = new Productos();
            q.setFetchSize(4);
            Iterator iter = q.iterate();
            while (iter.hasNext()) {
                d = (Productos) iter.next();
                System.out.println(d.getPProducto()+ " " + d.getDescripcion()
                        + " " + d.getStock()+" "+d.getPvp());
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            sesion.close();
            System.exit(0);
        }
    }

    // Datos de un departamento utilizando uniqueResult().
    // Solo es posible usarlo si es seguro que va a devolver uno y sólo un objeto
    public void sacarDatosConUniqueResult() {
        Session sesion = iniciarSesion();

        Productos d = new Productos();
        try {
            d = (Productos) sesion.createQuery("from Productos d where d.PProducto = 11").uniqueResult();
            System.out.println(d.getPProducto()+ " " + d.getDescripcion()
                        + " " + d.getStock()+" "+d.getPvp());
        } catch (NullPointerException e1) {
            e1.printStackTrace(); //Saltará si no encuentra nada
        } catch (NonUniqueResultException e2) {
            e2.printStackTrace(); //Saltará si encuentra más de uno
        } finally {
            sesion.close();
            System.exit(0);
        }
    }

    // -----------------------------------------------------------
    // Mirar con detenimiento
    // -----------------------------------------------------------
    // Empleados de un Departamento utilizando List
//    public void sacarEmpleadosDeDepartamentoConList() {
//        Session sesion = iniciarSesion();
//
//        try {
//            Query q = sesion.createQuery("from CarrPro e where e.departamentos.nombre ='VENTAS' ");
//            List<CarrPro> lista = q.list();
//            Iterator<Empleados> iter = lista.iterator();
//            Empleados e = new Empleados();
//            while (iter.hasNext()) {
//                e = iter.next();
//                System.out.println(e.getApellidos() + " " + e.getOficio()
//                        + " " + e.getSalario());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            sesion.close();
//            System.exit(0);
//        }

    }
    
    
    

