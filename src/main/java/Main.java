import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/test_flyway", "postgres", "315820123")
                .schemas("public")
                .load();

        flyway.migrate();
        System.out.println("Миграции выполнены!");
    }
}