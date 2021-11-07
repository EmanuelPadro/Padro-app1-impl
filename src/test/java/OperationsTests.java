import baseline.Operations;
import baseline.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class OperationsTests {



    @Test
    void Test1(){
        //This test the add task
        Operations testOperations = new Operations();
        String dueDate = "05/10/2000";
        String desc = " Teabag enemy player ";
        Task testTask = new Task(desc, dueDate);
        testOperations.addTasks(testTask);


        Assertions.assertEquals(desc , testOperations.returnTaskDesc(0));
        System.out.println(testOperations.returnTaskDesc(0));

    }

    @Test
    void TestDisplayList(){
        //Test everything works when displaying the list of tasks
        Operations testOperations = new Operations();
        String dueDate = "05/10/2000";
        String desc = " Teabag enemy player ";
        Task testTask = new Task(desc, dueDate);
        testOperations.addTasks(testTask);

    }
}
