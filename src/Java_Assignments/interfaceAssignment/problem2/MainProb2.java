package Java_Assignments.interfaceAssignment.problem2;

public class MainProb2 {
    public static void main(String[] args) {
        EmailNotificationSender emailNotify = new EmailNotificationSender();
        SMSNotificationSender smsNotify = new SMSNotificationSender();
        PushNotificationSender pushNotify = new PushNotificationSender();

        // Email Methods calling...
        emailNotify.settingReceipts("Jasnoor");
        emailNotify.sendEmailNotification("jasnoor@jasnoor.com");
        emailNotify.sendNotification("This is Email Notification");

        System.out.println("  ");

        //SMS Methods calling...
        smsNotify.sendSMSnotification("9876543210");
        smsNotify.sendNotification("Sending SMS notification...");

        System.out.println("  ");

        //Push Methods calling...
        pushNotify.pushNotification();
        pushNotify.sendNotification("Message has been sent. ");




    }
}
