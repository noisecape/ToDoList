import java.util.*;

public class ToDoList {
    private ArrayList<Task> list  = new ArrayList<Task>();
    private String owner;
    private int numberOfTasks = 0;

    public ToDoList(String owner){
        this.setOwner(owner);
    }

    public String getOwner() {
        return owner;
    }

    public void showTask(){
        System.out.println("######### THINGS " + getOwner().toUpperCase() +" HAS TO DO #########");
        if (numberOfTasks == 0){
            System.out.println("WOW! "+ getOwner().toUpperCase() + " YOU HAVE NOTHING TO DO TODAY");
        }
        for(Task task : list){
            System.out.println(task.getIdentifier() + "- " + task.getTask() +"\t\t" + task.getDate());
        }
        System.out.println();
    }

    public void removeTask(){
        System.out.println("Please select a task to remove");
        showTask();
        if (numberOfTasks != 0){
            Scanner scanner = new Scanner(System.in);
            int taskToDelete = scanner.nextInt();
            for(Task task : list){
                if (task.getIdentifier() == taskToDelete){
                    list.remove(task);
                    break;
                }
            }
            sortListAfterDeleting();
            System.out.println("Task deleted");
            System.out.println("YOUR UPDATED LIST");
            showTask();
        }

    }

    public void sortListAfterDeleting(){
        numberOfTasks = 0;
        for(Task task: list){
            task.setIdentifier(numberOfTasks);
            numberOfTasks += 1;
        }
    }

    public void addNewTask(){
        System.out.println("Please enter the new task:");
        Scanner scanner = new Scanner(System.in);
        Task task = new Task(scanner.nextLine(),numberOfTasks);
        list.add(task);
        numberOfTasks += 1;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
