package algorithm;

import pojo.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class GetShuru
{
    public ArrayList<Student> GetRandData(int banji) throws IOException
    {
        File file = new File(".\\class"+banji+".dat");
        ArrayList<Student> students = new ArrayList<Student>();
        try
        {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students =  (ArrayList<Student>)(ois.readObject());
            ois.close();
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return students;
    }
}