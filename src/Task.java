import java.util.Date;

public class Task extends ToDoList{
    private String task;
    private Date date;

    public Task(String task){
        super(task);
        this.setTask(task);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
