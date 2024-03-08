import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserPrompt {

    public String rollAgain(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to roll again? (y/n)");
        return input.next().toLowerCase();
    }

    public String holdDice(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to keep any of these dice for your next roll? (y/n)");
        return input.next().toLowerCase();
    }

    public int[] chooseDice(){
        System.out.print("Please choose which dice (if any) you would like to keep for your next roll;\n" +
                "enter the number (1-5) for each dice, separated by a comma. \nEnter '0' to roll all five dice again. Enter '9' to keep all dice and record a score for this turn.");
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        input.useDelimiter(" ");
        while (input.hasNext()){
            list.add(input.nextInt()-1);        // user input is 1-5, we want 0-4 for the array index
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int scoreCardSection(){
        System.out.print("Please enter the number of the section you would like to enter this score in: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
