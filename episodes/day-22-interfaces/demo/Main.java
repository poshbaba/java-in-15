public class Main {
    public static void main(String[] args) {
        Deployable operation = new WebApplication();
        operation.deploy();
    }
}
interface Deployable { void deploy(); }
class WebApplication implements Deployable {
    @Override public void deploy() { System.out.println("Deploying web application"); }
}
