import java.util.*;

public class ToDoList {
    private ArrayList<Task> list  = new ArrayList<Task>();
    private String owner;

    public ToDoList(String owner){
        this.setOwner(owner);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
