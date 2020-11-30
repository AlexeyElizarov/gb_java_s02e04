import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar {

    public MenuBar() {

        JMenu aboutMenu = new JMenu("О программе");
        this.add(aboutMenu);

        JMenuItem exitItem = new JMenuItem("Выход");
        aboutMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
