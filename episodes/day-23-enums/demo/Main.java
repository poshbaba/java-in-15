public class Main {
    public static void main(String[] args) {
        Environment selected = Environment.QA;
        for (Environment environment : Environment.values()) {
            System.out.println("Environment: " + environment.name());
        }
        switch (selected) {
            case DEV: System.out.println("Development selected"); break;
            case QA: System.out.println("Testing selected"); break;
            case STG: System.out.println("Staging selected"); break;
            case PROD: System.out.println("Production selected"); break;
        }
    }
}
enum Environment { DEV, QA, STG, PROD }
