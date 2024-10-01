package com.pluralsight;

import java.util.*;

public class SandwichShop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

System.out.println("Menu: Sandwiches");
System.out.println("All sizes:");
System.out.println("1: Regular ($5.45)");
System.out.println("2: Large ($8.95)");

System.out.println("Choose a sandwich size (1 or 2): ");

int option = s.nextInt();

float price = 0;

if (option == 1) {
    price = 5.45F;
} else if (option == 2) {
    price = 8.95F;
} else {
    System.out.println("Invalid Option.");
    return;
}

System.out.println("      ");

System.out.print("Please enter your age for a possible discount: ");
int age = s.nextInt();
s.nextLine();

float discount = 0;

if (age <= 17) {
    discount = 0.10F;
} else if (age >= 65) {
    discount = 0.20F;
}

float discountAmount = price * discount;
float finalPrice = price - discountAmount;

System.out.printf("Your total will be $%.2f", finalPrice);






    }
}
