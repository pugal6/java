public class User {
    private String username;
    private ToDoList toDoList;

    public User(String username) {
        this.username = username;
        toDoList = new ToDoList();
    }

    public String getUsername() {
        return username;
    }

    public ToDoList getToDoList() {
        return toDoList;
    }
}
