public class SMSMessage extends Message{

    public SMSMessage(ILogin login, String sender, String receiver, String text) {
        super(login, sender, receiver, text);
    }

    @Override
    public void send(String name, String token){
        if(getLogin().authenticate(name, token)){
            System.out.println("SMA sent from " +getSender()+ " to "+getReceiver()+": " +getText());
        }else{
            System.out.println("SMS authentication failed for user: " +name);
        }
    }
}
