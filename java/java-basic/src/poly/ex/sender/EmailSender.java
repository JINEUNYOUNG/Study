package poly.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("email발송");
    }
}
