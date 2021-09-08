import javax.swing.JFrame;
public class GameFrame extends JFrame{
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.setSize(800,600);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
