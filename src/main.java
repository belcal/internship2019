import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        String SILVER = "SILVER", GOLD = "GOLD", PLATINUM = "PLATINUM";
        ArrayList<Account> accounts = new ArrayList<>();
        Account acc1 = new Account(SILVER, 0.3, 0.2, 5000);
        Account acc2 = new Account(GOLD, 0.6, 0.4, 700);
        Account acc3 = new Account(PLATINUM, 0.9, 0.5, 300);
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);

        Redsitribute red = new Redsitribute();
        red.redistributeMoney(accounts);
        System.out.println(accounts);

        int total = 0;
        int months = 39;
        for (int i = 12; i < months; i += 12) {
            for (Account account : accounts) {
                if (account.amount > 0) {
                    if (account.amount > 500) {
                        account.amount += 500 * account.interest1 / 100;
                        account.amount += ((account.amount - 500) * account.interest2 / 100);
                    } else {
                        account.amount += account.amount + account.amount * account.interest1 / 100;
                    }
                }
            }
        }
        for(Account account : accounts)
            total += account.amount;
        System.out.println(total);
    }
}
