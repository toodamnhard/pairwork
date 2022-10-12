package data;

import java.math.BigDecimal;
import java.util.Random;

public class CreateJidian
{
    public double getJidian()
    {
        double number = new Random().nextGaussian()*0.6+2.9;
        if(number<0) number = 0.00;
        if(number>4) number = 4.00;
        BigDecimal b = new BigDecimal(number);
        number = b.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
        return number ;
    }
}