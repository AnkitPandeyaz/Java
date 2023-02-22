//This program calculate the sale price of an item that is regularly priced at $59, with a 20 percent discount subtracted.

public class A20_Discount {
    public static void main(String[] args){

        //variable to hold regular price, the amount of a discount, and the sale price.

        double regularPrice=59.0;
        double discount;
        double salePrice;


        //calculate the amount of a 20% discount

        discount= regularPrice*0.20;

        //calculate the sale price by subtracting

        salePrice= regularPrice - discount;

        //Display the result.

        System.out.println("Regular price : $ " + regularPrice);
        System.out.println("Discount Amount $ " +discount);
        System.out.println("Sale Price $ " + salePrice);
        
    }
    
}
