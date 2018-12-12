package quizzwinner;
/**
 * Project: QuizzWinner
 * 
 * Description: Quizz dans de nombreux dommaine en francais.
 * 
 * @author Salah Eddine Bentayeb
 * @Date 1 Novembre 2018
 * 
 */
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JFrame;
import javax.swing.SwingWorker;

public class Module extends JFrame implements DocumentListener {

    /**
     *
     */
    
    public Module() {
        File file = new File("src/Resource/HalasLOGO.png");
        String absolutePath = file.getAbsolutePath();
		setIconImage(new ImageIcon(absolutePath).getImage());
         initComponents();
         jTextField1.getDocument().addDocumentListener(this);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QuizzWinner - Categorie");
        setMinimumSize(new java.awt.Dimension(600, 488));
        setPreferredSize(new java.awt.Dimension(600, 488));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONNAISANCE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 228, 110, 80);

        jButton2.setBackground(new java.awt.Color(30, 37, 81));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PLAY");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(435, 310, 73, 23);

        jButton3.setBackground(new java.awt.Color(30, 37, 81));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("PLAY");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 140, 73, 23);

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jTextField1.setMinimumSize(new java.awt.Dimension(7, 10));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 410, 170, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FOOTBALL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 70, 80, 60);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Your Name :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 380, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MEDCINE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(285, 218, 80, 100);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CULTURE GENERAL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(420, 228, 130, 80);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CINEMA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 40, 90, 110);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ETUDE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 70, 80, 60);

        jButton5.setBackground(new java.awt.Color(30, 37, 81));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("PLAY");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(435, 140, 73, 23);

        jButton4.setBackground(new java.awt.Color(30, 37, 81));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PLAY");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(273, 140, 73, 23);

        jButton6.setBackground(new java.awt.Color(30, 37, 81));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("PLAY");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setEnabled(false);
        getContentPane().add(jButton6);
        jButton6.setBounds(110, 310, 73, 23);

        jButton7.setBackground(new java.awt.Color(30, 37, 81));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("PLAY");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setEnabled(false);
        getContentPane().add(jButton7);
        jButton7.setBounds(273, 310, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/categories.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 460);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
       File file = new File("src/Resource/QuestionBank.txt"); //Post the link of Question text
       String absolutePath = file.getAbsolutePath();
       LORD(absolutePath,jTextField1.getText());
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.setVisible(false);
       File file = new File("src/Resource/QuestionFoot.txt"); //Post the link of Question text
       String absolutePath = file.getAbsolutePath();
       LORD(absolutePath,jTextField1.getText());
  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
       File file = new File("src/Resource/QuestionGenerale.txt"); //Post the link of Question text
       String absolutePath = file.getAbsolutePath();
       LORD(absolutePath,jTextField1.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       this.setVisible(false);
       File file = new File("src/Resource/QuestionCinema.txt"); //Post the link of Question text
       String absolutePath = file.getAbsolutePath();
       LORD(absolutePath,jTextField1.getText());
    }//GEN-LAST:event_jButton5ActionPerformed
        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Module.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        java.awt.EventQueue.invokeLater(Module::new);
    }
     
    @Override
    public void insertUpdate(DocumentEvent e) {     
            if(jTextField1.getText().length() >= 5 && jTextField1.getText().length() <=13){
               
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jButton5.setEnabled(true);
            jButton6.setEnabled(true);
            jButton7.setEnabled(true);
        
            }
        }
     
    @Override
    public void removeUpdate(DocumentEvent e) {     
           if(jTextField1.getText().length() < 5 || jTextField1.getText().length() > 13){
                jButton2.setEnabled(false);
          
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton7.setEnabled(false);  
        }
        }
         
    @Override
    public void changedUpdate(DocumentEvent e) {
       
        
    }

    public static void LORD(String lien,String name){
      
        new SwingWorker(){
            @Override
            protected Object doInBackground() throws Exception {
               return new QuizzForUser(lien,name);
            }
            
        }.execute();
    }
    
    
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
