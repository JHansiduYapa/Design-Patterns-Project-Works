//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderManagmentService ob1 = OrderManagmentService.getInstance();
        ob1.placeOrder();
        OrderManagmentService ob2 = OrderManagmentService.getInstance();
        if (ob2 == ob1){
            System.out.println("Objects");
        }
    }
}