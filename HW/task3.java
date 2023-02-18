import java.util.Arrays;

public class task3 
{
    public static void main(String[] args) 
    {
        // реализовать простой калькулятор

        String str = "55*6";
        String[] math = {"-", "+", "*", "/"};
        String split = "";
        float temp = 0;

        for (int i = 0; i < math.length; i++) 
        {
            if (str.indexOf(math[i]) != -1 )
            {
                split = math[i];
            }
        }
        str =  str.replace(split, " ");
        String[] myStr = str.split(" ");
        Integer one = new Integer(myStr[0]);
        Integer two = new Integer(myStr[1]);

        if (split == "-") temp = one - two;
        if (split == "+") temp = one + two;
        if (split == "*") temp = one * two;
        if (split == "/") temp = one / two;

        System.out.println(temp);
        // System.out.println(Arrays.toString(myStr));
    }
}
