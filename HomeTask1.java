public class HomeTask1 {
    public static void main(String[] args) {
        maxFromThree(1.4f, 1.3f,4.5f);
        sumOfString("10", "25");
        isEven(4);
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

    static float parallelogramSquare()
    {
        return 0;
    }

    static float triangleSquare()
    {
        return 0;
    }

}
