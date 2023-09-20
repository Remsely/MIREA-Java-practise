package practise7.Task5and6;

public class ProcessStrings implements StringManipulator{
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String extractOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0)
                result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings();

        String inputString = "Hello world!";

        System.out.println("Кол-во символов: " + processStrings.countCharacters(inputString));
        System.out.println("Символы на нечетных позициях: " + processStrings.extractOddPositionCharacters(inputString));
        System.out.println("Инвертированная строка: " + processStrings.reverseString(inputString));
    }
}
