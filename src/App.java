import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public App() {

        setTitle("AnyChat");
        setBounds(new Rectangle(50, 50, 1000, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        JMenuBar menuBar = new MenuBar();
        setJMenuBar(menuBar);

        JPanel chatPanel = new ChatPanel(textArea).getPanel();
        add(chatPanel, BorderLayout.CENTER);

        JPanel inputPanel = new InputPanel(textArea).getPanel();
        add(inputPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
