package command;

import seedu.duke.TransactionManager;
import ui.Ui;

public class DeleteCommand extends Command{
    int expenseIndex;
    /**
     * Creates a DeleteCommand with the specified translation index.
     *
     * @param ExpenseIndex The index of the task to be deleted (zero-based).
     */
    public DeleteCommand(int ExpenseIndex,TransactionManager transactions, Ui ui) {
        this.expenseIndex = ExpenseIndex;
        Ui.printDeleteTask(transactions.getTransactions().get(ExpenseIndex), transactions.getSize() - 1);
        transactions.deleteExpense(ExpenseIndex);
    }

    /**
     * Executes the command by deleting the task at the specified index,
     * displaying a message after the specified task is deleted, and saving the updated list to storage.
     * If the index is out of bounds, an error message is displayed.
     *
     * @param transactions   The translation list where the task will be deleted.
     * @param ui      The user interface for displaying messages.
     */
    @Override
    public void execute(TransactionManager transactions, Ui ui) {
        Ui.printDeleteTask(transactions.getTransactions().get(expenseIndex), transactions.getSize() - 1);
        transactions.deleteExpense(expenseIndex);
    }
}
