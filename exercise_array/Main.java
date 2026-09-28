public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Johnny", "Orlando");
        bank.addCustomer("Louis", "Partridge");
        bank.addCustomer("Chanyeol", "Park");

        System.out.println("Jumlah customer: "
                + bank.getNumOfCustomers());

        // mengambil customer pertama
        Customer customer1 = bank.getCustomer(0);

        System.out.println("Nama customer: "
                + customer1.getFirstName() + " "
                + customer1.getLastName());

        // membuat account
        Account account1 = new Account(1000000);
        Account account2 = new Account(500000);

        // memasukkan account ke customer
        customer1.setAccount(account1);
        customer1.setAccount(account2);

        System.out.println("Jumlah account: "
                + customer1.getNumOfAccounts());

        System.out.println("Saldo awal account 1: "
                + customer1.getAccount(0).getBalance());

        // deposit
        customer1.getAccount(0).deposit(250000);

        System.out.println("Saldo setelah deposit: "
                + customer1.getAccount(0).getBalance());

        // withdraw
        customer1.getAccount(0).withdraw(100000);

        System.out.println("Saldo setelah withdraw: "
                + customer1.getAccount(0).getBalance());

        System.out.println("Saldo account 2: "
                + customer1.getAccount(1).getBalance());
    }
}