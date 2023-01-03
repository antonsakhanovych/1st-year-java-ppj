public class Task {
    private String descr;
    private Task next;
    
    public Task(String name) {
	this.descr = name;
	this.next = null;
    }

    public Task(String name, Task next) {
	this.descr = name;
	this.next = next;
    }

    public void setNextTask(Task next){
	this.next = next;
    }

    public void printTasks() {
	Task step = this;
	while (step != null) {
	    System.out.print(step.descr);
	    step = step.next;
	}
    }

    public static void printTasks(Task head) {
	head.printTasks();
    }

    public void printTasksRev() {
	if (this.next != null) {
	    this.next.printTasksRev();
	}
	System.out.print(this.descr);
    }

    public static void printTasksRev(Task head) {
	head.printTasksRev();
    }
    
}
