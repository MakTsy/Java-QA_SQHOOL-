import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

public class HomeTask1 {
    public static void main(String[] args) {
        maxFromThree(1.4f, 1.3f,4.5f);
        sumOfString("10", "25");
        isEven(4);
        parallelogramSquare(5,4,3.14f/2);
        triangleSquare(3,4,5);
    }

    static float maxFromThree(float a, float b, float c)
    {
        float answer = a;
        if(b > answer)
        {
            answer = b;
        }
        if(c > answer)
        {
            answer = c;
        }
        System.out.println("max number is: " + answer);
        return answer;
    }

    static String sumOfString( String a, String b)
    {
        String result = Integer.toString((Integer.parseInt(a) + Integer.parseInt(b)));
        System.out.println("Answer is: " + result);
        return result;
    }

    static boolean isEven(float a)
    {
        if(a%2 == 0)
        {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }

    static float parallelogramSquare(float sideA, float sideB, float angle)
    {
        float answer = (float)sin(angle)*sideA*sideB;
        System.out.println(answer);
        return answer;
    }

    static float triangleSquare(float sideA, float sideB, float sideC)
    {
        float halfPerimetr = (sideA+sideB+sideC)/2;
        float answer = (float)sqrt(halfPerimetr*(halfPerimetr-sideA)*(halfPerimetr-sideB)*(halfPerimetr-sideC));
        System.out.println(answer);
        return answer;
    }

}
