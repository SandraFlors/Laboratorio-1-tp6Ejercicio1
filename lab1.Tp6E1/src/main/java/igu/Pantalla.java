
package igu;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Pantalla extends javax.swing.JFrame {

   DefaultTableModel dtm=new DefaultTableModel();
   
    public Pantalla() {
        initComponents();
   
        
        
        String[] titulo=new String[]{"nombre","categoria","precio"};
        dtm.setColumnIdentifiers(titulo);
        tableProductos.setModel(dtm);
    }

    
    void agregar(){
        dtm.addRow(new Object[]{
           txtNombreP.getText(),ComboBoxP.getSelectedItem() ,txtPrecioP.getText()
        });
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGestionP = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JPanel();
        lblCategoria = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxP = new javax.swing.JComboBox<>();
        txtNombreP = new javax.swing.JTextField();
        txtPrecioP = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion de Productos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblGestionP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGestionP.setForeground(new java.awt.Color(0, 0, 0));
        lblGestionP.setText("Gestion de Productos");

        lblCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(0, 0, 0));
        lblCategoria.setText("Categoria:");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio ($):");

        ComboBoxP.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        ComboBoxP.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perfumeria", "Ropa", "Farmacia", "Limpieza", "Comestible" }));

        txtNombreP.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreP.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        txtNombreP.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePActionPerformed(evt);
            }
        });
        txtNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePKeyTyped(evt);
            }
        });

        txtPrecioP.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioP.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        txtPrecioP.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPKeyTyped(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAgregarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout lblPrecioLayout = new javax.swing.GroupLayout(lblPrecio);
        lblPrecio.setLayout(lblPrecioLayout);
        lblPrecioLayout.setHorizontalGroup(
            lblPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPrecioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addComponent(lblNombre)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(lblPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreP)
                    .addComponent(ComboBoxP, 0, 147, Short.MAX_VALUE)
                    .addComponent(txtPrecioP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        lblPrecioLayout.setVerticalGroup(
            lblPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblPrecioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(lblPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(ComboBoxP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tableProductos.setBackground(new java.awt.Color(255, 255, 255));
        tableProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tableProductos.setForeground(new java.awt.Color(0, 0, 0));
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Categoria", "Precio"
            }
        ));
        tableProductos.setEnabled(false);
        jScrollPane1.setViewportView(tableProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblGestionP)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblGestionP)
                .addGap(52, 52, 52)
                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePActionPerformed
        
    }//GEN-LAST:event_txtNombrePActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //VALIDARE QUE EL USUARIO NO DEJE CAMPOS VACIOS AL MOMENTO DE CLIKEAR EL BOTON AGREGAR
        if(txtNombreP.getText().trim().isEmpty()) { 
            JOptionPane.showMessageDialog(null, " No puede dejar campos vacios!","ERROR",JOptionPane.WARNING_MESSAGE);
        }else{ 
            if(txtPrecioP.getText().trim().isEmpty()){ 
                 JOptionPane.showMessageDialog(null, " No puede dejar campos vacios!","ERROR",JOptionPane.WARNING_MESSAGE);
            }else{
                agregar();
            }
        }
        
        
       //inVocare al metodo AGREGAR para que agregue a la tabla la cetegoria,nombre y valor del producto/articulo
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPrecioPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioPKeyTyped
       char validar=evt.getKeyChar(); //CON ESTA ASIGNACION VALIDAREMOS QUE EL USUARIO SOLO INGRESE VALORES NUMERICOS
       if(Character.isLetter(validar)){ 
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Error! debe ingresar solo valores numéricos");
       }
    }//GEN-LAST:event_txtPrecioPKeyTyped

    private void txtNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePKeyTyped
       char validar=evt.getKeyChar();//CON ESTA ASIGANCION VALIDAREMOS QUE EL USUARIO SOLO INGRESE LETRAS
       if(Character.isDigit(validar)){ 
           getToolkit().beep();
           evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Error! debe ingresar solo Letras y/o Palabras");
       }
       
    }//GEN-LAST:event_txtNombrePKeyTyped

    private void btnAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyPressed
       
    }//GEN-LAST:event_btnAgregarKeyPressed

   
    public static void main(String args[]) {
       
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxP;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblGestionP;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel lblPrecio;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtPrecioP;
    // End of variables declaration//GEN-END:variables
}
