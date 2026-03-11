
class BankAccount {

    double getinterestrate() {
        return 0.00;
    }
}

class savingsaccount extends BankAccount {

    @Override
    double getinterestrate() {
        return 4.5;
    }
}

class currentaccount extends BankAccount {

    @Override
    double getinterestrate() {
        return 3.0;
    }
}

public class bankoverriding {

    public static void main(String[] args) {
        BankAccount sa = new savingsaccount();
        BankAccount ca = new currentaccount();
        System.out.println("Savings Interest Rate: " + sa.getinterestrate());
        System.out.println("Current Interest Rate: " + ca.getinterestrate());

    }

}
