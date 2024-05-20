package FileManager;

public class Campos {
    private String nombre;
    private String tipo;
    private int longitud;
    private boolean esClavePrimaria;

    public Campos(String nombre, String tipo, int longitud, boolean esClavePrimaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.esClavePrimaria = esClavePrimaria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLongitud() {
        return longitud;
    }

    public boolean isEsClavePrimaria() {
        return esClavePrimaria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setEsClavePrimaria(boolean esClavePrimaria) {
        this.esClavePrimaria = esClavePrimaria;
    }
}
