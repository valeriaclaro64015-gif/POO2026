public class TestProduct {
    
    public static void main(String[] args) {
        Product product = new Product("Laptop", 2500000, 10);

        System.out.println("Product: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Stock: " + product.getStock());

        boolean result = product.setName("Gaming Laptop");

        if (result) {
            System.out.println("Name modification accepted.");
        } else {
            System.out.println("Name modification rejected.");
        }

        System.out.println("Current name: " + product.getName());

        result = product.setPrice(3000000);

        if (result) {
            System.out.println("Price modification accepted.");
        } else {
            System.out.println("Price modification rejected.");
        }

        System.out.println("Current price: $" + product.getPrice());

        result = product.setStock(15);

        if (result) {
            System.out.println("Stock modification accepted.");
        } else {
            System.out.println("Stock modification rejected.");
        }

        System.out.println("Current stock: " + product.getStock());

        result = product.setName("");

        if (result) {
            System.out.println("Name modification accepted.");
        } else {
            System.out.println("Name modification rejected.");
        }

        System.out.println("Current name: " + product.getName());

        result = product.setPrice(0);

        if (result) {
            System.out.println("Price modification accepted.");
        } else {
            System.out.println("Price modification rejected.");
        }

        System.out.println("Current price: $" + product.getPrice());

        result = product.setStock(-5);

        if (result) {
            System.out.println("Stock modification accepted.");
        } else {
            System.out.println("Stock modification rejected.");
        }

        System.out.println("Current stock: " + product.getStock());
    }
    
}
