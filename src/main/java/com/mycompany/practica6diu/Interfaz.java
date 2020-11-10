package com.mycompany.practica6diu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/**
 * @author Grupo 06
 */
public class Interfaz extends javax.swing.JFrame {

    JFileChooser fc = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes (*.jpg, *.png)", "jpg", "png");
    private File file ;
    
    public Interfaz() {
        initComponents();
        fc.addChoosableFileFilter(filter);
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lienzo1 = new com.mycompany.practica6diu.Lienzo();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMIabrir = new javax.swing.JMenuItem();
        jMIguardar = new javax.swing.JMenuItem();
        jMIumbralizar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIcerrar = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jmiDescripcion = new javax.swing.JMenuItem();
        jmiAbrir = new javax.swing.JMenuItem();
        jmiGuardar = new javax.swing.JMenuItem();
        jmiUmbralizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Umbralizado de Imágenes");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel1.setText("Hecho por: Borja Álvarez Medina y Esther Zurita Curbelo");

        jMenuFile.setMnemonic('f');
        jMenuFile.setText("Archivo");

        jMIabrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIabrir.setText("Abrir");
        jMIabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIabrirActionPerformed(evt);
            }
        });
        jMenuFile.add(jMIabrir);

        jMIguardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIguardar.setText("Guardar");
        jMIguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIguardarActionPerformed(evt);
            }
        });
        jMenuFile.add(jMIguardar);

        jMIumbralizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIumbralizar.setText("Umbralizar");
        jMIumbralizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIumbralizarActionPerformed(evt);
            }
        });
        jMenuFile.add(jMIumbralizar);
        jMenuFile.add(jSeparator1);

        jMIcerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMIcerrar.setText("Cerrar");
        jMIcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIcerrarActionPerformed(evt);
            }
        });
        jMenuFile.add(jMIcerrar);

        jMenuBar1.add(jMenuFile);

        jMenuHelp.setMnemonic('h');
        jMenuHelp.setText("Ayuda");

        jMenu1.setText("Acerca de...");

        jmiDescripcion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiDescripcion.setText("Descripción");
        jmiDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDescripcionActionPerformed(evt);
            }
        });
        jMenu1.add(jmiDescripcion);

        jmiAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiAbrir.setText("Abrir");
        jmiAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAbrir);

        jmiGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiGuardar.setText("Guardar");
        jmiGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiGuardar);

        jmiUmbralizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmiUmbralizar.setText("Umbralizar");
        jmiUmbralizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUmbralizarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiUmbralizar);

        jMenuHelp.add(jMenu1);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIumbralizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIumbralizarActionPerformed
        Integer umbral = Integer.parseInt(JOptionPane.showInputDialog(this, "¿Cuál es el valor del umbralizado de la imagen?", "Valor de umbralizado", JOptionPane.QUESTION_MESSAGE));
        System.out.println("Valor del umbral: " + umbral);
    }//GEN-LAST:event_jMIumbralizarActionPerformed

    private void jMIcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIcerrarActionPerformed
        int answer = JOptionPane.showConfirmDialog(this, "¿Quiere cerrar la aplcación?", "Salir", JOptionPane.YES_NO_OPTION);
        if(answer == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_jMIcerrarActionPerformed

    private void jMIabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIabrirActionPerformed
        int option = fc.showOpenDialog(this);
        file = fc.getSelectedFile();
        if(option == JFileChooser.APPROVE_OPTION){
            System.out.println("path: " + file.getAbsolutePath());
            try {
                FileReader reader = new FileReader(file);
                reader.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMIabrirActionPerformed

    private void jMIguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIguardarActionPerformed
        int option = fc.showSaveDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            file = fc.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(file);
                writer.write(file.getName());
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMIguardarActionPerformed

    private void jmiDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDescripcionActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "Esta aplicación sirve para realizar un umbralizado a partir de una imagen guardada en el ordenador del usuario.", "Ayuda: Descripción de la Aplicación", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmiDescripcionActionPerformed

    private void jmiAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAbrirActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "El usuario puede seleccionar una imagen en su equipo con el formato (.jpg o .png) para mostrar la imagen en la aplicación y luego poder realizar el umbralizado.", "Ayuda: Abrir", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmiAbrirActionPerformed

    private void jmiGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGuardarActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "El usuario puede guardar en su equipo la imagen que se encuentra actualmente en la pantalla.", "Ayuda: Guardar", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmiGuardarActionPerformed

    private void jmiUmbralizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUmbralizarActionPerformed
        JOptionPane.showMessageDialog(jMenu1, "El usuario puede decidir el umbral del filtro que se le aplicará a la imagen introduciendo el valor en una ventana emergente.", "Ayuda: Umbralizar", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmiUmbralizarActionPerformed

    private Mat umbralizar(Mat imagen_original, Integer umbral) {
        // crear dos imágenes en niveles de gris con el mismo tamaño que la original
        Mat imagenGris = new Mat(imagen_original.rows(), imagen_original.cols(), CvType.CV_8U);
        Mat imagenUmbralizada = new Mat(imagen_original.rows(), imagen_original.cols(), CvType.CV_8U);
        // convierte a niveles de grises la imagen original
        Imgproc.cvtColor(imagen_original, imagenGris, Imgproc.COLOR_BGR2GRAY);
        // umbraliza la imagen:
        // - píxeles con nivel de gris > umbral se ponen a 1
        // - píxeles con nivel de gris <= umbra se ponen a 0
        Imgproc.threshold(imagenGris, imagenUmbralizada, umbral, 255, Imgproc.THRESH_BINARY);
        return imagenUmbralizada;
    }
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMIabrir;
    private javax.swing.JMenuItem jMIcerrar;
    private javax.swing.JMenuItem jMIguardar;
    private javax.swing.JMenuItem jMIumbralizar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmiAbrir;
    private javax.swing.JMenuItem jmiDescripcion;
    private javax.swing.JMenuItem jmiGuardar;
    private javax.swing.JMenuItem jmiUmbralizar;
    private com.mycompany.practica6diu.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}
