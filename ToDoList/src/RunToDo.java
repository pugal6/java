import java.util.ArrayList;
import java.util.Scanner;
public class RunToDo {
    private static ArrayList<User> users = new ArrayList<>();

    public static User getUserByUserName(String username) {
        for(User u : users) {
            if(u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        int choice;

        while(isRunning) {
            System.out.println("Welcome to ToDo App");
            System.out.println("Enter your username: ");
            String username = sc.nextLine();

            User user = getUserByUserName(username);

            if(user == null) {
                System.out.println("User not found.. Creating new User");
                user = new User(username);
                users.add(user);
            }
            boolean userIsActive = true;
            while (userIsActive) {
                System.out.println("Hello " + user.getUsername() + "!");
                System.out.println("1. View ToDo List");
                System.out.println("2. Add a new task");
                System.out.println("3. Remove a task");
                System.out.println("4. Logout");
                System.out.println("5. Close the Program");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        user.getToDoList().display();
                        break;
                    case 2:
                        user.getToDoList().addToDo();
                        break;
                    case 3:
                        user.getToDoList().removeToDo();
                        break;
                    case 4:
                        userIsActive = false;
                        System.out.println("Logging out");
                        break;
                    case 5:
                        isRunning = false;
                        userIsActive = false;
                        System.out.println("Program over");
                    default:
                        System.out.println("Invalid Input");
                }
            }
        }
        sc.close();
    }
}
