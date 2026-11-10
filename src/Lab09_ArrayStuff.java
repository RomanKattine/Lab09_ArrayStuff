
import java.util.Random;
import java.util.Scanner;

public class Lab09_ArrayStuff
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1
        int[] dataPoints = new int[100];

        // Task 2
        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3
        System.out.println("The numbers in the array are:");

        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);

            if(i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }

        System.out.println();

        // Task 4
        int sum = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];
        }

        double average = (double)sum / dataPoints.length;

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);

        // Task 5
        int num = SafeInput.getRangedInt(pipe,
                "Enter a number between 1 and 100", 1, 100);

        // Task 6
        int count = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == num)
            {
                count++;
            }
        }

        System.out.println("The number " + num +
                " was found " + count + " times.");

        // Task 7
        int num2 = SafeInput.getRangedInt(pipe,
                "Enter another number between 1 and 100", 1, 100);

        boolean found = false;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == num2)
            {
                System.out.println("The value " + num2 +
                        " was found at array index " + i);
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("The value " + num2 +
                    " was not found in the array.");
        }

        // Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);

        // Task 9
        System.out.println("Average of dataPoints is: "
                + getAverage(dataPoints));

        pipe.close();
    }

    public static double getAverage(int values[])
    {
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum = sum + values[i];
        }

        double average = (double)sum / values.length;

        return average;
    }
}

