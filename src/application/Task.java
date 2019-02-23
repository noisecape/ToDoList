package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task extends ToDoList_Model {
    private String task;
    private String date;

    public Task(String task){
        super(task);
        this.setTask(task);
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd");
        this.date = "Added " + dateFormat.format(date);
    }

    public String getDate(){
        return date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
