package application;

import java.util.*;

public class ToDoList_Model {
    private ArrayList<String> list;
    private int numberOfTasks = 0;

    public ToDoList_Model(){
        list  = new ArrayList<String>();
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void addTask(String task){
        list.add(task);
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
    }


}
