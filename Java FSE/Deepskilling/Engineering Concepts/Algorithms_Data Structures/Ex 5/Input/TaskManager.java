public class TaskManager {
    private TaskNode head;

    // Add task at the end
    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search task by ID
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse all tasks
    public void displayTasks() {
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete task by ID
    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("✅ Task deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.taskId == taskId) {
                current.next = current.next.next;
                System.out.println("✅ Task deleted.");
                return;
            }
            current = current.next;
        }

        System.out.println("❌ Task not found.");
    }
}
