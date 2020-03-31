import java.util.Scanner;

public class Main {
    private double money;


    public static void main(String[] args) {
        int games_played = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what is your name? ");
        //String name = scan.nextLine();
        String name = "Test";

        System.out.println("How much cash you have today? ");
        //double money = scan.nextDouble();

        double money = 100; //TODO remove test values
        double startMoney = money;

        System.out.println("Hello, " + name + " we hope you are ready to play some blackjack.\n");

        // Gameplay loop
        while (money > 0) {
            if (games_played != 0) {
                System.out.println("Continue playing?");
                String answer = scan.nextLine();


                // Yes/No
                if (answer.toLowerCase().equals("no")) {
                    System.out.print("Thank you for playing!");
                    break;
                }
            }

            System.out.println("Insert your bet amount: ");
            double bet = Double.parseDouble(scan.nextLine());
            money -= bet;

            Blackjack game = new Blackjack();
            money += game.startPlay(bet);
            System.out.printf("balance %s\n", money);
            games_played++;
        }

        double difference = money - startMoney;
        if (money == 0) {
            System.out.println("Unfortunately you do not have enough funds to play more.");
        }
        else if (difference > 0) {
            System.out.printf("You won %s , have a great night.", difference);
        }
        else {
            System.out.printf("You lose %s , have a great night.", difference);
        }
    }
}