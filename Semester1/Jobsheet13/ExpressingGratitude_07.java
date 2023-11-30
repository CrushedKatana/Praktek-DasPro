package Semester1.Jobsheet13;

import java.util.Scanner;

public class ExpressingGratitude_07 {
    public static String getGreetinRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        return recipientName;
    }
    public static String additionalGreetings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Say additional greeting: ");
        String additionalGreeting = sc.nextLine();
        return additionalGreeting;
    }
    public static void sayThankyou() {
        String name = getGreetinRecipient();
        System.out.println("Thank you "+name+" for being the best teacher in the world. \n"+
        "You inpired in me a love for learning and made me feel like i could ask you anyting.");
    }
    public static void sayAdditionalGreetings() {
        String addGreeting = additionalGreetings();
        System.out.println(addGreeting);
    }
    
    public static void main(String[] args) {
        sayThankyou();
        sayAdditionalGreetings();
    }
}
