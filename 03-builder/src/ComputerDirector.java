// class that know how to create a computer and what order
// this class get the object of the builder class and call specific recipie to create specific
public class ComputerDirector {
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}
