package Clases;
// Generated 22-feb-2016 9:20:28 by Hibernate Tools 4.3.1



/**
 * CarrPro generated by hbm2java
 */
public class CarrPro  implements java.io.Serializable {


     private int PCarrPro;
     private Carritos carritos;
     private Productos productos;
     private Integer cantidad;

    public CarrPro() {
    }

	
    public CarrPro(int PCarrPro) {
        this.PCarrPro = PCarrPro;
    }
    public CarrPro(int PCarrPro, Carritos carritos, Productos productos, Integer cantidad) {
       this.PCarrPro = PCarrPro;
       this.carritos = carritos;
       this.productos = productos;
       this.cantidad = cantidad;
    }
   
    public int getPCarrPro() {
        return this.PCarrPro;
    }
    
    public void setPCarrPro(int PCarrPro) {
        this.PCarrPro = PCarrPro;
    }
    public Carritos getCarritos() {
        return this.carritos;
    }
    
    public void setCarritos(Carritos carritos) {
        this.carritos = carritos;
    }
    public Productos getProductos() {
        return this.productos;
    }
    
    public void setProductos(Productos productos) {
        this.productos = productos;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }




}


