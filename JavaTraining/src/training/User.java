package training;

/**
 * Created by Pasha on 24.05.15.
 */
    // Task #1
public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(User copy) {
        this.username = copy.username;
        this.password = copy.password;

    }

    public User(String username, String password) {
        this.username = "Vasil";
        this.password = "qwert";
    }

    public String getUsername() {
        return this.username;
    }
    //required for Tasks 3 & 4
    public String getPassword() {
        return this.password;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    //Task #2
    public static void main(String[] args) {
        User task2User = new User();
        task2User.setUsername("TestUsername");
        Assert.assertEquals(task2User.username, "TestUsername");

       //Task #3
        User task3User = new User("TestUsername", "TestPassword");
        Assert.assertEquals(task3User.getUsername(), "TestUsername");
        Assert.assertEquals(task3User.getPassword (), "TestPassword");

    // Task #4
    User task4User = new User(task3User);
        Assert.assertEquals(task4User.getUsername(), "TestUsername");
        Assert.assertEquals(task4User.getPassword(), "TestPassword");
    }
}

