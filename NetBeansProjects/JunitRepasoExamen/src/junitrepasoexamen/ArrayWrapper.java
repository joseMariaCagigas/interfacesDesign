package junitrepasoexamen;

public class ArrayWrapper {

    int arr[]; //contenedor de elementos
//Constructor

    public ArrayWrapper(int par[]) {
        this.arr = par;
    }
//tamaño

    public int size() {
        return this.arr.length;
    }
//devuelve cadena con contenido del array

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        int i = 0;
        str.append("[");
        for (i = 0; i < this.arr.length - 1; i++) {
            str.append(arr[i] + ",");
        }
        str.append(arr[i] + "]");
        return str.toString();
    }
//agrega un elemento en la posición indicada

    public void setElementAt(int Dentro_Array, int Tamanno_Array) {
        arr[Tamanno_Array] = Dentro_Array;
    }
//obtiene el array

    public int[] getArray() {
        return this.arr;
    }
}
