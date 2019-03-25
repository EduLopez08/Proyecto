
package Sistema;
import Sistema.*;
import Sistema.Inicio;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.TableModel;
import Mysql.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edu Lopez
 */

public class MostrarDatos extends javax.swing.JFrame {

    /**
     * Creates new form Cramer
     */
    
    public MostrarDatos() {
        initComponents();
        setLocationRelativeTo(null);//Aparesca en el centro
        setResizable(false);//No maximizar tamaño
        eliminar.setVisible(false);
        actualizar.setVisible(false);
        modificar.setVisible(false);
        jLabel3.setVisible(false);
        jLabel7.setVisible(false);
        busca.setVisible(false);
        txtbuscar.setVisible(false);
        busca1.setVisible(false);
        txtbuscar1.setVisible(false);
        txtbuscar2.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jLabel4.setVisible(false);
        partido.setVisible(false);
        jornadass.setVisible(false);
        fecha.setVisible(false);
        elocal.setVisible(false);
        evisistante.setVisible(false);
        goll.setVisible(false);
        golv.setVisible(false);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBackground = new javax.swing.JPanel();
        jPSidePanel = new javax.swing.JPanel();
        jPinfo = new javax.swing.JPanel();
        jLInfo = new javax.swing.JLabel();
        jPOption = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Temporadas = new javax.swing.JComboBox<>();
        Jornadas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regresar = new javax.swing.JComboBox<>();
        eliminar = new javax.swing.JButton();
        busca = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        busqueda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtbuscar1 = new javax.swing.JTextField();
        busca1 = new javax.swing.JButton();
        txtbuscar2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        actualizar = new javax.swing.JButton();
        partido = new javax.swing.JTextField();
        jornadass = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        elocal = new javax.swing.JTextField();
        goll = new javax.swing.JTextField();
        golv = new javax.swing.JTextField();
        evisistante = new javax.swing.JTextField();
        nomestadios = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        jPred = new javax.swing.JPanel();
        jLwelcometo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPtop = new javax.swing.JPanel();
        jLbtnclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPBackground.setBackground(new java.awt.Color(38, 38, 38));
        jPBackground.setToolTipText("");
        jPBackground.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPBackgroundFocusLost(evt);
            }
        });
        jPBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPSidePanel.setBackground(new java.awt.Color(45, 44, 65));
        jPSidePanel.setToolTipText("");
        jPSidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPinfo.setBackground(new java.awt.Color(204, 204, 204));
        jPinfo.setToolTipText("Mas informacion sobre Mathnet Support");
        jPinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPinfoMousePressed(evt);
            }
        });

        jLInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/Info_15px.png"))); // NOI18N

        javax.swing.GroupLayout jPinfoLayout = new javax.swing.GroupLayout(jPinfo);
        jPinfo.setLayout(jPinfoLayout);
        jPinfoLayout.setHorizontalGroup(
            jPinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPinfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPinfoLayout.setVerticalGroup(
            jPinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPinfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPSidePanel.add(jPinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, 30));

        jPBackground.add(jPSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 40, 470));

        jPOption.setBackground(new java.awt.Color(75, 75, 75));
        jPOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jPOption.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Temporadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemporadasActionPerformed(evt);
            }
        });
        jPOption.add(Temporadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 150, 30));

        Jornadas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Jornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JornadasActionPerformed(evt);
            }
        });
        jPOption.add(Jornadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPOption.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 960, 170));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Jornada");
        jPOption.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Visitante");
        jPOption.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 50, 20));

        regresar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regresar", "Menu Principal" }));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPOption.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 103, 31));

        eliminar.setBackground(new java.awt.Color(204, 255, 255));
        eliminar.setForeground(new java.awt.Color(102, 255, 102));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/eliminar-una-pagina-en-blanco-icono-9103-32.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setMaximumSize(new java.awt.Dimension(50, 50));
        eliminar.setMinimumSize(new java.awt.Dimension(50, 50));
        eliminar.setName(""); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPOption.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 50, 50));

        busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/search.png"))); // NOI18N
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });
        jPOption.add(busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 40, 40));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        jPOption.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 90, -1));

        busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Datos de un solo equipo", "VS" }));
        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });
        jPOption.add(busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Temporada");
        jPOption.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        txtbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar1ActionPerformed(evt);
            }
        });
        jPOption.add(txtbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 90, -1));

        busca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/search.png"))); // NOI18N
        busca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busca1ActionPerformed(evt);
            }
        });
        jPOption.add(busca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 40, 40));
        jPOption.add(txtbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("VS");
        jPOption.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 30, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Nombre del Equipo");
        jPOption.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 110, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Local");
        jPOption.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 30, 20));

        actualizar.setBackground(new java.awt.Color(204, 255, 255));
        actualizar.setForeground(new java.awt.Color(102, 255, 102));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/actualizar-la-base-de-datos-icono-7326-32.png"))); // NOI18N
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPOption.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 50, 50));
        jPOption.add(partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 90, -1));
        jPOption.add(jornadass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, -1));
        jPOption.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 90, -1));
        jPOption.add(elocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 90, -1));
        jPOption.add(goll, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 90, -1));
        jPOption.add(golv, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 90, -1));
        jPOption.add(evisistante, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 90, -1));
        jPOption.add(nomestadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 90, -1));

        modificar.setBackground(new java.awt.Color(204, 255, 255));
        modificar.setForeground(new java.awt.Color(102, 255, 102));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/modificar-la-base-de-datos-icono-6748-32.png"))); // NOI18N
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPOption.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 50, 50));

        jPBackground.add(jPOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 960, 380));

        jPred.setBackground(new java.awt.Color(193, 44, 66));
        jPred.setToolTipText("");

        jLwelcometo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLwelcometo.setForeground(new java.awt.Color(255, 255, 255));
        jLwelcometo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLwelcometo.setText("Liga MX");

        jButton4.setText("iniciar sesion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPredLayout = new javax.swing.GroupLayout(jPred);
        jPred.setLayout(jPredLayout);
        jPredLayout.setHorizontalGroup(
            jPredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLwelcometo, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(jButton4))
        );
        jPredLayout.setVerticalGroup(
            jPredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPredLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLwelcometo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPredLayout.createSequentialGroup()
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPBackground.add(jPred, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 960, 60));

        jLbtnclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbtnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Images/Close Window_15px.png"))); // NOI18N
        jLbtnclose.setToolTipText("Cerrar? :'v");
        jLbtnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLbtncloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPtopLayout = new javax.swing.GroupLayout(jPtop);
        jPtop.setLayout(jPtopLayout);
        jPtopLayout.setHorizontalGroup(
            jPtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPtopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLbtnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPtopLayout.setVerticalGroup(
            jPtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbtnclose, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        jPBackground.add(jPtop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1023, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPinfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPinfoMousePressed
        JPanel jPNetwork = null;
        // TODO add your handling code here:
        resetColor(jPNetwork);
        JPanel jPAlgebra = null;
        resetColor(jPAlgebra);
        setColor(jPinfo);
    }//GEN-LAST:event_jPinfoMousePressed

    private void jLbtncloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbtncloseMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLbtncloseMousePressed

    private void jPBackgroundFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPBackgroundFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPBackgroundFocusLost

    private void TemporadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemporadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemporadasActionPerformed

    private void JornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JornadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JornadasActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String Administrador = "Edu Lopez";
        String password = "12345";
        String Admi_introducido="";
        String pass_introducido="";
        while(Admi_introducido.equals(Administrador)==false || pass_introducido.equals(password)==false){
            Admi_introducido=JOptionPane.showInputDialog("Introdusca el Nombre");
            pass_introducido=JOptionPane.showInputDialog("Introdusca la Contraseña");
        }
        JOptionPane.showMessageDialog(rootPane, " Bienvenido "+ Administrador);

      eliminar.setVisible(true);
      modificar.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_buscaActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_busquedaActionPerformed

    private void busca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busca1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_busca1ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_actualizarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_modificarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar1ActionPerformed
     void setColor(JPanel panel){
        panel.setBackground(new Color(204,204,204));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(240,240,240));
    }
    
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
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jornadas;
    private javax.swing.JComboBox<String> Temporadas;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton busca;
    private javax.swing.JButton busca1;
    private javax.swing.JComboBox<String> busqueda;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField elocal;
    private javax.swing.JTextField evisistante;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField goll;
    private javax.swing.JTextField golv;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbtnclose;
    private javax.swing.JLabel jLwelcometo;
    private javax.swing.JPanel jPBackground;
    private javax.swing.JPanel jPOption;
    private javax.swing.JPanel jPSidePanel;
    private javax.swing.JPanel jPinfo;
    private javax.swing.JPanel jPred;
    private javax.swing.JPanel jPtop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jornadass;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nomestadios;
    private javax.swing.JTextField partido;
    private javax.swing.JComboBox<String> regresar;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscar1;
    private javax.swing.JTextField txtbuscar2;
    // End of variables declaration//GEN-END:variables


}
