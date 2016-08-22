
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author pablo
 */
public class jugador1 extends javax.swing.JFrame {

    /**
     * Creates new form JuegoPc
     */
    public jugador1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(496, 628);
        setTitle("Ahorcado 1player vs Pc ");

        // btnNuevo.setEnabled(false);
    }
    //mis variables privadas 
    public JTextField letras[];
    public ImageIcon images[];
    private String[] palabrasAhorcadas; // vector de palabras
    private String palabraR;//la palabra al asar 
    private String[] palabraJuego;//es la palabra al azar separada en letras por casillero de vector
    private byte intentos = 0;
    public JLabel letrasBien [];

    ///private int bandera;
    //vector de imagenes 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtLetra = new javax.swing.JTextField();
        btnLetra = new javax.swing.JButton();
        txtPalabra = new javax.swing.JTextField();
        lblDibujo = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        txt01 = new javax.swing.JTextField();
        txt02 = new javax.swing.JTextField();
        txt03 = new javax.swing.JTextField();
        txt04 = new javax.swing.JTextField();
        txt05 = new javax.swing.JTextField();
        txt06 = new javax.swing.JTextField();
        txt07 = new javax.swing.JTextField();
        txt08 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setToolTipText("Ahorcado");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nueva jugada ");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnLetra.setText("validar letra");
        btnLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLetraActionPerformed(evt);
            }
        });

        txtPalabra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblDibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); // NOI18N

        btnStart.setText("Start ");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(40, 40, 40)
                        .addComponent(btnStart)
                        .addGap(69, 69, 69)
                        .addComponent(btnNuevo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLetra)
                                .addGap(47, 47, 47)
                                .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt03, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt04, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt05, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt06, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt07, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt08, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnStart)
                    .addComponent(btnSalir))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLetra)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt03, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt04, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt05, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt06, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt07, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt08, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDibujo)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // exits
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        btnStart.setEnabled(false);

        //INICIO EL Ramdom 
        int a;
        Random r = new Random();
        a = r.nextInt(9);
       

        //inicio mi vector 
        palabrasAhorcadas = new String[10];
        palabrasAhorcadas[0] = "perro";
        palabrasAhorcadas[1] = "gato";
        palabrasAhorcadas[2] = "leon";
        palabrasAhorcadas[3] = "elefante";
        palabrasAhorcadas[4] = "gallo";
        palabrasAhorcadas[5] = "lobo";
        palabrasAhorcadas[6] = "jaguar";
        palabrasAhorcadas[7] = "conejo";
        palabrasAhorcadas[8] = "ardilla";
        palabrasAhorcadas[9] = "cebra";

        palabraR = palabrasAhorcadas[a];
    String palabraOculta="";
        String[] palabraJuego = palabraR.split("");
        //oculto la palabra con asteriscos
        for (int i = 0; i < palabraJuego.length; i++) {
            palabraOculta = palabraOculta + "*";
          System.out.println(palabraOculta);
        }
        txtPalabra.setText(palabraOculta);

        //for de palabra del juego
        palabraJuego = palabraR.split("");
        for (int i = 0; i < palabraJuego.length; i++) {

            System.out.println(palabraJuego[i]);
        }
//txtPalabra.setText(palabraR);

    }//GEN-LAST:event_btnStartActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // vuelve al inicio
        //vuelve al inicio
        start c = new start();
        c.setVisible(true);
        jugador1.this.dispose();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLetraActionPerformed
        //decalracion de variables  
        String letra;
        letra = txtLetra.getText();
        int aciertos=0;
        images = new ImageIcon[9];
        images[0] = new ImageIcon(getClass().getResource("/images/0.jpg"));
        images[1] = new ImageIcon(getClass().getResource("/images/1.jpg"));
        images[2] = new ImageIcon(getClass().getResource("/images/2.jpg"));
        images[3] = new ImageIcon(getClass().getResource("/images/3.jpg"));
        images[4] = new ImageIcon(getClass().getResource("/images/4.jpg"));
        images[5] = new ImageIcon(getClass().getResource("/images/5.jpg"));
        images[6] = new ImageIcon(getClass().getResource("/images/6.jpg"));
        images[7] = new ImageIcon(getClass().getResource("/images/7.jpg"));
        images[8] = new ImageIcon(getClass().getResource("/images/8.jpg"));

         //inicio vector de letras
        letras = new JTextField[8];
        letras[0] = txt01;
        letras[1] = txt02;
        letras[2] = txt03;
        letras[3] = txt04;
        letras[4] = txt05;
        letras[5] = txt06;
        letras[6] = txt07;
        letras[7] = txt08;

        palabraJuego = palabraR.split("");
        for (int x = 0; x < palabraJuego.length; x++) {
           
            if (palabraJuego[x].equals(letra)) {
                System.out.println("esta");
               //txt[aciertos++].setText(palabraJuego);
                intentos = 0;
                aciertos=1;
               // this.txtPalabra.setText(palabraJuego[x]);
                
            }           
        }//prediste una vida 
        if (intentos == 0 || intentos == 1 || intentos == 2 || intentos == 3 || intentos == 4 || intentos == 5 || intentos == 6 || intentos == 7 || intentos == 8) {
            lblDibujo.setIcon(images[intentos++]);
            System.out.println(" no esta");
        } else {
            System.out.println(" perdiste ");

            perdiste x = new perdiste();
            x.setVisible(true);
            jugador1.this.dispose();
        }

        

    }//GEN-LAST:event_btnLetraActionPerformed

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
            java.util.logging.Logger.getLogger(jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jugador1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jugador1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLetra;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDibujo;
    private javax.swing.JTextField txt01;
    private javax.swing.JTextField txt02;
    private javax.swing.JTextField txt03;
    private javax.swing.JTextField txt04;
    private javax.swing.JTextField txt05;
    private javax.swing.JTextField txt06;
    private javax.swing.JTextField txt07;
    private javax.swing.JTextField txt08;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
