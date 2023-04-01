import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task extends JPanel  {
    public JLabel index;
    private final JTextField taskName;
    private final JButton doneButton;
    private boolean checked;
    public List list;
    private final JButton doneoneButton;

    public Task() {
        this.setPreferredSize(new Dimension(40, 20));
        GridLayout layout = new GridLayout(1, 3);
        this.setLayout(layout);

        checked = false;
        index = new JLabel("");
        index.setPreferredSize(new Dimension(20, 20));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index, BorderLayout.WEST);

        taskName = new JTextField("Task Name");
        taskName.setBorder(BorderFactory.createEmptyBorder());
        this.add(taskName, BorderLayout.CENTER);

        doneButton = new JButton("Done");
        doneButton.setPreferredSize(new Dimension(10, 20));
        doneButton.setBorder(BorderFactory.createEmptyBorder());
        this.add(doneButton, BorderLayout.EAST);

        doneoneButton = new JButton("Delete");
        doneoneButton.setPreferredSize(new Dimension(10, 20));
        doneoneButton.setBorder(BorderFactory.createEmptyBorder());
        this.add(doneoneButton, BorderLayout.EAST);
//        doneoneButton.addActionListener(this);
    }

    public void toDone() {
        this.setBackground(Color.GREEN);
        taskName.setBackground(Color.GREEN);
        checked = true;

    }

    public JButton getDone() {
        return doneButton;
    }

    public boolean getChecked(){
        return checked;
    }
    public void setChecked(boolean checked){
        this.checked = checked;
    }
    public JButton getDoneoneButton(){
        return doneoneButton;
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==doneoneButton){
//            List parentList = (List) Task.this.getParent();
//            parentList.remove(Task.this);
//            parentList.revalidate();
//            parentList.repaint();
}
