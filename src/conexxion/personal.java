
package conexxion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class personal extends javax.swing.JFrame {

   
    public personal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Datoc(" ");
    }

    void Datoc(String valor){
        DefaultTableModel models=new DefaultTableModel();
        models.addColumn("id_per");
        models.addColumn("nombre");
        models.addColumn("ap_pat");
        models.addColumn("ap_mat");
        models.addColumn("edad");
        models.addColumn("departamento");
        models.addColumn("puesto");
        models.addColumn("domicilio");
        models.addColumn("telefono");
        models.addColumn("turno");
        models.addColumn("fecha_nac");
        tablas.setModel(models);
        
        String sql=" ";
        if(valor.equals(" ")){
            sql="SELECT * FROM personal";
        }else{
            sql="SELECT * FROM personal where id_per ='"+valor+"'";
        }
        String [ ] datos=new String[11];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                datos [0]=rs.getString(1);
                datos [1]=rs.getString(2);
                datos [2]=rs.getString(3);
                datos [3]=rs.getString(4);
                datos [4]=rs.getString(5);
                datos [5]=rs.getString(6);
                datos [6]=rs.getString(7);
                datos [7]=rs.getString(8);
                datos [8]=rs.getString(9);
                datos [9]=rs.getString(10);
                datos [10]=rs.getString(11);
                models.addRow(datos);
            }
            tablas.setModel(models);
        }catch(Exception e){
        System.out.println("ERROR: "+e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MenuE = new javax.swing.JMenuItem();
        MenuMo = new javax.swing.JMenuItem();
        MenuSel = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablas = new javax.swing.JTable();
        persona = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        pat = new javax.swing.JTextField();
        mat = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        depa = new javax.swing.JTextField();
        puesto = new javax.swing.JTextField();
        dom = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        turn = new javax.swing.JTextField();
        nac = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        busca = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        MenuE.setText("Eliminar");
        MenuE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuE);

        MenuMo.setText("Modificar");
        MenuMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuMo);

        MenuSel.setText("Seleccionar");
        MenuSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSelActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuSel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PERSONAL");

        jLabel2.setText("id_per");

        jLabel3.setText("nombre");

        jLabel4.setText("ap_pat");

        jLabel5.setText("ap_mat");

        jLabel6.setText("edad");

        jLabel7.setText("departamento");

        jLabel8.setText("puesto");

        jLabel9.setText("domicilio");

        jLabel10.setText("telefono");

        jLabel11.setText("turno");

        jLabel12.setText("fecha_nac");

        tablas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablas.setColumnSelectionAllowed(true);
        tablas.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tablas);

        persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personaActionPerformed(evt);
            }
        });
        persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                personaKeyTyped(evt);
            }
        });

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        pat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patKeyTyped(evt);
            }
        });

        mat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                matKeyTyped(evt);
            }
        });

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });

        depa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                depaKeyTyped(evt);
            }
        });

        puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                puestoKeyTyped(evt);
            }
        });

        dom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                domKeyTyped(evt);
            }
        });

        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });

        turn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                turnKeyTyped(evt);
            }
        });

        nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("GUARDAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("ACTUALIZAR");
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
        jButton5.setText("LIMIPIAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(255, 51, 51));
        jButton6.setText("atras");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("BUSCAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("MOSTRAR DATOS");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(4, 4, 4))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(persona)
                            .addComponent(name)
                            .addComponent(pat)
                            .addComponent(mat)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depa)
                            .addComponent(puesto)
                            .addComponent(dom)
                            .addComponent(tel)
                            .addComponent(turn)
                            .addComponent(nac, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(busca)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(depa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(dom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personaActionPerformed

    private void nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
            PreparedStatement pst=cn.prepareStatement("INSERT INTO personal(id_per,nombre,ap_pat,ap_mat,edad,departamento,puesto,domicilio,telefono,turno,fecha_nac)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, persona.getText());
            pst.setString(2, name.getText());
            pst.setString(3, pat.getText());
            pst.setString(4, mat.getText());
            pst.setString(5, age.getText());
            pst.setString(6, depa.getText());
            pst.setString(7, puesto.getText());
            pst.setString(8, dom.getText());
            pst.setString(9, tel.getText());
            pst.setString(10, turn.getText());
            pst.setString(11, nac.getText());
            pst.executeUpdate();
            Datoc(" ");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        persona.setText(" ");
        name.setText(" ");
        pat.setText(" ");
        mat.setText(" ");
        age.setText(" ");
        depa.setText(" ");
        puesto.setText(" ");
        dom.setText(" ");
        tel.setText(" ");
        turn.setText(" ");
        nac.setText(" ");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            PreparedStatement prep=cn.prepareStatement("UPDATE personal SET nombre='"+name.getText()+"', ap_pat='"+pat.getText()+"', ap_mat='"+mat.getText()+"', edad='"+age.getText()+"',departamento='"+depa.getText()+"',puesto='"+puesto.getText()+"',domicilio='"+dom.getText()+"',telefono='"+tel.getText()+"',turno='"+turn.getText()+"',fecha_nac='"+nac.getText()+"' WHERE id_per='"+persona.getText()+"'");
            prep.executeUpdate();
            Datoc(" ");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {

            PreparedStatement prep=cn.prepareStatement("UPDATE personal SET id_per='"+persona.getText()+"',nombre='"+name.getText()+"', ap_pat='"+pat.getText()+"', ap_mat='"+mat.getText()+"', edad='"+age.getText()+"',departamento='"+depa.getText()+"',puesto='"+puesto.getText()+"',domicilio='"+dom.getText()+"',telefono='"+tel.getText()+"',turno='"+turn.getText()+"' WHERE fecha_nac='"+nac.getText()+"'");
            prep.executeUpdate();
            Datoc(" ");
        } catch (SQLException e) {
        }
        persona.setText(" ");
        name.setText(" ");
        pat.setText(" ");
        mat.setText(" ");
        age.setText(" ");
        depa.setText(" ");
        puesto.setText(" ");
        dom.setText(" ");
        tel.setText(" ");
        turn.setText(" ");
        nac.setText(" ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         try{
            PreparedStatement pre=cn.prepareStatement("DELETE FROM personal WHERE id_per='"+persona.getText()+"'");
            pre.executeUpdate();
            Datoc(" ");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        menu mn=new menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void MenuEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEActionPerformed
        int fila=tablas.getSelectedRow();
        String seleccion="";
        seleccion=tablas.getValueAt(fila, 0).toString();
        try{
            PreparedStatement prep=cn.prepareStatement("DELETE FROM personal WHERE id_per='"+seleccion+"'");
            prep.executeUpdate();
            Datoc("");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_MenuEActionPerformed

    private void MenuMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMoActionPerformed
        int fila=tablas.getSelectedRow();
        String seleccion="";
        seleccion=tablas.getValueAt(fila, 0).toString();
        try{
            PreparedStatement prep=cn.prepareStatement("DELETE FROM personal WHERE id_per='"+seleccion+"'");
            prep.executeUpdate();
            Datoc("");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_MenuMoActionPerformed

    private void MenuSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSelActionPerformed
        int seleccion= tablas.getSelectedRow();
        if(seleccion>=0){
            persona.setText(tablas.getValueAt(seleccion, 0).toString());
            name.setText(tablas.getValueAt(seleccion, 1).toString());
            pat.setText(tablas.getValueAt(seleccion, 2).toString());
            mat.setText(tablas.getValueAt(seleccion, 3).toString());
            age.setText(tablas.getValueAt(seleccion, 4).toString());
            depa.setText(tablas.getValueAt(seleccion, 5).toString());
            puesto.setText(tablas.getValueAt(seleccion, 6).toString());
            dom.setText(tablas.getValueAt(seleccion, 7).toString());
            tel.setText(tablas.getValueAt(seleccion, 8).toString());
            turn.setText(tablas.getValueAt(seleccion, 9).toString());
            nac.setText(tablas.getValueAt(seleccion, 10).toString());
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE LOS DATOS");
        }
    }//GEN-LAST:event_MenuSelActionPerformed

    private void personaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personaKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(persona.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_personaKeyTyped

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(age.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_ageKeyTyped

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

    private void puestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_puestoKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(puesto.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_puestoKeyTyped

    private void domKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(dom.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_domKeyTyped

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(tel.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_telKeyTyped

    private void turnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_turnKeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(turn.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_turnKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        char valiLtras=evt.getKeyChar();
        int limit=25;
        if(Character.isDigit(valiLtras)){
            JOptionPane.showMessageDialog(null, "Solo se aceptan letras");
        }
        if(name.getText().length()==limit){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Exceso de caracteres"+limit);
        }
    }//GEN-LAST:event_nameKeyTyped

    private void patKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patKeyTyped
        char valiLtras=evt.getKeyChar();
        int limit=25;
        if(Character.isDigit(valiLtras)){
            JOptionPane.showMessageDialog(null, "Solo se aceptan letras");
        }
        if(pat.getText().length()==limit){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Exceso de caracteres"+limit);
        }
    }//GEN-LAST:event_patKeyTyped

    private void matKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matKeyTyped
char valiLtras=evt.getKeyChar();
        int limit=25;
        if(Character.isDigit(valiLtras)){
            JOptionPane.showMessageDialog(null, "Solo se aceptan letras");
        }
        if(mat.getText().length()==limit){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Exceso de caracteres"+limit);
        }        
    }//GEN-LAST:event_matKeyTyped

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Datoc(" ");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Datoc(busca.getText());
        busca.setText(" ");
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuE;
    private javax.swing.JMenuItem MenuMo;
    private javax.swing.JMenuItem MenuSel;
    private javax.swing.JTextField age;
    private javax.swing.JTextField busca;
    private javax.swing.JTextField depa;
    private javax.swing.JTextField dom;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mat;
    private javax.swing.JTextField nac;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pat;
    private javax.swing.JTextField persona;
    private javax.swing.JTextField puesto;
    private javax.swing.JTable tablas;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField turn;
    // End of variables declaration//GEN-END:variables
    private void Limpiar() {
        persona.setText(" ");
        name.setText(" ");
        pat.setText(" ");
        mat.setText(" ");
        age.setText(" ");
        depa.setText(" ");
        puesto.setText(" ");
        dom.setText(" ");
        tel.setText(" ");
        turn.setText(" ");
        nac.setText(" ");
    }
    conectar conecta=new conectar();    
    Connection cn =conecta.conect();
}