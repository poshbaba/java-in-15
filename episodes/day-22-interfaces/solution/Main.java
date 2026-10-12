public class Main {
    public static void main(String[] args) {
        Deployable[] operations = {new WebApplication(), new DatabaseMigration()};
        for (Deployable operation : operations) { operation.deploy(); }
    }
}
interface Deployable { void deploy(); }
class WebApplication implements Deployable {
    @Override public void deploy() { System.out.println("Deploying web application"); }
}
class DatabaseMigration implements Deployable {
    @Override public void deploy() { System.out.println("Running database migration"); }
}
