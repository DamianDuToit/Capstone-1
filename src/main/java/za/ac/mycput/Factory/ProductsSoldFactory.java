package za.ac.cput.Factory;
import za.ac.cput.Entity.ProductsSold;

/*
PaymentFactory.java
 Factory for the Payment
 Author: Damian du Toit (219200203)
 Date: 07 April 2022
*/

public class ProductsSoldFactory {

    public static ProductsSold productsSold(String ProductName, int AmountOfProduct) {

        if (ProductName.isEmpty() || AmountOfProduct <= 0)
            return null;

        ProductsSold productsSold = new ProductsSold.Builder()
                .setProductName(ProductName)
                .setAmountOfProduct(AmountOfProduct)
                .build();

        return productsSold;
    }
}