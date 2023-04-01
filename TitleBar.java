import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {
    JLabel titlelabel = new JLabel("ToDo-List");
    public TitleBar(){
        this.setPreferredSize(new Dimension(400,80));
        titlelabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlelabel.setPreferredSize(new Dimension(200,80));
        titlelabel.setHorizontalAlignment(JLabel.CENTER);
        this.add(titlelabel);

    }
}
