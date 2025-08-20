public class EmailFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSFactory extends NotificationFactory {
    public Notification createNotification() {
        return new SMSNortification();
    }
}
