public class EmailMessage extends Message {

    public EmailMessage(ILogin login, String sender, String receiver, String text) {
       super(login, sender, receiver, text);
    }

    @Override
    public void send(String name, String password){
        if(getLogin().authenticate(name, password)){
            System.out.println("Email sent from " +getSender()+ " to "+getReceiver()+": " +getText());
        }else{
            System.out.println("Email authentication failed for user: " +name);
        }
    }
}
