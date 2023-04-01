import javax.swing.*;
import java.awt.*;

public class List extends JPanel {

    private boolean Empty;



    public List(){
        GridLayout layout = new GridLayout(10, 1);
        this.setLayout(layout);
        layout.setVgap(5);

    }

    public void removeCompleted() {
        for(Component c : this.getComponents()){
            if(c instanceof Task && ((Task) c).getChecked()){
                remove(c);
                System.out.println(c);
            }
        }
    }

    public boolean ispanelEmpty(List this){
        if(this.getComponentCount() == 0){
            setEmpty(true);
        }
        else{
            setEmpty(false);
        }
        return getEmpty();
    }

    public void setEmpty(boolean Empty){
        this.Empty = Empty;
    }

    public boolean getEmpty(){
        return Empty;
    }





}
