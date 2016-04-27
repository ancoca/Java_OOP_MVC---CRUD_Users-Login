/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.module.login.view;

import framework.module.login.model.classes.language.Language_login;

/**
 *
 * @author angel
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        lblusuarios = new javax.swing.JLabel();
        lbladministrador = new javax.swing.JLabel();
        lblcliente = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblconfiguracion = new javax.swing.JLabel();
        lblajustes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblinicios = new javax.swing.JLabel();
        lblinicio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        acept = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        new_user = new javax.swing.JLabel();
        error_login = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.BorderLayout());

        lbltitulo.setBackground(java.awt.Color.white);
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framework/img/titulo.JPG"))); // NOI18N
        jPanel2.add(lbltitulo, java.awt.BorderLayout.CENTER);
        jPanel2.add(jSeparator2, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(java.awt.Color.white);

        lblusuarios.setFont(new java.awt.Font("Purisa", 3, 15)); // NOI18N
        lblusuarios.setForeground(java.awt.Color.blue);
        lblusuarios.setText(Language_login.getInstance().getProperty("users"));

        lbladministrador.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        lbladministrador.setForeground(java.awt.Color.cyan);
        lbladministrador.setText(Language_login.getInstance().getProperty("administrator"));
        lbladministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladministradorMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbladministradorMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbladministradorMouseEntered(evt);
            }
        });

        lblcliente.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        lblcliente.setForeground(java.awt.Color.cyan);
        lblcliente.setText(Language_login.getInstance().getProperty("client"));
        lblcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblclienteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblclienteMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblclienteMouseEntered(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        lblusuario.setForeground(java.awt.Color.cyan);
        lblusuario.setText(Language_login.getInstance().getProperty("user"));
        lblusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblusuarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblusuarioMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblusuarioMouseEntered(evt);
            }
        });

        lblconfiguracion.setFont(new java.awt.Font("Purisa", 3, 15)); // NOI18N
        lblconfiguracion.setForeground(java.awt.Color.blue);
        lblconfiguracion.setText(Language_login.getInstance().getProperty("configuration"));

        lblajustes.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        lblajustes.setForeground(java.awt.Color.cyan);
        lblajustes.setText(Language_login.getInstance().getProperty("setting"));
        lblajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblajustesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblajustesMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblajustesMouseEntered(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblinicios.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        lblinicios.setForeground(java.awt.Color.blue);
        lblinicios.setText(Language_login.getInstance().getProperty("start"));

        lblinicio.setFont(new java.awt.Font("Purisa", 0, 15)); // NOI18N
        lblinicio.setForeground(java.awt.Color.cyan);
        lblinicio.setText(Language_login.getInstance().getProperty("start"));
        lblinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblinicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblinicioMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblinicioMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblinicios)
                    .addComponent(lblusuarios)
                    .addComponent(lblconfiguracion)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblinicio)
                            .addComponent(lblcliente)
                            .addComponent(lbladministrador)
                            .addComponent(lblusuario)
                            .addComponent(lblajustes))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblinicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblinicio)
                .addGap(18, 18, 18)
                .addComponent(lblusuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbladministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusuario)
                .addGap(18, 18, 18)
                .addComponent(lblconfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblajustes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel3.setBackground(java.awt.Color.white);

        jLabel1.setText(Language_login.getInstance().getProperty("DNI")+": ");

        jLabel2.setText(Language_login.getInstance().getProperty("password")+": ");

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Log in");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framework/module/login/model/img/login.jpg"))); // NOI18N

        acept.setText(Language_login.getInstance().getProperty("acept"));

        cancel.setText(Language_login.getInstance().getProperty("cancel"));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        new_user.setFont(new java.awt.Font("Purisa", 0, 14)); // NOI18N
        new_user.setForeground(java.awt.Color.cyan);
        new_user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        new_user.setText(Language_login.getInstance().getProperty("new_user"));
        new_user.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        error_login.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(acept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(cancel))
                            .addComponent(error_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(new_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNI)
                            .addComponent(txtpass))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acept)
                    .addComponent(cancel))
                .addContainerGap())
            .addComponent(jSeparator3)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1233, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblajustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblajustesMouseEntered
       
    }//GEN-LAST:event_lblajustesMouseEntered

    private void lblajustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblajustesMouseExited
        
    }//GEN-LAST:event_lblajustesMouseExited

    private void lblusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblusuarioMouseEntered
        
    }//GEN-LAST:event_lblusuarioMouseEntered

    private void lblusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblusuarioMouseExited
        
    }//GEN-LAST:event_lblusuarioMouseExited

    private void lblclienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclienteMouseEntered
        
    }//GEN-LAST:event_lblclienteMouseEntered

    private void lblclienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclienteMouseExited
        
    }//GEN-LAST:event_lblclienteMouseExited

    private void lbladministradorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladministradorMouseEntered
        
    }//GEN-LAST:event_lbladministradorMouseEntered

    private void lbladministradorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladministradorMouseExited
        
    }//GEN-LAST:event_lbladministradorMouseExited

    private void lbladministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladministradorMouseClicked
        
    }//GEN-LAST:event_lbladministradorMouseClicked

    private void lblajustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblajustesMouseClicked
        
    }//GEN-LAST:event_lblajustesMouseClicked

    private void lblclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclienteMouseClicked
        
    }//GEN-LAST:event_lblclienteMouseClicked

    private void lblusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblusuarioMouseClicked
        
    }//GEN-LAST:event_lblusuarioMouseClicked

    private void lblinicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinicioMouseEntered
        
    }//GEN-LAST:event_lblinicioMouseEntered

    private void lblinicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinicioMouseExited
        
    }//GEN-LAST:event_lblinicioMouseExited

    private void lblinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblinicioMouseClicked
        
    }//GEN-LAST:event_lblinicioMouseClicked

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton acept;
    public static javax.swing.JButton cancel;
    public static javax.swing.JLabel error_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JLabel lbladministrador;
    public static javax.swing.JLabel lblajustes;
    public static javax.swing.JLabel lblcliente;
    public static javax.swing.JLabel lblconfiguracion;
    public static javax.swing.JLabel lblinicio;
    public static javax.swing.JLabel lblinicios;
    public static javax.swing.JLabel lbltitulo;
    public static javax.swing.JLabel lblusuario;
    public static javax.swing.JLabel lblusuarios;
    public static javax.swing.JLabel new_user;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables

}