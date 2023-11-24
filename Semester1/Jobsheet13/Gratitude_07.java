package Semester1.Jobsheet13;

public class Gratitude_07 {
    public static void sayThankyou() {
        System.out.println("Thank you for being the best teacher in the world.\n"+
        "you inspired in me a love for learninh and made me feel like i coukd ask you anyting.");
    }

    public static void sayAdditionalGreeting(String greeting) {
        System.out.println(greeting);   
    }
    public static void main(String[] args) {
        sayThankyou();
        String expression = "Thankyou ... wish you all the best!!";
        sayAdditionalGreeting(expression);
    }
}
