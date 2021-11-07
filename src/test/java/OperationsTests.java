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
        Task testTasks = new Task(desc, dueDate);
        testOperations.addTasks(testTasks);

        dueDate = "05/10/2000";
        desc = "attack @^%^@%&'s village in COC";
        testTasks = new Task(desc, dueDate);
        testOperations.addTasks(testTasks);

        dueDate = "05/10/2021";
        desc = "Idk be a sussy baka";
        testTasks = new Task(desc, dueDate);
        testOperations.addTasks(testTasks);

        testOperations.displayList();

        Assertions.assertEquals(" Teabag enemy player " ,testOperations.returnTaskDesc(0));
        Assertions.assertEquals("attack @^%^@%&'s village in COC" ,testOperations.returnTaskDesc(1));
        Assertions.assertEquals("05/10/2021" ,testOperations.returnTaskDueDate(2));


    }
    @Test
    void TestDelete(){
        //Tests the delete feature
        Operations testOperations = new Operations();

        String dueDate = "05/10/2000";
        String desc = " Teabag enemy player ";
        Task testTasks = new Task(desc, dueDate);
        testOperations.addTasks(testTasks);

        dueDate = "05/10/2000";
        desc = "attack @^%^@%&'s village in COC";
        testTasks = new Task(desc, dueDate);
        testOperations.addTasks(testTasks);

        testOperations.deleteTask(0);
        Assertions.assertEquals("attack @^%^@%&'s village in COC", testOperations.returnTaskDesc(0));

    }
}
