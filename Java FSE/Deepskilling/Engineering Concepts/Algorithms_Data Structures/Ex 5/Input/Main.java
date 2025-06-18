public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Develop Backend", "In Progress"));
        manager.addTask(new Task(3, "Write Tests", "Pending"));

        System.out.println("📋 All Tasks:");
        manager.displayTasks();

        System.out.println("\n🔍 Searching Task with ID 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\n❌ Deleting Task with ID 2:");
        manager.deleteTask(2);

        System.out.println("\n📋 Updated Tasks:");
        manager.displayTasks();
    }
}
