package data;

import pojo.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class CreateShuru
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        for (int banji = 1;banji<=5;banji++)
        {
            CreateJidian rand = new CreateJidian();
            CreateChuqin createChuqin = new CreateChuqin();
            File file = new File(".\\class"+banji+".dat");
            ArrayList<Student> students = new ArrayList<Student>();
            if (!file.exists()) file.createNewFile();
            HashSet<Integer> chuqin = new HashSet<Integer>();
            chuqin = createChuqin.SortA();
            int size01 = 0;
            try
            {
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for (int i = 0; i < 90; i++)
                {
                    Student person = new Student();
                    double jidian = rand.getJidian();
                    person.setId(i+1);
                    person.setJidian(jidian);
                    students.add(person);
                }
                Collections.sort(students, new Comparator<Student>()
                {
                    @Override
                    public int compare(Student o1, Student o2)
                    {
                        if (o1.getJidian() >= o2.getJidian())
                        {
                            return 1;
                        }
                        else
                        {
                            return -1;
                        }
                    }
                });
                for (int i = 0; i < 90; i++)
                {
                    int[] courses = new int[20];
                    if (chuqin.contains(i))
                    {
                        courses = createChuqin.SortB();
                    }
                    Student student = students.get(i);
                    student.setChuqin(courses);
                    int guji = 0;
                    if (i < 20) guji = 100;
                    student.setGuji(guji);
                    students.set(i, student);
                }
                for (Student oneUser : students)
                {
                    System.out.println(oneUser);
                }
                oos.writeObject(students);
                oos.close();
                fos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}