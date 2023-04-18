import java.util.*;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return String.format(this.getClass().getTypeName() + ": " + this.value);
    }

    //public List<T> values;
//
    //public Box(T value) {
    //    this.values = new ArrayList<>();
    //}
//
    //@Override
    //public String toString(){
    //    return String.format(this.values.getClass().getTypeName() + ": " + this.values);
    //}
//
    //public void add(T value){
    //    this.values.add(value);
    //}
}
