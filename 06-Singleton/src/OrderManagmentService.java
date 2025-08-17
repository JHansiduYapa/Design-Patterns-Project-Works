public class OrderManagmentService {
    // private static field to refernce to the object
    private static OrderManagmentService orderManagmentService;

    // private constructor to any other can not call the object ceration
    private OrderManagmentService(){}

    // lazy initialization to only create when the object is not created and return that
    // object
    public static synchronized OrderManagmentService getInstance(){
        if (orderManagmentService == null){
            orderManagmentService = new OrderManagmentService();
        }
        return orderManagmentService;
    }

    // public method to perform operations
    public void placeOrder(){
        System.out.println("Order is placed");
    }
}
