import javax.swing.*;
import java.awt.*;

public class ChatPanel {
    private final JPanel panel;
    private final JTextArea textArea;

    public ChatPanel(JTextArea textArea) {
        this.textArea = textArea;
        this.panel = new JPanel();
        initPanel();
    }

    private void initPanel() {

        panel.setLayout(new GridLayout());
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}
