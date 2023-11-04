package Java_Assignments.interfaceAssignment.problem2;

public class SMSNotificationSender implements SmsNotification{

    @Override
    public void sendSMSnotification(String phoneNumber) {
        System.out.println("SMS Notification send to : "+ phoneNumber);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS message :"+ message);
    }
}
