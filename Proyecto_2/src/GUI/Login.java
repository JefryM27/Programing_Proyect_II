/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.*;
import java.util.*;
import javax.swing.*;
import org.json.simple.*;
import org.json.simple.parser.*;

/**
 *
 * @author Bravo
 */
public class Login extends javax.swing.JFrame {

    private final String CLIENTES_JSON_FILE = "cliente.json";
    private final List<String> nombresAdministradores = Arrays.asList("Carlos", "Jefry", "Johana", "Alisson", "Jose", "Cristopher");
    private final List<String> contraseñasAdministradores = Arrays.asList("ADMINPASS1", "ADMINPASS2", "ADMINPASS3");
    private final List<String> contraseñasClientes = Arrays.asList("CHINOTICO1", "CHINOTICO2", "CHINOTICO3");

   
    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    //here we validate the correct date of the clients with a boolean
    private boolean verificarCredenciales(String username, String password) {
        if (contraseñasAdministradores.contains(password) && nombresAdministradores.contains(username)) {
            return true;
        }

        if (contraseñasClientes.contains(password)) {
            JSONParser parser = new JSONParser();
            //here we reed the json fle
            try (FileReader reader = new FileReader(CLIENTES_JSON_FILE)) {
                JSONArray clientesArray = (JSONArray) parser.parse(reader);
                //Create a json object with a array where we get the client name
                for (Object obj : clientesArray) {
                    JSONObject cliente = (JSONObject) obj;
                    String jsonUsername = (String) cliente.get("nombre");

                    if (username.equals(jsonUsername)) {
                        return true; // Las credenciales son válidas para clientes
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return false; // Las credenciales no son válidas
    }

    public String getNombreUsuario() {
        return txtUsuario.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/Puerta.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHINO TICO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(27, 27, 27))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/loginmanager_10029.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/candado.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel4.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 200, -1));
        jPanel4.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 200, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnLogin)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsuario.getText();
        String password = txtContraseña.getText();
        // Check the correct date
        if (verificarCredenciales(username, password)) {
            if (contraseñasAdministradores.contains(password)) {
                Administrador adminFrame = new Administrador();
                adminFrame.setVisible(true);
                adminFrame.setResizable(false);
                adminFrame.setLocationRelativeTo(null);
                dispose();
            }else{
                Usuario userFrame = new Usuario(this);
                userFrame.setVisible(true);
                userFrame.setResizable(false);
                userFrame.setLocationRelativeTo(null);
                dispose(); // close the actual login
            }
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
