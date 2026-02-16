package GUI_JList;

import javax.swing.*;
import java.util.LinkedList;

public class MyListModel extends AbstractListModel<String> {

    private LinkedList<String> data;

    public MyListModel(LinkedList<String> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public String getElementAt(int index) {
        return data.get(index);
    }

    public void addElement(String s) {
        int index = data.size();
        data.add(s);
        fireIntervalAdded(this, index, index);
    }
}
