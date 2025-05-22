public class OAuthLogin implements ILogin{
    public String token;

    public OAuthLogin(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public boolean authenticate(String name, String password){
        return this.token.equals(password);
    }
}
