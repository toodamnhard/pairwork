package data;

import pojo.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class CreateChuqin
{
    public  HashSet<Integer> SortA()
    {
        int number = new Random().nextInt(4)+5;
        HashSet<Integer> set = new HashSet<Integer>();
        int size = set.size();
        for(size = 0;size<number;)
        {
            int num_1 = 0;
            int num =  new Random().nextInt(101);
            int sqrt;
            if(num <= 60)
            {
                num_1 = new Random().nextInt(11);
            }
            else if(num <= 90 )
            {
                num_1 = new Random().nextInt(11)+10;
            }
            else if(num <= 95 )
            {
                num_1 = new Random().nextInt(71)+20;
            }
            else if(num <= 100)
            {
                num_1 = new Random().nextInt(11)+90;
            }
            set.add(num_1);
            size = set.size();
        }
        return set;
    }

    public  int[] SortB()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        int size = set.size();
        int [] courses = new int[20];
        for(size = 0;size<16;)
        {
            int num = new Random().nextInt(20);
            set.add(num);
            size = set.size();
        }
        for(int i = 0 ; i<20 ; i++)
        {
            courses[i] = 0;
            if(set.contains(i))
            {
                courses[i] = 1;
            }
        }
        return courses;
    }
}