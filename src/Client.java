import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        ToDoList list = new ToDoList("Tommaso");
        client.printGUI();
        client.performOperation(list);
    }

    public void performOperation(ToDoList list){
        Scanner scanner = new Scanner(System.in);
        Operation operation = convertInputInOperation(scanner.nextInt());
        while(true){
            switch (operation){
                case ADD:
                    //list.add();
                    break;
                case REMOVE:
                    //list.remove()
                    break;
                case SHOW:
                    //list.show()
                    break;
                case UNKNOWN:
                    //Handle error
                    break;
            }
        }
    }

    public Operation convertInputInOperation(int input){
        if (input == 1) {
            return Operation.ADD;
        }else if (input == 2){
            return Operation.REMOVE;
        }else if (input == 3){
            return Operation.SHOW;
        }else {
            return Operation.UNKNOWN;
        }
    }

    public void printGUI(){
        for(int i = 0; i<75; i++){
            System.out.print("#");
        }
        System.out.print("\n");
        System.out.print("##");
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("E yyyy.MM.dd");
        System.out.printf("\t\tTO DO LIST \t\t\t\t\t%s\t\t ##\n", date.toString());
        for(int i = 0; i<75; i++){
            System.out.print("#");
        }
        System.out.print("\n");
        System.out.println("Please insert a valid operation:");
        System.out.println("1) Add a new task");
        System.out.println("2) Remove a task");
        System.out.println("3) Show all tasks");
    }

}
