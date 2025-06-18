public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        system.addEmployee(new Employee(101, "Alice", "Manager", 75000));
        system.addEmployee(new Employee(102, "Bob", "Developer", 60000));
        system.addEmployee(new Employee(103, "Charlie", "Designer", 50000));

        System.out.println("📋 All Employees:");
        system.displayAll();

        System.out.println("\n🔍 Search Employee with ID 102:");
        Employee result = system.searchEmployee(102);
        System.out.println(result != null ? result : "Not found");

        System.out.println("\n❌ Deleting Employee with ID 102:");
        system.deleteEmployee(102);

        System.out.println("\n📋 Updated Employee List:");
        system.displayAll();
    }
}
