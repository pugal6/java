import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> todo = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addToDo() {
        System.out.println("Enter the item to add: ");
        String item = sc.nextLine();
        todo.add(item);
    }

    public void removeToDo() {
        System.out.println("Enter the item number to remove: ");
        int itemNum = sc.nextInt();
        if(itemNum > 0 && itemNum <= todo.size()) {
            todo.remove(itemNum -1);
        }
    }

    public void display() {
        if(todo.isEmpty()) {
            System.out.println("ToDo List is empty");
        }
        else {
            System.out.println("ToDo List: ");
            for(String str : todo) {
                System.out.println(str);
            }
        }
    }
}