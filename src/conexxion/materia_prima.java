package conexxion;

import com.itextpdf.text.BadElementException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class materia_prima extends javax.swing.JFrame {

    public materia_prima() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarDatos(" ");
    }
    
    void mostrarDatos(String valor){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("id_mp");
        modelo.addColumn("nombre");
        modelo.addColumn("cantidad");
        modelo.addColumn("precio");
        modelo.addColumn("proveedor");
        Tabla1.setModel(modelo);
         
        String sql=" ";
        if(valor.equals(" ")){
            sql="SELECT * FROM materia_prima";
        }else{
            sql="SELECT * FROM materia_prima where id_mp ='"+valor+"'";
        }
        String [ ] datos=new String[5];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                datos [0]=rs.getString(1);
                datos [1]=rs.getString(2);
                datos [2]=rs.getString(3);
                datos [3]=rs.getString(4);
                datos [4]=rs.getString(5);
                modelo.addRow(datos);
            }
            Tabla1.setModel(modelo);
        }catch(SQLException e){
        System.out.println("ERROR: "+e);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MenuEl = new javax.swing.JMenuItem();
        MenuMod = new javax.swing.JMenuItem();
        MenuSel = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        id_mp = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        proveedor = new javax.swing.JLabel();
        one1 = new javax.swing.JTextField();
        two2 = new javax.swing.JTextField();
        three3 = new javax.swing.JTextField();
        four4 = new javax.swing.JTextField();
        five5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        busc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        MenuEl.setText("ELIMINAR");
        MenuEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuElActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuEl);

        MenuMod.setText("MODIFICAR");
        MenuMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuMod);

        MenuSel.setText("SELECCIONAR");
        MenuSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSelActionPerformed(evt);
            }
        });
        jPopupMenu1.add(MenuSel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MATERIA PRIMA");

        id_mp.setText("id_mp");

        nombre.setText("nombre");

        cantidad.setText("cantidad");

        precio.setText("precio");

        proveedor.setText("proveedor");

        one1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one1ActionPerformed(evt);
            }
        });
        one1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                one1KeyTyped(evt);
            }
        });

        two2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two2ActionPerformed(evt);
            }
        });
        two2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                two2KeyTyped(evt);
            }
        });

        three3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three3ActionPerformed(evt);
            }
        });
        three3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                three3KeyTyped(evt);
            }
        });

        four4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                four4KeyTyped(evt);
            }
        });

        five5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                five5KeyTyped(evt);
            }
        });

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Tabla1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(Tabla1);

        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("atras");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("ELIMINAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("LIMPIAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        busc.setForeground(new java.awt.Color(0, 0, 255));
        busc.setText("BUSCAR");
        busc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscActionPerformed(evt);
            }
        });

        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("MOSTRAR DATOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("PDF");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_mp)
                                    .addComponent(nombre)
                                    .addComponent(cantidad)
                                    .addComponent(precio)
                                    .addComponent(proveedor))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(two2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(three3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(four4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(five5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(one1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButton3))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 114, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_mp)
                    .addComponent(one1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(two2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad)
                    .addComponent(three3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio)
                    .addComponent(four4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedor)
                    .addComponent(five5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busc)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void one1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_one1ActionPerformed

    private void two2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_two2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            PreparedStatement pst=cn.prepareStatement("INSERT INTO materia_prima(id_mp,nombre,cantidad,precio,proveedor)VALUES(?,?,?,?,?)");
            pst.setString(1, one1.getText());
            pst.setString(2, two2.getText());
            pst.setString(3, three3.getText());
            pst.setString(4, four4.getText());
            pst.setString(5, five5.getText());
            pst.executeUpdate();
            mostrarDatos(" ");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        one1.setText(" ");
        two2.setText(" ");
        three3.setText(" ");
        four4.setText(" ");
        five5.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        menu mn=new menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            PreparedStatement prep=cn.prepareStatement("UPDATE materia_prima SET nombre ='"+two2.getText()+
                    "', cantidad ='"+three3.getText()+"', precio ='"+four4.getText()+"', proveedor ='"+five5.getText()+"' WHERE id_mp = '"+one1.getText()+"'");
            prep.executeUpdate();
            mostrarDatos(" ");
            //JOptionPane.showMessageDialog(null, "Datos actualizados");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            PreparedStatement pre=cn.prepareStatement("DELETE FROM materia_prima WHERE id_mp='"+one1.getText()+"'");
            pre.executeUpdate();
            mostrarDatos(" ");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void two2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_two2KeyTyped
        char valiLtras=evt.getKeyChar();
        int limit=15;
        if(Character.isDigit(valiLtras)){
            JOptionPane.showMessageDialog(null, "Solo se aceptan letras");
        }
        if(two2.getText().length()==limit){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Exceso de caracteres"+limit);
        }
    }//GEN-LAST:event_two2KeyTyped

    private void five5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_five5KeyTyped
        int limitee=14;
        if(five5.getText().length()==limitee){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de caracteres permitidos"+limitee);
        }
    }//GEN-LAST:event_five5KeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void one1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_one1KeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(five5.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_one1KeyTyped

    private void three3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_three3KeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(three3.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_three3KeyTyped

    private void four4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_four4KeyTyped
        char validar=evt.getKeyChar();
        int limite=10;
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa solo Numeros");
        }
        if(four4.getText().length()==limite){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Se ha excedido de numero permitidos");
        }
    }//GEN-LAST:event_four4KeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void buscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscActionPerformed
        mostrarDatos(buscar.getText());
        buscar.setText("");
    }//GEN-LAST:event_buscActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDatos(" ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MenuElActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuElActionPerformed
        int fila=Tabla1.getSelectedRow();
        String seleccion="";
        seleccion=Tabla1.getValueAt(fila, 0).toString();
        try{
            PreparedStatement prep=cn.prepareStatement("DELETE FROM materia_prima WHERE id_mp='"+seleccion+"'");
            prep.executeUpdate();
            mostrarDatos("");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_MenuElActionPerformed

    private void MenuModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModActionPerformed
        try{
            PreparedStatement pre=cn.prepareStatement("UPDATE materia_prima SET nombre='"+two2.getText()+"', cantidad='"+three3.getText()+"', precio ='"+four4.getText()+"', proveedor ='"+five5.getText()+"' WHERE id_mp = '"+one1.getText()+"'");
            pre.executeUpdate();
            mostrarDatos(" ");
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_MenuModActionPerformed

    private void MenuSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSelActionPerformed
        int seleccion= Tabla1.getSelectedRow();
        if(seleccion>=0){
            one1.setText(Tabla1.getValueAt(seleccion, 0).toString());
            two2.setText(Tabla1.getValueAt(seleccion, 1).toString());
            three3.setText(Tabla1.getValueAt(seleccion, 2).toString());
            four4.setText(Tabla1.getValueAt(seleccion, 3).toString());
            five5.setText(Tabla1.getValueAt(seleccion, 4).toString());
        }else{
            JOptionPane.showMessageDialog(null, "SELECCIONE LOS DATOS");
        }
    }//GEN-LAST:event_MenuSelActionPerformed

    private void three3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_three3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //generar pdf
        Document doc=new Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream("/Users/Gonzalez/Documents/PDF Document/Materia Prima.pdf"));
            Image cabeza=Image.getInstance("/Users/Gonzalez/Documents/PDF Document/materia.jpg");
            cabeza.scaleToFit(200,400);
            cabeza.setAlignment(Chunk.CREATIONDATE);
            Paragraph tex1=new Paragraph();
            tex1.setAlignment(Paragraph.ALIGN_CENTER);
            tex1.setFont(FontFactory.getFont("Arial",20,Font.BOLD,BaseColor.BLUE));
            tex1.add("\nReporte de Materia Prima\n 'Stark Industries'\n");
            Paragraph tex2=new Paragraph();
            tex2.setAlignment(Paragraph.ALIGN_RIGHT);
            tex2.setFont(FontFactory.getFont("Arial",13,Font.BOLD,BaseColor.BLACK));
            tex2.add("\nJocotitlan, México, Viernes 04 de Junio de 2021.\n");
            Paragraph tex3=new Paragraph();
            tex3.setAlignment(Paragraph.CREATIONDATE);
            tex3.setFont(FontFactory.getFont("Arial",18,Font.BOLD,BaseColor.BLACK));
            tex3.add("\nSaulo Gonzalez Lopez- IC-401\n\n");
            
            
            doc.open();
            doc.add(cabeza);
            doc.add(tex1);
            doc.add(tex2);
            doc.add(tex3);
            
            PdfPTable tabla=new PdfPTable(5);
            tabla.addCell("ID_MP");
            tabla.addCell("NOMBRE");
            tabla.addCell("CANTIDAD");
            tabla.addCell("PRECIO");
            tabla.addCell("PROVEEDOR");
            
            PreparedStatement pre=cn.prepareStatement("SELECT * FROM materia_prima");
            ResultSet res=pre.executeQuery();
            if(res.next()){
                do{
                    tabla.addCell(res.getString(1));
                    tabla.addCell(res.getString(2));
                    tabla.addCell(res.getString(3));
                    tabla.addCell(res.getString(4));
                    tabla.addCell(res.getString(5));
                }while(res.next());
                doc.add(tabla);
            }
            doc.close();
            JOptionPane.showMessageDialog(null, "Reporte creado con exito");
            
        }catch(DocumentException | HeadlessException | FileNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        } catch (IOException ex) {
            Logger.getLogger(materia_prima.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(materia_prima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(materia_prima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(materia_prima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(materia_prima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new materia_prima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuEl;
    private javax.swing.JMenuItem MenuMod;
    private javax.swing.JMenuItem MenuSel;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton busc;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel cantidad;
    private javax.swing.JTextField five5;
    private javax.swing.JTextField four4;
    private javax.swing.JLabel id_mp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField one1;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel proveedor;
    private javax.swing.JTextField three3;
    private javax.swing.JTextField two2;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        one1.setText(" ");
        two2.setText(" ");
        three3.setText(" ");
        four4.setText(" ");
        five5.setText(" ");
    }
    conectar conecta=new conectar();    
    Connection cn =conecta.conect();
}