import java.util.Stack;

public class App {

    public static void main(String[] args) throws Exception {
        int maxLimit = 2000;
        long generator = odd_squares_sum(maxLimit);
        System.out.println("Max limit" + maxLimit + "\n" + "Sum : " + generator);

        int val1 = 15, val2 = 5;
        double GCD = greatest_common_divisor(val1, val2);
        System.out.println("Greatest common divisor of " + val1 + " and " + val2 + "= " + GCD);

    }
//Question 1
    public static void isValid(){
         String inputString = "{()}";
        Stack<Character> valid = new Stack<>();\

        for(int i = 0;i < inputString.length(); i++ ){

            if(inputString.charAt(i) == '{' || inputString.charAt(i) == '[' || inputString.charAt(i) == '(' ){
                inputString.push(inputString.charAt(i));
            } else 
            if (!inputString.isEmpty() && 
            (inputString.charAt(i) == '}' && inputString.peek() == "{") ||
            (inputString.charAt(i) == ']' && inputString.peek() == "[") ||
            (inputString.charAt(i) == ')' && inputString.peek() == "(") )
            {
            inputString.pop();
            } else {
                inputString.push(inputString.charAt(i));
            }
        }

        if(inputString.isEmpty()){
            System.out.println("is Valid");
        } else {
            System.out.println("is not Valid");  
        }
    }
// Question 2
    public static long odd_squares_sum(int maxLimit) {
        long generator = 0;
        for (int i = 1; i <= maxLimit; i = i + 2) {
            generator = (long) (Math.pow(i, 2) + generator);
        }
        return generator;
    }
// Question 3
    public static double greatest_common_divisor(int val1, int val2){
    double ans = 0;
    int remainder = 0;

    if(val1 < 0 || val2 < 0){
        return ans;
    }else{
        while (val1%val2 >  0)[
            remainder = val1%val2;
            val1 = val2;
            val2 = remainder;
        ]
        return val2;
    }
    }

}
