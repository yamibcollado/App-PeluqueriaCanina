
package com.mycompany.peluqueriacanina.interfazgrafica;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
    
    Controladora control=null;
   
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btmEliminar = new javax.swing.JButton();
        btmEditar = new javax.swing.JButton();
        btmEditar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        jLabel1.setText("Visualización de datos");

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        btmEliminar.setText("Eliminar");
        btmEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEliminarActionPerformed(evt);
            }
        });

        btmEditar.setText("Editar");
        btmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditarActionPerformed(evt);
            }
        });

        btmEditar1.setText("Atras");
        btmEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmEditar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btmEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btmEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btmEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEliminarActionPerformed
       
        //CONROLO QUE LA TABLA NO ESTE VACIA
        if(tablaMascotas.getRowCount()>0){
            //CONTROLO QUE SE HAYA SELECCIONADO UN REGISTRO
            if(tablaMascotas.getSelectedRow()!=-1){
                //OBTENGO LA ID DE LA MASCOTA A ELIMINAR
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                //LLAMO AL METODO BORRAR
                control.borrarMascota(num_cliente);
                
                //AVISO QUE BORRO BIEN
                mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de mascota");
                cargarTabla();
            }
            else{
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
            }
        } 
        else{
            mostrarMensaje("No selecciono masota", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btmEliminarActionPerformed

    private void btmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditarActionPerformed
       
        //CONROLO QUE LA TABLA NO ESTE VACIA
        if(tablaMascotas.getRowCount()>0){
            //CONTROLO QUE SE HAYA SELECCIONADO UN REGISTRO
            if(tablaMascotas.getSelectedRow()!=-1){
              
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
               
                ModificacionDatos pantallaModif = new ModificacionDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose();
            }
            else{
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
            }
        } 
        else{
            mostrarMensaje("No selecciono masota", "Error", "Error al eliminar");
        } 
    }//GEN-LAST:event_btmEditarActionPerformed

    private void btmEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmEditar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btmEditar1ActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane= new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    
    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){   //NOS PERMITE AGREGAR COLUMNAS Y SETEAR LA TABLA
            
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //establecemos nombres de las columnas
        String titulos[]={"num", "Nombre", "Color", "Raza", "Alergico",
        "At. Especial", "Dueñio", "Cel Dueñio"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos de la base de datos
        List <Mascota> listaMascotas = control.traerMascotas();
        
        //recorrer la lista y mostrar cada uno de los elementos de la tabla
        if(listaMascotas!=null){
           for(Mascota masco: listaMascotas){
               Object[] objeto ={masco.getNum_cliente(), masco.getNombreMascota(), masco.getColor(),
               masco.getRaza(), masco.getAlergico(), masco.getAtencion_especial(), masco.getDuenio().getNombre(), 
               masco.getDuenio().getCel_duenio()};
               
               modeloTabla.addRow(objeto);
           } 
        }
        
        tablaMascotas.setModel(modeloTabla);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmEditar;
    private javax.swing.JButton btmEditar1;
    private javax.swing.JButton btmEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    
}
