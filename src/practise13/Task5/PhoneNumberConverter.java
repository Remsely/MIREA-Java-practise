package practise13.Task5;

public class PhoneNumberConverter {
    public static String convertToFormattedNumber(String inputNumber){
        if(inputNumber.startsWith("+") && inputNumber.length() == 12)
            return inputNumber.substring(0, 2) + " (" + inputNumber.substring(2, 5) + ") " + inputNumber.substring(5, 8)
                    + "-" + inputNumber.substring(8, 10) + "-" + inputNumber.substring(10, 12);
        else if (inputNumber.startsWith("8") && inputNumber.length() == 11)
            return "+7 (" + inputNumber.substring(1, 4) + ") " + inputNumber.substring(4, 7) + "-"
                    + inputNumber.substring(7, 9) + "-" + inputNumber.substring(9, 11);
        else
            return "Некорректный формат номера!";
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79151981661";
        String phoneNumber2 = "89163062984";
        String phoneNumber3 = "+19882340822";
        String phoneNumber4 = "12345678901";

        System.out.println("-----------------------");
        System.out.println(convertToFormattedNumber(phoneNumber1));
        System.out.println(convertToFormattedNumber(phoneNumber2));
        System.out.println(convertToFormattedNumber(phoneNumber3));
        System.out.println(convertToFormattedNumber(phoneNumber4));
    }
}
