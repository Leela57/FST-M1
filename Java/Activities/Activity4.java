package Activities;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 10, 12, 1, 5, 6};

        for (int x = 1; x < numbers.length; x++)   //12
        {
            System.out.println(Arrays.toString(numbers));
            for(int y=x-1;y>-1;--y)
            {
                if (numbers[y] > numbers[y+1])   // 5-->12  ,4-->10
                {
                    int tempval = 0;
                    tempval = numbers[y];  //12 -- x=5
                    numbers[y] = numbers[y+1];    //10
                    numbers[y+1] = tempval; //10
                }
                System.out.println(y);
            }

        }
        System.out.println("Sorted String" + Arrays.toString(numbers));

    }
}

