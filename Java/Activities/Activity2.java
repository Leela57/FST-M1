package Activities;

import java.lang.reflect.Array;

public class Activity2
{
    public static void main(String[] args)
    {
        int[] numbers={10,77,10,54,-11,10};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        int tempval=0;
        for(int x=0;x<numbers.length;x++)
        {
            if  (numbers[x]==10)

            { tempval=tempval+numbers[x];
            }

            System.out.println("In Loop" + numbers[x]);
        }
        System.out.println(tempval);
        if (tempval==30)
        { System.out.println("Array Matched");
        }




    }
}


