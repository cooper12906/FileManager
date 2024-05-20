package FileManager;

public class Campo {
    private String nombre;
    private String tipo;
    private int longitud;
    private boolean esClave;
    private boolean esClave1;
    private boolean esClave2;

    public Campo(String nombre, String tipo, int longitud, boolean esClave, boolean esClave1, boolean esClave2) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.esClave = esClave;
        this.esClave1 = esClave1;
        this.esClave2 = esClave2;
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

    public boolean isEsClave() {
        return esClave;
    }

    public boolean isEsClave1() {
        return esClave1;
    }

    public boolean isEsClave2() {
        return esClave2;
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

    public void setEsClave(boolean esClave) {
        this.esClave = esClave;
    }

    public void setEsClave1(boolean esClave1) {
        this.esClave1 = esClave1;
    }

    public void setEsClave2(boolean esClave2) {
        this.esClave2 = esClave2;
    }
       
}
