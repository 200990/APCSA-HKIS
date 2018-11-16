import java.util.Scanner;

public class Encryption
{
    
    public void encrypt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your word");
        String word = scanner.nextLine();
        int wordLength = word.length();
        System.out.println("What is your key");
        String answer = scanner.nextLine();
        int answerLength = answer.length();
        char keyArray[] = new char[wordLength];
        for(int i=0; i<wordLength; i++){ 
           keyArray[i] = answer.charAt(i%(answerLength));
        }
        String tempKey = new String(keyArray);
        char tempMessage[] = new char[wordLength];
        for(int i = 0; i<wordLength; i ++){
        int valueWord = (int)word.charAt(i);
        int valueKey = (int)tempKey.charAt(i);
        char valueAnswer = (char)((((valueWord-97) + ((valueKey-71)/2))%26)+97);
        tempMessage[i] = valueAnswer;
        }
        String message = new String(tempMessage);
        System.out.println(message);
    }
}
