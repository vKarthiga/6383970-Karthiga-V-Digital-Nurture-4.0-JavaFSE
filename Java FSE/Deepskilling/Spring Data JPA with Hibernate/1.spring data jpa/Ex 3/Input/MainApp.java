import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        // Step 1: Create SessionFactory
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        // Step 2: Open Session
        Session session = factory.openSession();

        // Step 3: Start Transaction
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Create and Save
            Employee emp = new Employee("John", "Doe", 45000);
            session.save(emp);

            // Fetch All Employees
            List<Employee> list = session.createQuery("FROM Employee", Employee.class).list();
            list.forEach(System.out::println);

            // Fetch by ID
            Employee e = session.get(Employee.class, emp.getId());
            System.out.println("Fetched: " + e);

            // Delete
            session.delete(e);

            // Commit Transaction
            tx.commit();

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
