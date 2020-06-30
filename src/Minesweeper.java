import javax.swing.*;
import java.awt.*;

public class Minesweeper extends JFrame {

//    Vars
    private GridBagConstraints c;

    public Minesweeper() {
        super("Minesweeper");
        init();
    }

    public void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.getContentPane().setLayout(new GridBagLayout());
    }

    public static void main(String[] args) {

    }
}
