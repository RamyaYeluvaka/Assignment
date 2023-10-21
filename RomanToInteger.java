import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number as input convert to integer: ");
        String input = scanner.nextLine();
        //String romanNumeral = "CXII"; 
        int integerValue = romanToInt(input);
        System.out.println("Roman numeral " + input + " is equivalent to " + integerValue);
    }
}
