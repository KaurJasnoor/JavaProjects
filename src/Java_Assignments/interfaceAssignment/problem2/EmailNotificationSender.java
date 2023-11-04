package Java_Assignments.interfaceAssignment.problem2;

public class EmailNotificationSender implements EmailNotification, NotificationSender{

    @Override
    public void settingReceipts(String receipts) {
        System.out.println("Receipt : "+ receipts);
    }

    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Send Email to : "+ email);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Message is : "+ message);
    }
}
