package practise13.Task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsSwap {
    public static List<String> readWordsFromFile(String filePath){
        List<String> words = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null){
                String[] wordArray = line.split(" "); //\s+
                for (String word : wordArray){
                    if(!word.isEmpty())
                        words.add(word);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return words;
    }

    public static String getLine(String... words){
        if (words == null || words.length == 0)
            return "";

        StringBuilder result = new StringBuilder();
        result.append(words[0]);

        for (int i = 1; i < words.length; i++){
            char lastChar = result.charAt(result.length() - 1);

            boolean found = false;
            for (int j = i; j < words.length; j++){
                String nextWord = words[j].toLowerCase();
                if(nextWord.charAt(0) == lastChar){
                    String s = words[i];
                    words[i] = words[j];
                    words[j] = s;
                    result.append(" ").append(words[i]);
                    found = true;
                    break;
                }
            }
            if (!found)
                break;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = readWordsFromFile(scanner.nextLine());
        System.out.println(words);

        if(!words.isEmpty()){
            String result = getLine(words.toArray(new String[0]));
            System.out.println(result);
        } else {
            System.out.println("В файле нет слов!");
        }
    }
}
