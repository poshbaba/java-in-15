public final class Application implements Deployable {
    private final String name;
    private final int totalReplicas;
    private final int healthyReplicas;
    private final int successAttempt;
    public Application(String name, int totalReplicas, int healthyReplicas, int successAttempt) {
        if (name == null || name.isBlank()) { throw new IllegalArgumentException("Application name is required"); }
        HealthPolicy.percentage(totalReplicas, healthyReplicas);
        if (successAttempt < 1) { throw new IllegalArgumentException("Success attempt must be positive"); }
        this.name = name;
        this.totalReplicas = totalReplicas;
        this.healthyReplicas = healthyReplicas;
        this.successAttempt = successAttempt;
    }
    public String getName() { return name; }
    public double healthPercentage() { return HealthPolicy.percentage(totalReplicas, healthyReplicas); }
    @Override public boolean deploy(Environment environment, int attempt) {
        if (environment == null || attempt < 1) { throw new IllegalArgumentException("Invalid deployment attempt"); }
        return attempt >= successAttempt;
    }
}
