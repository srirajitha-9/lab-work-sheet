package Q5;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int EntreeSelection;


// Display Entrée options
        System.out.println("1.\nEntree:");
        System.out.println("1. Tofu Burger");
        System.out.println("2. Cajun Chicken");
        System.out.println("3. Buffalo Wings");
        System.out.println("4. Rainbow Fillet");

// Display Side Dish options
        System.out.println("2.\nSide Dish:");
        System.out.println("1. Rice Cracker - $3.49");
        System.out.println("2. No-Salt Fries - $4.59");
        System.out.println("3. Zucchini - $3.99");
        System.out.println("4. Brown Rice - $2.99");

// Display Drink options
        System.out.println("3.\nDrink:");
        System.out.println("1. Cafe Mocha - $0.79");
        System.out.println("2. Cafe Latte - $0.69");
        System.out.println("3. Espresso - $1.09");
        System.out.println("4. Oolong Tea - $0.59");


        System.out.println("please enter the menu type:");
        int menu_type = scanner.nextInt();



        if (menu_type == 1 ) {

            System.out.println("please enter the entree: (please enter the number 1-4)");

            EntreeSelection = scanner.nextInt();



            if (EntreeSelection == 1)
                System.out.println("Entree: Tofu Burger");
            else if (EntreeSelection == 2)
                System.out.println("Entree : Cajun Chicken");
            else if (EntreeSelection == 3)
                System.out.println("Entree : Buffalo Wings");
            else
                System.out.println("Entree : Rainbow Fillet");
        }



        else if (menu_type==2) {
            System.out.println("please enter the side dish: (please enter the number 1-4)");
            int SidedishSelection = scanner.nextInt();


            if (SidedishSelection == 1)
                System.out.println("Side dish: Rice Cracker - $3.49");
            else if (SidedishSelection == 2)
                System.out.println("Side dish : No-Salt Fries - $4.59");
            else if (SidedishSelection == 3)
                System.out.println("side dish: Zucchini - $3.99");
            else
                System.out.println("side dish: Brown Rice - $2.99");
        }



        else {

            System.out.println("please enter the entree: (please enter the number 1-4)");
            int drinkSelection = scanner.nextInt();


            if (drinkSelection == 1)
                System.out.println("Drink : Cafe Mocha - $0.79");
            else if (drinkSelection == 2)
                System.out.println("Drink : Cafe Latte - $0.69");
            else if (drinkSelection == 3)
                System.out.println("Drink : Espresso - $1.09");
            else
                System.out.println("Drink : Oolong Tea - $0.59");
        }


    }
}