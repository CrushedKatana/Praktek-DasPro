package Semester1.Jobsheet4;

import java.util.Scanner;

public class PurchasePrice07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int price, quantity, pageCount;
    double discount, totalPrice, purchasePrice, totalDiscount;
    String bookBrand;

    
    System.out.print("Input book brand: ");
    bookBrand = input.nextLine();
    System.out.print("Input page count: ");
    pageCount = input.nextInt();
    System.out.println("Input price: ");
    price=input.nextInt();
    System.out.println("Input quantity: ");
    quantity=input.nextInt();
    System.out.print("Input discount (in decimal form, e.g., 0.1 for 10%): ");
    discount = input.nextDouble();

    totalPrice=price*quantity;
    totalDiscount=totalPrice*discount;
    purchasePrice=totalPrice-totalDiscount;

    System.out.println("Total discount: "+totalDiscount);
    System.out.println("Final purchase price: "+purchasePrice);

    }
}
