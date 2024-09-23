import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GitTester
{
    public static void main(String [] args) throws IOException
    {
       Git banana = new Git();
        banana.deleteRepo();
        banana.initRepo();



        // File test = new File("testFile.txt");
        // if(test.exists())
        //     test.delete(); //resets it if needed
        // FileWriter fileWritter = new FileWriter(test,true);
        // BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
        // bufferWritter.write("this is a test", 0, 14);
        // bufferWritter.close();
    
        // File test2 = new File("testFile2.txt");
        // if(test2.exists()) 
        //     test2.delete(); //resets it if needed
        // FileWriter fileWritter2 = new FileWriter(test2,true);
        // BufferedWriter bufferWritter2 = new BufferedWriter(fileWritter2);
        // bufferWritter2.write("this is a second test for secret reasons", 0, 40);
        // bufferWritter2.close();

      //  Blob bouba = new Blob("testFile.txt", true);
        //Blob bouba2 = new Blob("testFile2.txt", true);
    
      // deleteRepo deletes EVERYTHING in git directory, including the directory itself
      //so only do it when you want to reset it all

    }
}