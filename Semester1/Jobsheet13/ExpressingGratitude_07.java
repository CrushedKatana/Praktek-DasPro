package Semester1.Jobsheet13;

import java.util.Scanner;

public class ExpressingGratitude_07 {
    public static String getGreetinRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetinRecipient();
        System.out.println("Thank you "+name+" for being the best teacher in the world. \n"+
        "You inpired in me a love for learning and made me feel like i could ask you anyting.");
    }
    
    public static void main(String[] args) {
        sayThankyou();    
    }

}
