public class Main {
    public static void main(String[] args) {
        /// Factory method is used to object creation it uses each factory at the client
        /// code to create different object it encapsulate the new keyword
        NotificationFactory factory;

        // Choose factory based on config or input
        factory = new EmailFactory();
        Notification notification = factory.createNotification();
        notification.nortifyUser();

        // Choose factory based on config or input
        factory = new SMSFactory();
        notification = factory.createNotification();
        notification.nortifyUser();

        // we can change the factory at the run time
//        private Vehicle pVehicle;
//
//        public Client(int type) {
//                if (type == 1) {
//                    pVehicle = new TwoWheeler();
//                } else if (type == 2) {
//                    pVehicle = new FourWheeler();
//                } else {
//                    pVehicle = null;
//                }
//            }

    }
}