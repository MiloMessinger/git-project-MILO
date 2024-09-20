import java.io.File;
import java.io.IOException;

public class Git {
    public Git () {

    }
    public void initRepo() throws IOException
    {
        if(new File("git/objects/index").exists())
        {
            System.out.println("Git Repository already exists");
        }
        else{
            File objects = new File("git/objects");
            objects.mkdirs();
            File index = new File("git/objects/index");
            index.createNewFile();
        }
    }
    public void deleteRepo()
    {
        File index = new File("git/objects/index");
        if(index.exists())
        {
            index.delete();
            new File("git/objects").delete();
            new File("git").delete();
        }
    }
}