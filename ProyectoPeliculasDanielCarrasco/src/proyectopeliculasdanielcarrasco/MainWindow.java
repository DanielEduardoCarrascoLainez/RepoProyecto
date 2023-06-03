/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectopeliculasdanielcarrasco;

public class MainWindow extends javax.swing.JFrame {
    

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        
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

        PeliculaDelGatoFrame = new javax.swing.JFrame();
        jPPGato = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_derecha = new javax.swing.JButton();
        framePRINCIPAL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPPGato.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Estas iniciando tu busqueda de los deseos, que camino deseas seguir?");

        btn_derecha.setBackground(new java.awt.Color(102, 102, 102));
        btn_derecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_derecha.setForeground(new java.awt.Color(255, 255, 255));
        btn_derecha.setText("Derecha");

        javax.swing.GroupLayout jPPGatoLayout = new javax.swing.GroupLayout(jPPGato);
        jPPGato.setLayout(jPPGatoLayout);
        jPPGatoLayout.setHorizontalGroup(
            jPPGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPGatoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPPGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPPGatoLayout.setVerticalGroup(
            jPPGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPGatoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(btn_derecha, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        javax.swing.GroupLayout PeliculaDelGatoFrameLayout = new javax.swing.GroupLayout(PeliculaDelGatoFrame.getContentPane());
        PeliculaDelGatoFrame.getContentPane().setLayout(PeliculaDelGatoFrameLayout);
        PeliculaDelGatoFrameLayout.setHorizontalGroup(
            PeliculaDelGatoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPGato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PeliculaDelGatoFrameLayout.setVerticalGroup(
            PeliculaDelGatoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPGato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        framePRINCIPAL.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Pictures\\ProyectoGatoMario\\netflix (1).png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Bienvenidos a Interaflix");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Pictures\\ProyectoGatoMario\\Puss_in_Boots_The_Last_Wish_poster.jpg")); // NOI18N
        jButton1.setBorderPainted(false);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Daniel\\Pictures\\ProyectoGatoMario\\The_Super_Mario_Bros._Movie_poster.jpg")); // NOI18N
        jButton2.setBorderPainted(false);

        javax.swing.GroupLayout framePRINCIPALLayout = new javax.swing.GroupLayout(framePRINCIPAL);
        framePRINCIPAL.setLayout(framePRINCIPALLayout);
        framePRINCIPALLayout.setHorizontalGroup(
            framePRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePRINCIPALLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(framePRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(framePRINCIPALLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(framePRINCIPALLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        framePRINCIPALLayout.setVerticalGroup(
            framePRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framePRINCIPALLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(framePRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(framePRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePRINCIPAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePRINCIPAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame PeliculaDelGatoFrame;
    private javax.swing.JButton btn_derecha;
    private javax.swing.JPanel framePRINCIPAL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPPGato;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
