package dev.lpa;

public class Main {

    public static void main(String[] args) {

        Customer bob = new Customer("Bob S.", 1000.0);
        System.out.println(bob);    // Customer[name=BOB S., transactions=[1000.0]]
    }
}
