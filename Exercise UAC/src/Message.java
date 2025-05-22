public abstract class Message {
    private String sender;
    private String receiver;
    private String text;
    private ILogin login;

    public Message(ILogin login, String sender, String receiver, String text) {
        this.login = login;
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }
    public abstract void send(String user, String credentials);

    public ILogin getLogin() {
        return login;
    }
    public String getReceiver() {
        return receiver;
    }
    public String getSender() {
        return sender;
    }
    public String getText() {
        return text;
    }
}
