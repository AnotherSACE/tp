package command;

import exceptions.NullException;
import ui.Ui;
import seedu.duke.TransactionManager;

public class SetBudgetCommand extends Command {

    /**
     * Constructs a {@code CheckDateCommand} with the specified date string.
     * The date string is parsed into a {@code LocalDate} format.
     *
     * @param amount The int representing the budget to set.
     * @throws NullException If the date format is invalid.
     */
    public SetBudgetCommand(double amount, TransactionManager transactions, Ui ui) throws NullException {

        try {
            if (amount > 0) {
                transactions.checkBudgetLimit(amount);
            } else {
                throw new NullException("Invalid input amount, amount can not be negative!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ui.PrintBudgetLimit(transactions.getTransactions(), amount);
    }

    /**
     * Executes the command by searching for tasks scheduled on the specified date
     * and displaying the results to the user.
     *
     * @param transactions The task list containing all tasks.
     * @param ui           The user interface for displaying results.
     *                     //* @param storage  The storage system (not used in this command).
     * @throws NullException If an error occurs while processing the command.
     */
    @Override
    public void execute(TransactionManager transactions, Ui ui) throws NullException {
        // Check for whether exceed the budget limit or not.
        //transactions.checkBudgetLimit();

        // Display the budget limit
        //ui.PrintBudgetLimit(transactions.getTransactions(), budgetLimit);
    }
}
