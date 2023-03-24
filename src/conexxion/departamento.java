package conexxion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class departamento extends javax.swing.JFrame {

    /**
     * Creates new form departamento
     */
    public departamento() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos(" ");
    }

     void mostrarDatos(String valor){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("id_dept");
        modelo.addColumn("nombre_dept");
        modelo.addColumn("no_emp");
        tablas.setModel(modelo);
         
        String sql=" ";
        if(valor.equals(" ")){
            sql="SELECT * FROM departamento";
        }else{
            sql="SELECT * FROM departamento where id_dept ='"+valor+"'";
        }
        String [ ] datos=new String[3];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                datos [0]=rs.getString(1);
                datos [1]=rs.getString(2);
                datos [2]=rs.getString(3);
                modelo.addRow(datos);
            }
            tablas.setModel(modelo);
        }catch(SQLException e){
        System.out.println("ERROR: "+e);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MenuEli = new javax.swing.JMenuItem();
        MenuMod = new javax.swing.JMenuItem();
        MenuSel = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        depa = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        emp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        MenuEli.setText("Eliminar");
        MenuEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuEli);

        MenuMod.setText("Modificar");
        MenuMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuMod);

        MenuSel.setText("Seleccionar");
        MenuSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSelActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuSel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DEPARTAMENTO");

        jLabel2.setText("id_dept");

        jLabel3.setText("nombre_dept");

        jLabel4.setText("no_emp");

        depa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                depaKeyTyped(evt);
            }
        });

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        emp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empKeyTyped(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablas.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablas);

        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("ELIMINAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("LIMPIAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("BUSCAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("MOSTRAR DATOS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(depa, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(name)
                                    .addComponent(emp))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(depa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depaKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(depa.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_depaKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
         char valiLtras=evt.getKeyChar();
        int limit=15;
        if(Character.isDigit(valiLtras)){
            JOptionPane.showMessageDialog(null, "Solo se aceptan letras");
        }
        if(name.getText().length()==limit){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Exceso de caracteres"+limit);
        }
    }//GEN-LAST:event_nameKeyTyped

    private void empKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(emp.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_empKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu mn=new menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MenuSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSelActionPerformed
        int seleccion= tablas.getSelectedRow();
        if(seleccion>=0){
            depa.setText(tablas.getValueAt(seleccion, 0).toString());
            name.setText(tablas.getValueAt(seleccion, 1).toString());
            emp.setText(tablas.getValueAt(seleccion, 2).toString());
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE LOS DATOS");
        }
    }//GEN-LAST:event_MenuSelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            PreparedStatement pst=cn.prepareStatement("INSERT INTO departamento(id_dept, nombre_dept, no_emp)VALUES(?,?,?)");
            pst.setString(1, depa.getText());
            pst.setString(2, name.getText());
            pst.setString(3, emp.getText());
            pst.executeUpdate();
            mostrarDatos(" ");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        depa.setText(" ");
        name.setText(" ");
        emp.setText(" "); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
            PreparedStatement prep=cn.prepareStatement("UPDATE departamento SET nombre_dept='"+name.getText()+"', no_emp='"+emp.getText()+"' WHERE id_dept='"+depa.getText()+"'");
            prep.executeUpdate();
            mostrarDatos(" ");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            PreparedStatement pre=cn.prepareStatement("DELETE FROM departamento WHERE id_dept='"+depa.getText()+"'");
            pre.executeUpdate();
            mostrarDatos(" ");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mostrarDatos(search.getText());
        search.setText(" ");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       mostrarDatos(" ");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void MenuEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliActionPerformed
       int fila=tablas.getSelectedRow();
        String seleccion="";
        seleccion=tablas.getValueAt(fila, 0).toString();
        try{
            PreparedStatement prep=cn.prepareStatement("DELETE FROM departamento WHERE id_dept='"+seleccion+"'");
            prep.executeUpdate();
            mostrarDatos("");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_MenuEliActionPerformed

    private void MenuModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModActionPerformed
        try{
            PreparedStatement pre=cn.prepareStatement("UPDATE departamento SET nombre_dept='"+name.getText()+"', no_emp='"+emp.getText()+"' WHERE id_dept='"+depa.getText()+"'");
            pre.executeUpdate();
            mostrarDatos(" ");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_MenuModActionPerformed

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
            java.util.logging.Logger.getLogger(departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(departamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuEli;
    private javax.swing.JMenuItem MenuMod;
    private javax.swing.JMenuItem MenuSel;
    private javax.swing.JTextField depa;
    private javax.swing.JTextField emp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField search;
    private javax.swing.JTable tablas;
    // End of variables declaration//GEN-END:variables
    conectar conecta=new conectar();    
    Connection cn =conecta.conect();
    
     private void Limpiar() {
        depa.setText(" ");
        name.setText(" ");
        emp.setText(" ");
    }
    
}