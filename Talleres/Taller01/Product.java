public class Product {
     private String name;
     private double price;
     private int stock;
    public Product(String name, double price, int stock) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }
    public String getName() {
        return name;
    }
     public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public boolean setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
            return true;
        }
        return false;
    }
    public boolean setPrice(double price) {
        if (price > 0) {
            this.price = price;
            return true;
        }
        return false;
    }
    public boolean setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
            return true;
        }
        return false;
    }
}

