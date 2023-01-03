public class Problem3 {
    public static void main(String[] args) {
	Task t2 = new Task("Wash the dishes!");
	Task t1 = new Task("Walk the dog!",t2);
	t2.setNextTask(new Task("Clean the room!"));
	Task head = new Task("Get rest!",t1);
	head.printTasks();
	System.out.println();

	head.printTasksRev();

	System.out.println();

	System.out.println();
	Task.printTasks(head);

	System.out.println();

	Task.printTasksRev(head);
	System.out.println();
    }
}
