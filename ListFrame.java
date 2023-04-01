import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListFrame extends JFrame {
    private final List list = new List();

    private final JButton addTask;
    private final JButton clearTask;
    private int counter = 0;
    public ListFrame(){
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        TitleBar titleBar = new TitleBar();
        this.add(titleBar, BorderLayout.NORTH);
        ButtonPanel buttonPanel = new ButtonPanel();
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);
        addTask = buttonPanel.getAddTask();
        clearTask = buttonPanel.getClearTask();
        addListeners();
    }

    public void addListeners() {

        addTask.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //for evertime addtask is pressed increase the counter by 1
                Task task = new Task();
                list.add(task);
                int x = getCounter();
                task.index.setText(String.valueOf(x));
                setCounter(x + 1);
                task.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        task.toDone();
                        revalidate();
                        repaint();
                        if(!list.ispanelEmpty()){
                            setCounter(0);
                        }
                    }
                });
                task.getDoneoneButton().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        list.remove(task);
                        revalidate();
                        repaint();
                        if(!list.ispanelEmpty()){
                            setCounter(0);
                        }
                    }
                });
                revalidate();
            }

        });
        clearTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                list.removeCompleted();
                revalidate();
                repaint();
            }
        });
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }

    public List getList() {
        return list;
    }

}
