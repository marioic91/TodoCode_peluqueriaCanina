package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.ControladoraL;
import javax.swing.JOptionPane;

public class CargarDatos extends javax.swing.JFrame {
    String titulo = "CARGAR DATOS";
    ControladoraL controladoraL = new ControladoraL();
    
    public CargarDatos() {
        setTitle(titulo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNombreM = new javax.swing.JTextField();
        jComboBoxColor = new javax.swing.JComboBox<>();
        jComboBoxRaza = new javax.swing.JComboBox<>();
        jRadioButtonANO = new javax.swing.JRadioButton();
        jRadioButtonAESI = new javax.swing.JRadioButton();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldNombreD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonAENO = new javax.swing.JRadioButton();
        jRadioButtonASI = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabelTitulo.setText("CARGA DE DATOS");

        jButtonGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mario\\OneDrive\\Documentos\\TUDS\\CURSOS\\TODOCODE\\POO con JAVA\\APP\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\Imagenes\\guardar.png")); // NOI18N
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\mario\\OneDrive\\Documentos\\TUDS\\CURSOS\\TODOCODE\\POO con JAVA\\APP\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\Imagenes\\limpiar.png")); // NOI18N
        jButtonLimpiar.setText("LIMPIAR");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabelIcono.setIcon(new javax.swing.ImageIcon("C:\\Users\\mario\\OneDrive\\Documentos\\TUDS\\CURSOS\\TODOCODE\\POO con JAVA\\APP\\PeluqueriaCanina\\src\\main\\java\\com\\mycompany\\peluqueriacanina\\igu\\Imagenes\\cargaDatos.png")); // NOI18N

        jLabel1.setText("NOMBRE");

        jLabel2.setText("RAZA");

        jLabel3.setText("COLOR");

        jLabel4.setText("ATENCION ESPECIAL");

        jLabel5.setText("ALERGICO");

        jLabel6.setText("OBSERVACIONES");

        jLabel7.setText("DUEÑO");

        jLabel8.setText("TELEFONO");

        jTextFieldNombreM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreMActionPerformed(evt);
            }
        });

        jComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "BLANCO", "NEGRO", "MARRON", "GRIS" }));

        jComboBoxRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CANICHE", "GOLDEN", "OVEJERO ALEMAN", "SALCHICHA", "SIBERIANO", "GRAN DANES", "CALLEJERO" }));

        jRadioButtonANO.setSelected(true);
        jRadioButtonANO.setText("NO");

        jRadioButtonAESI.setText("SI");

        jTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelActionPerformed(evt);
            }
        });

        jTextFieldNombreD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreDActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButtonAENO.setSelected(true);
        jRadioButtonAENO.setText("NO");

        jRadioButtonASI.setText("SI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombreD, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGuardar)
                            .addComponent(jButtonLimpiar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonANO)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonASI))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonAENO)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonAESI)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonAENO)
                            .addComponent(jRadioButtonAESI))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButtonANO)
                            .addComponent(jRadioButtonASI)))
                    .addComponent(jLabelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNombreD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpiar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreDActionPerformed

    private void jTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelActionPerformed

    private void jTextFieldNombreMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreMActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String nombreM = jTextFieldNombreM.getText();
        String color = String.valueOf(jComboBoxColor.getSelectedItem());
        String raza = String.valueOf(jComboBoxRaza.getSelectedItem());
        String observaciones = jTextArea1.getText();
        boolean alergico = false;
        boolean atencionEsp = false;

        if(jRadioButtonASI.isSelected() == true){
            alergico = true;
        }

        if(jRadioButtonAESI.isSelected() == true){
            atencionEsp = true;
        }

        String nombreD = jTextFieldNombreD.getText();
        String celular = jTextFieldTel.getText();

        controladoraL.guardar(nombreM,color,raza,observaciones,alergico,atencionEsp,nombreD,celular);

        JOptionPane.showMessageDialog(null, "LA MASCOTA SE GUARDO EXITOSAMENTE");
        limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    public void limpiar(){
        jTextFieldNombreM.setText("");
        jComboBoxColor.setSelectedIndex(0);
        jComboBoxRaza.setSelectedIndex(0);
        jRadioButtonANO.setSelected(true);
        jRadioButtonAESI.setSelected(false);
        jTextFieldTel.setText("");
        jTextFieldNombreD.setText("");
        jTextArea1.setText("");
        jRadioButtonAENO.setSelected(true);
        jRadioButtonASI.setSelected(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxColor;
    private javax.swing.JComboBox<String> jComboBoxRaza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonAENO;
    private javax.swing.JRadioButton jRadioButtonAESI;
    private javax.swing.JRadioButton jRadioButtonANO;
    private javax.swing.JRadioButton jRadioButtonASI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldNombreD;
    private javax.swing.JTextField jTextFieldNombreM;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}

