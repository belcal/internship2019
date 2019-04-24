public class Account {
    String type;
    double interest1, interest2;
    int amount;

    public Account(String type, double interest1, double interest2, int amount) {
        this.type = type;
        this.interest1 = interest1;
        this.interest2 = interest2;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "type='" + type + '\'' +
                ", interest1=" + interest1 +
                ", interest2=" + interest2 +
                ", amount=" + amount +
                '}';
    }
}
