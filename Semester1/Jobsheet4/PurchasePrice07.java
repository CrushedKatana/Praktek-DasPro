package Semester1.Jobsheet4;
import java.util.Scanner;
public class PurchasePrice07 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int price, quantity, pageCount;
    double discount, totalPrice, purchasePrice, totalDiscount;
    String bookBrand;

    
    System.out.println("Input book brand: ");
    bookBrand = input.nextLine();
    System.out.println("Input page count: ");
    pageCount = input.nextInt();
    System.out.println("Input price: ");
    price=input.nextInt();
    System.out.println("Input quantity: ");
    quantity=input.nextInt();
    System.out.print("Input discount: ");
    discount = input.nextDouble();

    totalPrice=price*quantity;
    totalDiscount=totalPrice*discount;
    purchasePrice=totalPrice-totalDiscount;

    System.out.println("Book brand: " + bookBrand);
    System.out.println("Page count: " + pageCount);
    System.out.println("Total discount: "+totalDiscount);
    System.out.println("Final purchase price: "+purchasePrice);
    }
}
