/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datbiom_aj;

import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author falberto
 */
public class CapturaHuella extends javax.swing.JFrame {

    private final String ID_EMPLEADO = "0";
    private final String ID_EMPRESA = "5";

    /**
     * Creates new form CapturaHuella
     */
    public CapturaHuella() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Imposible modificar el tema visual", "Lookandfeel inválido.",
                    JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
        txtArea.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBtns = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar1 = new javax.swing.JButton();
        panHuellas = new javax.swing.JPanel();
        lblImagenHuella = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        panBtns.setBackground(new java.awt.Color(255, 255, 255));
        panBtns.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panBtns.setPreferredSize(new java.awt.Dimension(400, 250));
        panBtns.setLayout(new java.awt.BorderLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        txtArea.setLineWrap(true);
        txtArea.setRows(10);
        txtArea.setMinimumSize(new java.awt.Dimension(100, 20));
        txtArea.setPreferredSize(new java.awt.Dimension(200, 180));
        jScrollPane1.setViewportView(txtArea);

        panBtns.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btnGuardar1.setText("Guardar Nueva Huella");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(btnGuardar1)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panBtns.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panHuellas.setBackground(new java.awt.Color(255, 255, 255));
        panHuellas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Huella Digital Capturada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panHuellas.setPreferredSize(new java.awt.Dimension(400, 235));
        panHuellas.setLayout(new java.awt.BorderLayout());
        panHuellas.add(lblImagenHuella, java.awt.BorderLayout.CENTER);

        btnGuardar.setText("Guardar Nueva Huella");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panHuellas, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panHuellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        guardarHuella();
        Reclutador.clear();
        lblImagenHuella.setIcon(null);
        start();
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarHuella();
        Reclutador.clear();
        lblImagenHuella.setIcon(null);
        start();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private DPFPTemplate template;
    public static String TEMPLATE_PROPERTY = "template";

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapturaHuella().setVisible(true);
            }
        });
    }
//Varible que permite establecer las capturas de la huellas
    private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();

//Varible que permite iniciar el dispositivo de lector de huella conectado con sus distintos metodos.
    private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();

    public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
    }

    public void start() {
        Lector.startCapture();
        EnviarTexto("Utilizando el Lector de Huella Dactilar ");
    }

    public void guardarHuella() {
        if (template != null) {
            //Obtiene los datos del template de la huella actual
            ByteArrayInputStream datosHuella = new ByteArrayInputStream(template.serialize());
            Integer tamañoHuella = template.serialize().length;

            String datosAGuardar = datosHuella.toString() + "\n" + tamañoHuella.toString();
            String rutaArchivo = "datos_guardados.txt";

            try {
                FileWriter fileWriter = new FileWriter(rutaArchivo);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(datosAGuardar);
                bufferedWriter.close();
                System.out.println("Datos guardados correctamente en " + rutaArchivo);
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El template de huella es null, no se puede guardar la huella.");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenHuella;
    private javax.swing.JPanel panBtns;
    private javax.swing.JPanel panHuellas;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
