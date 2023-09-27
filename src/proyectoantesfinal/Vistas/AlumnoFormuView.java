/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyectoantesfinal.Vistas;

import java.sql.Date;
import java.time.LocalDate;
import proyectoantesfinal.AccesoADatos.AlumnoData;
import proyectoantesfinal.Entidades.Alumno;
import java.time.ZoneId;
import javax.swing.JOptionPane;


public class AlumnoFormuView extends javax.swing.JInternalFrame {

    public AlumnoFormuView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        JLformualumno = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        JTdocumentoAlumno = new javax.swing.JTextField();
        JTnombreAlumno = new javax.swing.JTextField();
        JTapellidoAlumno = new javax.swing.JTextField();
        jbotonEstado = new javax.swing.JRadioButton();
        BotonBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JToggleButton();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JLformualumno.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        JLformualumno.setForeground(new java.awt.Color(0, 0, 0));
        JLformualumno.setText("Almuno ");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Documento : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estado :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de Nacimiento :");

        jbNuevo.setBackground(new java.awt.Color(153, 204, 255));
        jbNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevo.setText("Nuevo");
        jbNuevo.setToolTipText("Para agregar nuevos alumnos");
        jbNuevo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 204, 204));
        jbEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbEliminar.setText("Eliminar");
        jbEliminar.setToolTipText("Para eliminar alumnos ");
        jbEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(204, 255, 204));
        jbGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar.setText("Guardar");
        jbGuardar.setToolTipText("Guardar cambios");
        jbGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(204, 204, 255));
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("Salir");
        jbSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        JTdocumentoAlumno.setBackground(new java.awt.Color(228, 228, 228));
        JTdocumentoAlumno.setToolTipText("Escriba su documento ");

        JTnombreAlumno.setBackground(new java.awt.Color(228, 228, 228));
        JTnombreAlumno.setToolTipText("Escriba  s");

        JTapellidoAlumno.setBackground(new java.awt.Color(228, 228, 228));
        JTapellidoAlumno.setToolTipText("Escriba su apellido ");

        jbotonEstado.setBackground(new java.awt.Color(255, 255, 255));
        jbotonEstado.setForeground(new java.awt.Color(255, 255, 255));
        jbotonEstado.setText("Fn");

        BotonBuscar.setBackground(new java.awt.Color(204, 204, 255));
        BotonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BotonBuscar.setText("Buscar");
        BotonBuscar.setToolTipText("");
        BotonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 255), new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 102, 255)));
        BotonBuscar.setMaximumSize(new java.awt.Dimension(76, 26));
        BotonBuscar.setMinimumSize(new java.awt.Dimension(76, 26));
        BotonBuscar.setPreferredSize(new java.awt.Dimension(76, 26));
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 204));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoantesfinal/Vistas/Imagenes/broom.png"))); // NOI18N
        jBLimpiar.setToolTipText("Limpiar campos");
        jBLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.orange, java.awt.Color.orange));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbotonEstado)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(JTdocumentoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(JTapellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(JTnombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(JLformualumno)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLformualumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(JTdocumentoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JTapellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(JTnombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jbotonEstado))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jdFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verificarCampos() throws NullPointerException{
        
       
        
    }
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
         if (JTdocumentoAlumno.getText().isEmpty()) {
             JOptionPane.showMessageDialog(this, "Porfavor ingrese un numero de documento valido.");
            return;
        }
        if(JTapellidoAlumno.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Porfavor ingrese un apellido.");
            return;
        }
        if (JTnombreAlumno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese un nombre.");
            return;
        }
        if(jbotonEstado.isSelected()==false){
            JOptionPane.showMessageDialog(this, "Porfavor ingrese el estado adecuado.");
            return;
        }
        if(jdFechaNacimiento.getDate()==null){
            JOptionPane.showMessageDialog(this, "Porfavor ingrese una fecha.");
            return;
            
        }
        
        try{
         if(JTdocumentoAlumno.getText().length()==8){
            int dni=Integer.parseInt(JTdocumentoAlumno.getText());
            
            try{
                int nombre = Integer.parseInt(JTnombreAlumno.getText());
                int apellido =Integer.parseInt(JTapellidoAlumno.getText());
                JOptionPane.showMessageDialog(this, "Ingrese un nombre correcto");
            }catch (NumberFormatException ex2){
            String apellido = JTapellidoAlumno.getText();
            
            String nombre = JTnombreAlumno.getText();
            boolean estado = jbotonEstado.isSelected();
    
            java.util.Date utilDate= jdFechaNacimiento.getDate();
            java.sql.Date sqlDate= new java.sql.Date(utilDate.getTime());
            LocalDate fechaNac = sqlDate.toLocalDate();       
          
                Alumno alumnito = new Alumno(dni,apellido, nombre,fechaNac, estado);
                AlumnoData agregar =new AlumnoData();
                agregar.guardarAlumno(alumnito);
                
                
                JTdocumentoAlumno.setText("");
                JTapellidoAlumno.setText("");
                JTnombreAlumno.setText("");
                jbotonEstado.setSelected(false);
                jdFechaNacimiento.setDate(null);
            }   
           
         }else{
             JOptionPane.showMessageDialog(this, "Porfavor ingrese un numero de documento valido.");
         }
         
     }catch(NumberFormatException ex){
         JOptionPane.showMessageDialog(this, "Porfavor ingrese un numero de documento valido.");
     }
       
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
      this.dispose();  
    }//GEN-LAST:event_jbSalirActionPerformed
/*
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCalendarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jCalendarioAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jCalendarioAncestorAdded
*/
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        AlumnoData alumnoData = new AlumnoData();
         if (JTdocumentoAlumno.getText().isEmpty()) {
             JOptionPane.showMessageDialog(this, "Porfavor ingrese un numero de documento valido.");
            return;
        }
        if(JTapellidoAlumno.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Porfavor ingrese un apellido.");
            return;
        }
        if (JTnombreAlumno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese un nombre.");
            return;
        }
        if(jbotonEstado.isSelected()==false){
            JOptionPane.showMessageDialog(this, "Porfavor ingrese el estado adecuado.");
            return;
        }
        if(jdFechaNacimiento.getDate()==null){
            JOptionPane.showMessageDialog(this, "Porfavor ingrese una fecha.");
            return;    
        }
        
        try {
            LocalDate fechaNac = jdFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            try{
                int nombre = Integer.parseInt(JTnombreAlumno.getText());
                int apellido =Integer.parseInt(JTapellidoAlumno.getText());
                JOptionPane.showMessageDialog(this, "Ingrese un nombre correcto");
            }catch (NumberFormatException ex2){
                String nombre = JTnombreAlumno.getText();
                String apellido = JTapellidoAlumno.getText();
                int dni = Integer.parseInt(JTdocumentoAlumno.getText());
                boolean estado = jbotonEstado.isSelected();
                Alumno alumno=new Alumno(dni,apellido ,nombre,fechaNac,estado);
                alumnoData.modificarAlumno(alumno);}
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese los números correspondientes");
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        try{
            AlumnoData boton = new AlumnoData();
        
            int cod = Integer.parseInt(JTdocumentoAlumno.getText());
            Alumno alumnito = boton.buscarAlumnoPorDni(cod);
        
            if (alumnito != null){
                JTapellidoAlumno.setText(alumnito.getApellido());
                JTnombreAlumno.setText(alumnito.getNombre());
                jbotonEstado.setSelected(alumnito.isEstado());
                jdFechaNacimiento.setDate(Date.valueOf(alumnito.getFechaNacimiento()));
            
            } 
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un numero de documento valido.");
        }catch(NullPointerException exception){
            JOptionPane.showMessageDialog(this, "Porfavor ingrese un numero de documento valido.");
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try{
        AlumnoData eliminar = new AlumnoData();
         jbotonEstado.setSelected(false);
        eliminar.eliminarAlumno(Integer.parseInt(JTdocumentoAlumno.getText()));
        }catch(NumberFormatException ex){
             JOptionPane.showMessageDialog(this, "Porfavor ingrese un numero de documento valido.");  
        }
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        JTapellidoAlumno.setText("");
        JTdocumentoAlumno.setText("");
        JTnombreAlumno.setText("");
        jbotonEstado.setSelected(false);
        jdFechaNacimiento.setDate(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JLabel JLformualumno;
    private javax.swing.JTextField JTapellidoAlumno;
    private javax.swing.JTextField JTdocumentoAlumno;
    private javax.swing.JTextField JTnombreAlumno;
    private javax.swing.JToggleButton jBLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jbotonEstado;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    // End of variables declaration//GEN-END:variables




}
