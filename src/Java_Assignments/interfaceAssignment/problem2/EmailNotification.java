package Java_Assignments.interfaceAssignment.problem2;

public interface EmailNotification extends NotificationSender {

    public void settingReceipts(String receipts);

    public void sendEmailNotification(String email);
}
