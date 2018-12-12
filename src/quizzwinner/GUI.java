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
import javax.swing.JFrame;
import java.awt.Dimension;
import java.io.File;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GUI extends JFrame {

	

	public  GUI(){
		super("Game");	
		setSize(new Dimension(600,428));
                setResizable(false);
                setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(false);
                
                File file = new File("src/Resource/HalasLOGO.png");
                String absolutePath = file.getAbsolutePath();
		setIconImage(new ImageIcon(absolutePath).getImage());
	}
}
