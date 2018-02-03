package clase_gato;

public class Gatos { // Igual Que este <>

    protected int Energia;
    protected String nombre;
    protected boolean Vivo = true;

    // -------------- Constructores ---------------------
    //Constructor por defecto tiene que llamarse igual que la Clase (de arriba<>)
    
    Gatos() {

    }

    // Ahora le metes los atributos
    Gatos(String nombre, int Energia, boolean Vivo) {
        //Y los relacionas con las variables del objeto
        this.nombre = nombre;
        this.Energia = Energia;
        this.Vivo = Vivo;
    }

    // ----------------Metodos MaQui---------------------
    void Agradecer() {
        System.out.println("Prrrr...");
    }

    public int Dar_De_Comer() {
        this.Energia = Energia + 3;
        return Energia;
    }

    static void Salir() {
        System.out.println("Gracias Por Divertirte Con Los Gatitos");
    }

    public void Jugar() {
        this.Energia = Energia - 2;
        System.out.println("Marramiau...");
    }

    void TieneHambre() {
        System.out.println("El Gatito: " + nombre + " Está Cansado... Tiene: " + Energia + " De Energia");
    }

    void MatarMinino() {
        this.Vivo = false;

    }

    //-----------Metodos Set--------------------------
    // Si Son Booleanos El Net Beans Te Lo Pilla Mal
    
    public boolean setVivo(boolean Vivo) { //Dale True o False si es booleano
        this.Vivo = Vivo;
        return Vivo;
    }

    public void setEnergia(int Energia) {
        this.Energia = Energia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //-----------Metodos Get--------------------------
    
    public int getEnergia() {
        return Energia;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getVivo() {
        return Vivo;
    }

    @Override
    public String toString() {
        return "El Gatito Se Llama " + nombre + " y Tiene " + Energia + " KW De Energía";
    }

}


