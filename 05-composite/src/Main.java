public class Main {
    public static void main(String[] args) {
        /// Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
        /// That means you don’t need separate logic for handling a single object (leaf) and a collection of objects (composite).
        /// You just call the same method, and the right behavior happens.
        Developer dev1 = new Developer("Alice", "Frontend Developer");
        Developer dev2 = new Developer("Bob", "Backend Developer");
        Designer des1 = new Designer("Charlie", "UI/UX Designer");

        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(devDirectory);
        directory.addEmployee(des1);

        directory.showDetails();
    }
}