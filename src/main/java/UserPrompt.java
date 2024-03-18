import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserPrompt {

    public String rollAgain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to roll again? (y/n)");
        return input.next().toLowerCase();
    }

    public Integer[] chooseDiceToRoll() {
        System.out.print("Please choose which dice (if any) you would like to roll again;\n" +
                "enter the number (1-5) for each dice, separated by a space (e.g. to roll the first and third dice, enter 1 3). \nEnter '0' to roll all five dice again. Enter '9' to keep all dice and record a score for this turn.");
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String enteredNumbers = input.nextLine();
        Scanner numbersToSplit = new Scanner(enteredNumbers);
        while (numbersToSplit.hasNext()) {
            list.add(numbersToSplit.nextInt());
        }
        return (Integer[]) list.toArray();
    }

    public int scoreCardSection(){
        System.out.print("Please enter the number of the section you would like to enter this score in: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
