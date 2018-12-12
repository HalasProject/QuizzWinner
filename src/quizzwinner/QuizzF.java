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
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.HashMap;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public final class QuizzF extends JPanel {
	 
	private static String Question;
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
        private static String CorrectOption;
        public static JLabel jLabel2 = new JLabel();
    
        public QuizzF(String Question, String OptionA, String OptionB, String OptionC, String OptionD, String CorrectOption) {
           
                initComponents();  
		HashMap <String, JButton> buttons = new HashMap<>();
		
		this.setQuestion(Question);
		this.setOptionA(OptionA);
		this.setOptionB(OptionB);
		this.setOptionC(OptionC);
		this.setOptionD(OptionD);
		this.setCorrect(CorrectOption);
		
                jLabel1.setText(Question);
                A.setText(OptionA);
                B.setText(OptionB);
                C.setText(OptionC);
                D.setText(OptionD);
               
                jLabel2.setText(CorrectOption);
                
		buttons.put("A", A);
		buttons.put("B", B);
		buttons.put("C", C);
		buttons.put("D", D);
	
                
		customizeButtons(buttons);	
                
	
    }

        private static void customizeButtons(HashMap <String, JButton> buttons) {
		
		for(HashMap.Entry<String, JButton> entry: buttons.entrySet()) { 
			
    
			String Correct = jLabel2.getText();
			String name = entry.getKey();
			JButton b = entry.getValue();
                     
                                         
			b.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent event) {
					
					if(Correct.equals(name)){
                                           
						b.setBackground(Color.GREEN);
						QuizzForUser.incrementScore();	
					}
					
					else {
						b.setBackground(Color.RED);
					}
					
                                       

					QuizzForUser.setRun(false);
				}
			});
		}
                
                
	}
 
	public static String  getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOptionA() {
		return OptionA;
	}

	public void setOptionA(String optionA) {
		OptionA = optionA;
	}

	public String getOptionB() {
		return OptionB;
	}

	public void setOptionB(String optionB) {
		OptionB = optionB;
	}

	public String getOptionC() {
		return OptionC;
	}

	public void setOptionC(String optionC) {
		OptionC = optionC;
	}

	public String getOptionD() {
		return OptionD;
	}

	public void setOptionD(String optionD) {
		OptionD = optionD;
	}

	public static String getCorrect() {
		return CorrectOption;
	}

	public void setCorrect(String correct) {
		CorrectOption = correct;
	}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(600, 400));
        setName(""); // NOI18N
        setLayout(null);

        A.setBackground(new java.awt.Color(30, 37, 81));
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("Reponse 1");
        A.setToolTipText("");
        A.setBorder(new javax.swing.border.MatteBorder(null));
        A.setBorderPainted(false);
        A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A.setFocusPainted(false);
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        add(A);
        A.setBounds(192, 117, 240, 30);

        B.setBackground(new java.awt.Color(30, 37, 81));
        B.setForeground(new java.awt.Color(255, 255, 255));
        B.setText("Reponse 2");
        B.setToolTipText("");
        B.setBorder(new javax.swing.border.MatteBorder(null));
        B.setBorderPainted(false);
        B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B.setFocusPainted(false);
        add(B);
        B.setBounds(192, 167, 240, 30);

        C.setBackground(new java.awt.Color(30, 37, 81));
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("Reponse 3");
        C.setToolTipText("");
        C.setBorder(new javax.swing.border.MatteBorder(null));
        C.setBorderPainted(false);
        C.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C.setFocusPainted(false);
        add(C);
        C.setBounds(192, 213, 240, 30);

        D.setBackground(new java.awt.Color(30, 37, 81));
        D.setForeground(new java.awt.Color(255, 255, 255));
        D.setText("Reponse 4");
        D.setToolTipText("");
        D.setBorder(new javax.swing.border.MatteBorder(null));
        D.setBorderPainted(false);
        D.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        D.setFocusPainted(false);
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        add(D);
        D.setBounds(192, 262, 240, 30);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Internet tendent à reproduire le même extrait sans fin, ce qui fait de lipsum.com le seul vrai générateur de Lorem Ipsum.");
        jLabel1.setToolTipText("");
        jLabel1.setAutoscrolls(true);
        add(jLabel1);
        jLabel1.setBounds(40, 20, 530, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/quizz2.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 610, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}