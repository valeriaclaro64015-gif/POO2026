public class TestElectronicWallet {
    public static void main(String[] args) {

        ElectronicWallet wallet = new ElectronicWallet("valeria");

        System.out.println("Owner: " + wallet.getOwner());
        System.out.println("Initial balance: $" + wallet.getBalance());
        System.out.println();

        // Valid top-up
        boolean accepted = wallet.topUp(800000);
        if (accepted) {
            System.out.println("Top-up of $800000 accepted.");
        } else {
            System.out.println("Top-up of $800000 rejected.");
        }
        System.out.println("Current balance: $" + wallet.getBalance());
        System.out.println();

        // Invalid top-up
        accepted = wallet.topUp(-50000);
        if (accepted) {
            System.out.println("Invalid top-up accepted.");
        } else {
            System.out.println("Invalid top-up rejected.");
        }
        System.out.println("Current balance: $" + wallet.getBalance());
        System.out.println();

        // Valid payment
        accepted = wallet.pay(100000);
        if (accepted) {
            System.out.println("Payment of $100000 accepted.");
        } else {
            System.out.println("Payment of $100000 rejected.");
        }
        System.out.println("Current balance: $" + wallet.getBalance());
        System.out.println();

        // Payment above $500000
        accepted = wallet.pay(600000);
        if (accepted) {
            System.out.println("Payment of $600000 accepted.");
        } else {
            System.out.println("Payment of $600000 rejected.");
        }
        System.out.println("Current balance: $" + wallet.getBalance());
        System.out.println();

        // Valid payment of exactly $500000
        accepted = wallet.pay(500000);
        if (accepted) {
            System.out.println("Payment of $500000 accepted.");
        } else {
            System.out.println("Payment of $500000 rejected.");
        }
        System.out.println("Current balance: $" + wallet.getBalance());
        System.out.println();

        // Payment above available balance
        accepted = wallet.pay(300000);
        if (accepted) {
            System.out.println("Payment of $300000 accepted.");
        } else {
            System.out.println("Payment of $300000 rejected.");
        }
        System.out.println("Current balance: $" + wallet.getBalance());
        System.out.println();

        // Invalid payment
        accepted = wallet.pay(-10000);
        if (accepted) {
            System.out.println("Invalid payment accepted.");
        } else {
            System.out.println("Invalid payment rejected.");
        }
        System.out.println("Current balance: $" + wallet.getBalance());
    }
}
