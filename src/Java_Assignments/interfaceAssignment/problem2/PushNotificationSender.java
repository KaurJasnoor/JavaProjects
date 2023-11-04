package Java_Assignments.interfaceAssignment.problem2;

public class PushNotificationSender implements PushNotification {

    @Override
    public void pushNotification() {
        System.out.println("Pushing new Notification...");
    }

    @Override
    public void sendNotification(String massage) {
        System.out.println("Notification message :"+ massage);
    }
}
