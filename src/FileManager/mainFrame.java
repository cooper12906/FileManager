    package FileManager;
import java.awt.Component;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.SpinnerNumberModel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author PC
 */
public class mainFrame extends javax.swing.JFrame {

    Archivo a = null;
    private ArrayList<Campo> campos = new ArrayList();
    
    
    public mainFrame() {
        initComponents();
        SpinnerNumberModel model = new SpinnerNumberModel(1,1,80,1);
        spinnerSize.setModel(model);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogCampos = new javax.swing.JDialog();
        CrearCampos = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        fieldTitulo = new javax.swing.JTextField();
        labelSize = new javax.swing.JLabel();
        spinnerSize = new javax.swing.JSpinner();
        botonCrearCampo = new javax.swing.JButton();
        comboBoxTipos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        radioButtonSi = new javax.swing.JRadioButton();
        radioButtonNo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        BtnNewArchivo = new javax.swing.JButton();
        BtnOpenArchive = new javax.swing.JButton();
        BotonCerrarPrograma = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnOpenDC = new javax.swing.JButton();

        CrearCampos.setPreferredSize(new java.awt.Dimension(563, 318));

        tituloLabel.setText("Titulo Campo");

        labelSize.setText("Size (Bytes)(ASCII)");

        botonCrearCampo.setText("Crear campo");
        botonCrearCampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearCampoMouseClicked(evt);
            }
        });

        comboBoxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "String", "Int", "Char", "Double", "Boolean" }));

        jLabel1.setText("Tipo");

        radioButtonSi.setText("Si");

        radioButtonNo.setText("No");

        jLabel2.setText("Es clave primaria");

        javax.swing.GroupLayout CrearCamposLayout = new javax.swing.GroupLayout(CrearCampos);
        CrearCampos.setLayout(CrearCamposLayout);
        CrearCamposLayout.setHorizontalGroup(
            CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCamposLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel)
                    .addComponent(labelSize)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CrearCamposLayout.createSequentialGroup()
                        .addComponent(radioButtonSi)
                        .addGap(18, 18, 18)
                        .addComponent(radioButtonNo)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearCamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCrearCampo)
                .addGap(43, 43, 43))
        );
        CrearCamposLayout.setVerticalGroup(
            CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCamposLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel)
                    .addComponent(fieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSize)
                    .addComponent(spinnerSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(CrearCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(radioButtonSi)
                    .addComponent(radioButtonNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(botonCrearCampo)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout dialogCamposLayout = new javax.swing.GroupLayout(dialogCampos.getContentPane());
        dialogCampos.getContentPane().setLayout(dialogCamposLayout);
        dialogCamposLayout.setHorizontalGroup(
            dialogCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
            .addGroup(dialogCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogCamposLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CrearCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        dialogCamposLayout.setVerticalGroup(
            dialogCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(dialogCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogCamposLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CrearCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));

        BtnNewArchivo.setText("Nuevo archivo");
        BtnNewArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNewArchivoMouseClicked(evt);
            }
        });
        BtnNewArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewArchivoActionPerformed(evt);
            }
        });

        BtnOpenArchive.setText("Abrir archivo");
        BtnOpenArchive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnOpenArchiveMouseClicked(evt);
            }
        });

        BotonCerrarPrograma.setText("Salir");
        BotonCerrarPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarProgramaMouseClicked(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnOpenDC.setText("Dialog campos");
        btnOpenDC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenDCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCerrarPrograma)
                .addGap(135, 135, 135))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpenDC)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(BtnNewArchivo)
                        .addGap(89, 89, 89)
                        .addComponent(BtnOpenArchive)
                        .addGap(74, 74, 74)
                        .addComponent(jButton3)
                        .addGap(91, 91, 91)
                        .addComponent(jButton2)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNewArchivo)
                    .addComponent(BtnOpenArchive)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(btnOpenDC)
                .addGap(156, 156, 156)
                .addComponent(BotonCerrarPrograma)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNewArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNewArchivoMouseClicked
        a.createArchive();
    }//GEN-LAST:event_BtnNewArchivoMouseClicked

    private void BtnOpenArchiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOpenArchiveMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Text Files (.txt)","txt");
        fileChooser.setFileFilter(filtro);
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                Desktop.getDesktop().open(archivo);
                int crearCampo = JOptionPane.showConfirmDialog(this, "¿Desea manipular campos en el archivo?");
                if(crearCampo == 0){
                    manipularCampoArchivo(archivo,this);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_BtnOpenArchiveMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnNewArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewArchivoActionPerformed
        // TODO add your handling code here:
        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del archivo");
        try {
            crearArchivo(Nombre);
        } catch (IOException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnNewArchivoActionPerformed
    //Boton para crear Archivos
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void BotonCerrarProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarProgramaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonCerrarProgramaMouseClicked

    private void btnOpenDCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenDCMouseClicked
        dialogCampos.pack();
        dialogCampos.setModal(true);
        dialogCampos.setLocationRelativeTo(this);
        dialogCampos.setVisible(true);
    }//GEN-LAST:event_btnOpenDCMouseClicked

    private void botonCrearCampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearCampoMouseClicked
        while (true) {        
            String titulo = fieldTitulo.getText();
            int longitud = (Integer) spinnerSize.getValue();
            String type = (String) comboBoxTipos.getSelectedItem(); 
            boolean esClave = (radioButtonSi.isSelected());
            
            if (titulo.isBlank()) {
                JOptionPane.showMessageDialog(CrearCampos, "Debe ingresar un titulo para el campo");
                break;
            }

            campos.add(new Campo(titulo, type, longitud, esClave,esClave,false));
            escribirCampoEnArchivo();
            
            JOptionPane.showMessageDialog(CrearCampos, "Campo creado correctamente");
        }
    }//GEN-LAST:event_botonCrearCampoMouseClicked
    //Boton para Cerrar Archivo
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarPrograma;
    private javax.swing.JButton BtnNewArchivo;
    private javax.swing.JButton BtnOpenArchive;
    private javax.swing.JPanel CrearCampos;
    private javax.swing.JButton botonCrearCampo;
    private javax.swing.JButton btnOpenDC;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxTipos;
    private javax.swing.JDialog dialogCampos;
    private javax.swing.JTextField fieldTitulo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelSize;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton radioButtonNo;
    private javax.swing.JRadioButton radioButtonSi;
    private javax.swing.JSpinner spinnerSize;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
    public void crearArchivo(String Nombre) throws IOException{
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(Nombre+".txt"));
            JOptionPane.showMessageDialog(null, "Se ha creado exitosamente!");
            writer.flush();
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public String crearCampo(String titulo, int size, String tipo){
        String campo = "";
        campo += titulo + '@' + Integer.toString(size) + '@' + tipo + '\n';
        return campo;
    }
    public void manipularCampoArchivo(File archivo,Component parent) {
        boolean metaExist = true;
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            if(reader.readLine()== null){
                int crearMeta = JOptionPane.showConfirmDialog(parent, "El archivo no contiene campos, desea agregarle?");
                if(crearMeta == 0){
                    
                }
                
            }
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void escribirCampoEnArchivo(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(a, rootPaneCheckingEnabled));
            writer.write(campos.toString());
            writer.newLine();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(CrearCampos, "no funciona este metodo estupido");
        }
    }
    
    public boolean ValidarCampo(Campo campo, int pos) {
        for (int i = 0; i < a.getCampos().size(); i++) {
            String campo_original = a.getCampos().get(i).getNombre().toLowerCase();
            if (campo_original.equals(campo.getNombre().toLowerCase())) {
                if (i == pos) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}

