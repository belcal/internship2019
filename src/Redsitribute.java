import java.util.List;


public class Redsitribute {

    public Account highestInterest(List<Account> accounts) {
        double interest = 0;
        Account a = accounts.get(0);
        for (Account account : accounts) {
            if (account.amount < 5000) {
                if (account.amount >= 500) {
                    if (interest < account.interest2) {
                        a = account;
                        interest = account.interest2;
                    }
                } else if (interest < account.interest1) {
                    a = account;
                    interest = account.interest1;
                }
            }
        }
        return a;
    }

    public List<Account> redistributeMoney(List<Account> accounts) {
        int totalAmount = 0;
        for (Account account : accounts) {
            totalAmount += account.amount;
            account.amount = 0;
        }
        while (totalAmount > 0) {
            Account toDeposit = highestInterest(accounts);
            if (toDeposit.amount > 500) {
                int deposit = 5000 - toDeposit.amount;
                toDeposit.amount += deposit;
                totalAmount = totalAmount - deposit;
            } else {
                toDeposit.amount += 500;
                totalAmount -= 500;
            }
        }
        return accounts;
    }
}
