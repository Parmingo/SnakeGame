import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.getDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    private void getDefaultCloseOperation(int exitOnClose) {
    }
}
