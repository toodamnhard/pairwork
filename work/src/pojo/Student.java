package pojo;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L ;

    private  int id;
    private double jidian;
    private int quexi;
    private int[] chuqin;
    private int guji;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getJidian()
    {
        return jidian;
    }

    public void setJidian(double jidian)
    {
        this.jidian = jidian;
    }

    public int getQuexi()
    {
        return quexi;
    }

    public void setQuexi(int quexi)
    {
        this.quexi = quexi;
    }

    public int[] getChuqin()
    {
        return chuqin;
    }

    public void setChuqin(int[] chuqin)
    {
        this.chuqin = chuqin;
    }

    public void setChuqin(int index)
    {
        this.chuqin[index] = 1;
    }

    public int getGuji()
    {
        return guji;
    }

    public void setGuji(int guji)
    {
        this.guji = guji;
    }

    public static long getSerialVersionUID()
    {
        return serialVersionUID;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                " id=" + id +
                ", jidian=" + jidian +
                ", quexi=" + quexi +
                ", chuqin=" + Arrays.toString(chuqin) +
                '}';
    }
}