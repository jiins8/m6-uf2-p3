
import departments.Department;
import departments.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    private static final EntityManagerFactory ourEntityManagerFactory;

    static {
        try {
            ourEntityManagerFactory = Persistence.createEntityManagerFactory("default");
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {
        return ourEntityManagerFactory.createEntityManager();
    }

    public static void main(final String[] args) throws Exception {
        final EntityManager entityManager = getEntityManager();
        System.out.println(entityManager.getProperties());
        Department departament = entityManager.find(Department.class, "10");
        System.out.println(departament);
        Employee empleat = entityManager.find(Employee.class, "7788");
        System.out.println(empleat);
        entityManager.close();
    }
}
