import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel {

    private final JPanel panel;
    private JTextArea textArea;
    private JTextField inputField;

    public InputPanel(JTextArea textArea) {
        this.panel = new JPanel();
        initPanel(textArea);
    }

    private void initPanel(JTextArea textArea) {

        panel.setLayout(new BorderLayout());

        this.textArea = textArea;

        this.inputField = new JTextField();
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTextArea();
            }
        });

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTextArea();
            }
        });

        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

    }

    public JPanel getPanel() {
        return panel;
    }

    private void updateTextArea () {
        StringBuilder sb = new StringBuilder(textArea.getText());
        String message = inputField.getText();

        if (sb.length() != 0) {
            sb.append("\n");
        }

        if (message.length() != 0) {
            sb.append(message);
            textArea.setText(sb.toString());
            inputField.setText("");
        }
    }
}

