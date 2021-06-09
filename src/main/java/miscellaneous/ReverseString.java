package miscellaneous;

public class ReverseString {

    public static void main(String[] args) {
        String inputString = "This is coding";
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = inputString.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
                stringBuilder.append(  chars[i])  ;
        }
        System.out.println("Reversed String "+ stringBuilder.toString());
    }
}
