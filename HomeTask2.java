import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args)
    {
        int[] arr = {0,5,2,4,7,1,3,19};

        //isFlatAtHouse(9,4,4);
        //wallpaper(5);
        //factorial();
        //oddCount(arr);
        //createArray();
        //createStrangeArray();
        //countSymbol('b');
    }

    static void isFlatAtHouse(int floors, int padiks, int flatsInOnefloor)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a flat number: ");
        int number = in.nextInt();

        if(number > flatsInOnefloor*floors*padiks || number < 1)
        {
            System.out.println("No, no, no");
            return;
        }

        int padik = (number+flatsInOnefloor*floors-1)/(flatsInOnefloor*floors);
        int floor = ((number-1)%(flatsInOnefloor*floors))/flatsInOnefloor+1;
        System.out.println("This flat is at " + Integer.toString(floor) + " floor in "+ Integer.toString(padik) + " padik");
    }

    static void wallpaper(int heightOfWall)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of stripes: ");
        int stripes = in.nextInt();

        for(int i = 0; i < heightOfWall; ++i)
        {
            for(int j = 0; j < stripes; ++j)
            {
                if(j%2==0)
                {
                    System.out.print("***");
                }
                else
                {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }

    static long factorial()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();

        if(number < 4 || number > 16)
        {
            System.out.println("Wrong number...");
            return -1;
        }

        long answer = 1;
        for(int i = 1; i <= number; ++i)
        {
            answer *= i;
        }

        System.out.println(Long.toString(answer));
        return answer;
    }

    static int oddCount(int[] array)
    {
        int count = 0;
        for(int i = 0; i < array.length; ++i)
        {
            if(array[i] % 2 == 1)
            {
                count++;
            }
        }

        System.out.println(count + " odd numbers in this array");
        return count;
    }

    static int[] createArray()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of array: ");
        int size = in.nextInt();
        int[] newArray = new int[size];

        Random random = new Random();
        for(int i = 0; i < size; ++i)
        {
            newArray[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    static int[] createStrangeArray()
    {
        int[] firstArr = new int[15];
        Random random = new Random();
        for(int i = 0; i < firstArr.length; ++i)
        {
            firstArr[i] = random.nextInt(10);
        }

        int[] secondArr = new int[firstArr.length*2];
        System.arraycopy(firstArr,0,secondArr,0,firstArr.length);

        for(int i = 0; i < firstArr.length; ++i)
        {
            secondArr[firstArr.length+i] = secondArr[i]*2;
        }

        System.out.println(Arrays.toString(secondArr));
        return secondArr;
    }

    static int countSymbol(char symbol)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = in.nextLine();

        int count = 0;
        for (char chr: string.toCharArray())
        {
            if(symbol == chr)
            {
                count++;
            }
        }
        System.out.println(count + " symbols '" + symbol + "' founded");
        return count;
    }
}
