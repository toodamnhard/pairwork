package algorithm;

import pojo.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Choudian
{
    public static void main(String[] args)
    {
        for (int banji = 1 ; banji<=5 ; banji++)
        {
            float w1 = 0;
            float w2 = 0;
            GetShuru getShuru = new GetShuru();
            ArrayList<Student> students = new ArrayList<>();
            try
            {
                students = getShuru.GetRandData(banji);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            int[][] ints = new int[90][20];
            for (int i = 0; i < 90; i++)
            {
                Student student = new Student();
                student = students.get(i);
                ints[i] = student.getChuqin();
            }
            for (int i = 0; i < 90; i++)
            {
                Student student = new Student();
                student = students.get(i);
                int guji = student.getGuji();
                int quexi = student.getQuexi();
                for (int j = 0; j < 20; j++)
                {
                    if (j + 1 - quexi > 2) guji = 0;
                    if (j + 1 - quexi > 3) guji = 0;
                    if (j + 1 - quexi > 4) guji = 0;
                    if (quexi > 2) guji = 90;
                    if (quexi > 3) guji = 100;
                    int num = new Random().nextInt(100) + 1;
                    if (num < guji)
                    {
                        w2++;
                        if (ints[i][j] == 1)
                        {
                            guji = 100;
                            quexi++;
                            w1++;
                        }
                    }
                }
            }
            System.out.println(w1 / w2);
        }
    }
}