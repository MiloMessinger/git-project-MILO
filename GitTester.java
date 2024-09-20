import java.io.IOException;

public class GitTester
{
    public static void main(String [] args) throws IOException
    {
        Git banana = new Git();
        banana.initRepo();
        banana.deleteRepo();
    }
}