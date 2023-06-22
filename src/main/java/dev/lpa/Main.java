package dev.lpa;

public class Main {

    public static void main(String[] args) {

        Customer bob = new Customer("Bob S.", 1000.0);
        System.out.println(bob);    // Customer[name=BOB S., transactions=[1000.0]]

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A.", 500.0);
        System.out.println(bank);
//          Customer (Jane A.) wasn't found
//          New customer add: Customer[name=JANE A., transactions=[500.0]]
//          Bank{name='Chase', customers=[Customer[name=JANE A., transactions=[500.0]]]}

        bank.addTransaction("Jane A.", -10.25);
        bank.addTransaction("Jane A.", -75.01);
        bank.printStatement("Jane A.");
//        ------------------------------
//           Customer name: JANE A.
//           Transactions:
//           $    500,00 (credit)
//           $    -10,25 (debit)
//           $    -75,01 (debit)

        bank.addNewCustomer("Bob S.", 25.0);
        bank.addTransaction("Bob S.", 1000.0);
        bank.printStatement("Bob S.");
//          Customer (Bob S.) wasn't found
//          New customer add: Customer[name=BOB S., transactions=[25.0]]
//          ------------------------------
//          Customer name: BOB S.
//          Transactions:
//          $     25,00 (credit)
//          $   1000,00 (credit)
    }


}
