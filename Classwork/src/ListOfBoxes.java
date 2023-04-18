import java.util.ArrayList;
import java.util.List;

public class ListOfBoxes<T> extends ArrayList<T>{
    private List<Box<T>> list;

    public ListOfBoxes() {
        this.list = new ArrayList<>();
    }

    public void swap(int indexOne, int indexTwo)
    {
        Box<T> firstElement = this.list.get(indexOne);

        this.list.set(indexOne, this.list.get(indexTwo));
        this.list.set(indexTwo, firstElement);

    }


    public void addElement(Box<String> element)
    {
        this.list.add((Box<T>) element);
    }

}
