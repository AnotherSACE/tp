package ui;

import exceptions.NullException;
import seedu.duke.Transaction;
import seedu.duke.TransactionManager;
import seedu.duke.TransactionManager.*;

import java.util.ArrayList;
import java.util.Scanner;

import static constant.Constant.LINE_SEPARATOR;

public class ui {
    /**
     * Scanner for reading user input.
     */
    private final Scanner scanner;

    /**
     * Constructs a {@code Ui} instance and initializes the input scanner.
     */
    public ui() {
        scanner = new Scanner(System.in);
    }

    /**
     * Reads the user input from the command line.
     *
     * @return the user's input as a string.
     */
    public String readCommand() {
        System.out.println("\nEnter your command:");
        return scanner.nextLine();
    }

    /**
     * Prints the welcome message when the application starts.
     */
    public void printWelcomeMessage() {
        showLine();
        System.out.println(" Hello! This is NoteUrSavings here!" + "\n" + " What can I do for you?");
        showLine();
    }

    /**
     * Prints a given message to the console.
     *
     * @param message the message to be displayed.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Prints a horizontal line separator.
     */
    public static void showLine() {
        System.out.println(LINE_SEPARATOR);
    }

    /**
     * Displays an error message.
     *
     * @param message the error message to be displayed.
     */
    public void showError(String message) {
        System.err.println("Error: " + message); // Display the error
    }

    /*
     * Function for setting the expense limit for a specific time duration?
     * The type default is expense
     * Can keep the amount as for the all-time spend limit first
     */
    public void PrintBudgetLimit(ArrayList<Transaction> transaction, int amount) {
        showLine();
        System.out.println("Budget limit set to " + amount + " " + transaction.get(0).getCurrency());
        showLine();
    }

    // Lists all upcoming notifications
    public void listNotifications(ArrayList<Transaction> upcomingTransactions, String description) {
        showLine();
        if (upcomingTransactions.isEmpty()) {
            System.out.println("No upcoming expenses.");
        } else {
            System.out.println("Upcoming Expenses:");
            for (Transaction transaction : upcomingTransactions) {
                if (transaction.getDescription().equals(description)) {
                    System.out.println("- " + transaction.getDescription() + " of " + transaction.getAmount() + " "
                            + transaction.getCurrency() + " in category " + transaction.getCategory() + " is due on "
                            + transaction.getDate().toString());
                }
            }
        }
        showLine();
    }
}
