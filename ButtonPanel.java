import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private final JButton addTask = new JButton("Add Task");
    private final JButton clearTask = new JButton("Clear Task");

    public ButtonPanel() {
        this.setPreferredSize(new Dimension(400, 60));
        GridLayout layout = new GridLayout(1, 2);
        this.setLayout(layout);
        Border buttonBorder = BorderFactory.createEmptyBorder();
        addTask.setBorder(buttonBorder);
        Dimension buttonDim = new Dimension(5, 5);
        addTask.setPreferredSize(buttonDim);
        Font buttonfont = new Font("Arial", Font.BOLD, 12);
        addTask.setFont(buttonfont);
        clearTask.setBorder(buttonBorder);
        clearTask.setPreferredSize(buttonDim);
        clearTask.setFont(buttonfont);
        this.add(clearTask);
        this.add(addTask);

    }
    public JButton getAddTask(){
        return addTask;
    }


    public JButton getClearTask() {
        return  clearTask;
    }
}
