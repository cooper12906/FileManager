package FileManager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo extends java.io.File{
       
    private ArrayList<Campo> campos = new ArrayList();
    
    public Archivo(String pathname) {
        super(pathname);
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    } 
    
    public void createArchive(){
        String nombreArchivo = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo archivo:");
        if (nombreArchivo != null && !nombreArchivo.isEmpty()) {
            try {
                File nuevoArchivo = new File(nombreArchivo + ".txt");
                if (nuevoArchivo.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "Archivo creado correctamente: " + nuevoArchivo.getAbsolutePath());
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo crear el archivo. El archivo ya existe.");
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nombre de archivo inválido. Inténtelo de nuevo.");
        }
    }
    
}
