import javax.swing.JFrame;
public class GameFrame extends JFrame{

    // Constructor
    GameFrame(){
        this.add(new GamePanel());

        // Adding components
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Fit frame snuggly around components
        this.pack();
        this.setVisible(true);

        // Make window appear in middle of screen
        this.setLocationRelativeTo(null);
    }
}
