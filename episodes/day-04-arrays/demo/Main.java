public class Main {
    public static void main(String[] args) {

        String[] environments = {
                "DEV",
                "QA",
                "STG",
                "PROD"
        };

        System.out.println(environments[0]);
        System.out.println(environments[3]);

        System.out.println(
                "Total environments: " + environments.length
        );
    }
}
