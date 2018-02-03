package clases_maquina;

public class Subs_Strings {

    String Palabra_Cortada;
    
    public Subs_Strings() {

    }

    String Hacer_SubString(int Principio, int Pos_Final, String Palabra) {
        Palabra_Cortada = Palabra.substring(Principio, Pos_Final);
        return Palabra_Cortada;
    }

    String Hacer_SubString(int Pos_Final, String Palabra) {
        Palabra_Cortada = Palabra.substring(0, Pos_Final);
        return Palabra_Cortada;
    }

}
