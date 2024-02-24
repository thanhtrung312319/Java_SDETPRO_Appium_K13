package Java_Lab;

public class Java_lab_6_3 {
    public static void main (String[] args){
        String value = "12345nabc678";
        System.out.println(extractNumberFromString(value));
    }
    public static String extractNumberFromString(String source) {
        StringBuilder result = new StringBuilder(100);
        for (char ch : source.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                result.append(ch);
            }
        }

        return result.toString();

    }
}
