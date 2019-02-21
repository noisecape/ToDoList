package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task extends ToDoList{
    private String task;
    private String date;
    private int identifier;

    public Task(String task, int identifier){
        super(task);
        this.setTask(task);
        this.identifier = identifier;
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd");
        this.date = "Added " + dateFormat.format(date);
    }

    public void setIdentifier(int identifier){
        this.identifier = identifier;
    }

    public int getIdentifier(){
        return this.identifier;
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
