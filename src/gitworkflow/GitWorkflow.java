package gitworkflow;

/**
 *
 * @author Hardik Upadhyay
 */
public class GitWorkflow
{
    GitWorkflow t1 = new GitWorkflow();
    int counter = 0;
    
    public GitWorkflow()
    {
        System.out.println("Counter="+counter++);
    }
    
    public static void main(String a[]) throws InterruptedException
    {        
        System.out.println("Main Enter");
        Thread.currentThread().sleep(1000);
        GitWorkflow t2 = new GitWorkflow();        
        System.out.println("Main Exit");
    }
    
}
