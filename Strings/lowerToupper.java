import java.util.*;

public class lowerToupper {

    public static String convertUpper(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        // Capitalize first character
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String in LowerCase: ");
        String str = sc.nextLine();   

        System.out.println("UpperCase String: " + convertUpper(str));

        sc.close();
    }
}