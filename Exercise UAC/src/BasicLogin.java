public class BasicLogin implements ILogin {
    public String name;
    public String password;

    public BasicLogin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    
    public boolean authenticate(String name, String password){
        return name.equals(this.name) && password.equals(this.password);
    }
}
