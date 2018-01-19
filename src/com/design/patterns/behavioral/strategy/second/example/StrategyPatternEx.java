package com.design.patterns.behavioral.strategy.second.example;

import java.util.Scanner;

public class StrategyPatternEx {

    public static void main(String[] args) {
        System.out.println("***Stragegy Pattern Demo***");
        Scanner in = new Scanner(System.in);
        Choice c = null;
        Context ctx = new Context();
        String input1, input2;

        //Looping twice to test two different choices
        try {
            for (int i = 1; i <= 2; i++) {
                System.out.print("Enter an Integer: 4");
                input1 = in.nextLine();
                System.out.print("Enter another integer: ");
                input2 = in.nextLine();

                System.out.print("Press 1 for Addition, 2 for Contanetation: ");
                String choice = in.nextLine();

                if (choice.equals("1")) {
                    // If user input is 1, create object of FirstChoice (Strategy 1)
                    c = new FirstChoice();

                } else {
                    // If user input is 2, create object of SecondChoice (Strategy 2)
                    c = new SecondChoice();
                }

                // Associate the strategy with context
                ctx.setChoice(c);
                ctx.showChoice(input1, input2);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of Strategy Pattern");
    }
}
