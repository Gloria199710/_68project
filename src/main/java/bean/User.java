package bean;

public class User {
    private int user_id;
    private String user_pwd;

    public User(int user_id, String user_pwd) {
        this.user_id = user_id;
        this.user_pwd = user_pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_pwd='" + user_pwd + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }


    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }
}
