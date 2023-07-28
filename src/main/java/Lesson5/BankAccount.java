package Lesson5;

public class BankAccount {
    int id;
    double balance;

    void popolnenieScheta(double summaPopolneniya) {
        balance += summaPopolneniya;
    }

    void snyatieSoScheta(double summaSnyatiya) {
        balance -= summaSnyatiya;
    }
}
