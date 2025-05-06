package SingleResponsibility.NotUsing;

public class UserManager {
    void addUser(String user) {
        System.out.println("User added: " + user);
    }

    void saveToFile(String filename) {
        System.out.println("Saving data to file: " + filename);
    }

}
