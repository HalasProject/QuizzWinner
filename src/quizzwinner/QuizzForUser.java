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
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Halas
 */
public class QuizzForUser {
    
        private static boolean run = false;
        private static int score = 0;
        
        private static final  ArrayList <Question> QuestionList = new ArrayList <Question>(); 
	private static final  ArrayList <QuizzF> panelList = new ArrayList <QuizzF>();
        
        private static final  GUI gameGUI = new GUI();
        private static final  JPanel content = new JPanel();
        private static final  CardLayout card = new CardLayout();
        private static String Lien;
        //private static final Timer timer = new Timer(2,);
    
    public QuizzForUser(String Lien,String name) throws InterruptedException{
       QuizzForUser.Lien = Lien;
       System.out.println("Ok");
       
       addToArray();
       buildPanel();
       playGamelopp();
       System.out.println("END");
       gameGUI.remove(content);
       Resultat fin = new Resultat(score,name,QuestionList.size());
       gameGUI.setLayout(new BorderLayout());
       gameGUI.add(fin, BorderLayout.CENTER);
       gameGUI.repaint();
       gameGUI.validate();
       
    }
    
    public static void addToArray() {
		content.setLayout(card);
	 	try {
			FileReader QuestionFile = new FileReader (Lien);	
			BufferedReader Reader = new BufferedReader(QuestionFile);
			FileReader LineReader = new FileReader(Lien);
			
			LineNumberReader LineNumber = new LineNumberReader(LineReader);	
			LineNumber.skip(Long.MAX_VALUE);                               // Not sure why this line here; ask someone
			int numQuestions = (LineNumber.getLineNumber() + 1) / 6;       // +1 because it starts counting at 0, divide by 6 because 6 lines per question
		         LineNumber.close();                                           
		
			for (int j=0; j < numQuestions; j++){ 
				Question NewQuestion = new Question(Reader.readLine(), Reader.readLine(), Reader.readLine(), Reader.readLine(), Reader.readLine(), Reader.readLine());
				QuestionList.add(NewQuestion);
                              
			}
			
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, "We have encountered an error. Please confirm that the QuestionFile has not been removed from the game directory.\n\n");
			System.exit(0);          
	  } 
	}
         
    public static void buildPanel() {
		 		 
		for (int i=0; i < QuestionList.size(); ++i) {
                   Question Q = QuestionList.get(i);
                   QuizzF NewPanel = new QuizzF (Q.getQuestion(), Q.getOptionA(), Q.getOptionB(),Q.getOptionC(), Q.getOptionD(), Q.getCorrectOption());
                   panelList.add(NewPanel);
                   content.add(NewPanel, Integer.toString(i)); 
		}
                  
              gameGUI.setVisible(true);
        }
      
    public static void playGamelopp() throws InterruptedException {
     
        refreshGUI();
        
        for (int i =0; i < QuestionList.size(); i++) {
			run = true;
			while(run) {
		
                            card.show(content, Integer.toString(i));
                            content.setVisible(true);
				if(run) {
					
				}
				else {
                                   
                                     Thread.sleep(1000);
					break;
                                }
			}
    }
}
    
    public static void refreshGUI() {
	          
		gameGUI.add(content);
		gameGUI.repaint();
		gameGUI.revalidate();
               
	}
    
    public static void setRun(boolean setVal) {
		run = setVal;
	}
    
    public static boolean getRun(){
        return run;
    }
    
    public static void incrementScore(){
        score++;
    }
    
}
