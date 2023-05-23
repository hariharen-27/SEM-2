import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class Expense {
    private String description;
    private double amount;

    public Expense(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

class User {
    private String username;
    private String password;
    private ExpenseTracker expenseTracker;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.expenseTracker = new ExpenseTracker();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ExpenseTracker getExpenseTracker() {
        return expenseTracker;
    }
}

class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String description, double amount) {
        Expense expense = new Expense(description, amount);
        expenses.add(expense);
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}

public class ExpenseTrackerUI {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField descriptionField;
    private JTextField amountField;
    private JTextArea expenseTextArea;
    private JLabel totalExpenseLabel;
    private JButton loginButton;
    private JButton logoutButton;
    private User currentUser;

    private java.util.List<User> users;
    private java.util.Map<String, String> userCredentials;

    public ExpenseTrackerUI() {
        userCredentials = new java.util.HashMap<>();
        users = new java.util.ArrayList<>();
        initializeCredentials();
        initializeUI();
    }

    private void initializeCredentials() {
        // Initialize some user credentials (You can add more users here)
        userCredentials.put("user1", "pass1");
        userCredentials.put("user2", "pass2");
    }

    private void initializeUI() {
        frame = new JFrame("Expense Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JPanel loginPanel = new JPanel(new FlowLayout());
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(10);
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (authenticateUser(username, password)) {
                    login(username);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);

        JPanel expensePanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel descriptionLabel = new JLabel("Description:");
        descriptionField = new JTextField(15);
        JLabel amountLabel = new JLabel("Amount:");
        amountField = new JTextField(10);
        JButton addButton = new JButton("Add Expense");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String description = descriptionField.getText();
                double amount = Double.parseDouble(amountField.getText());
                currentUser.getExpenseTracker().addExpense(description, amount);
                updateExpenseList();
                updateTotalExpense();
                clearFields();
            }
        });

        inputPanel.add(descriptionLabel);
        inputPanel.add(descriptionField);
        inputPanel.add(amountLabel);
        inputPanel.add(amountField);
        inputPanel.add(addButton);

        expenseTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(expenseTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        totalExpenseLabel = new JLabel("Total Expenses: $0.00");

        JPanel logoutPanel = new JPanel(new FlowLayout());
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logout();
            }
        });
        logoutPanel.add(logoutButton);

        expensePanel.add(inputPanel, BorderLayout.NORTH);
        expensePanel.add(scrollPane, BorderLayout.CENTER);
        expensePanel.add(totalExpenseLabel, BorderLayout.SOUTH);

        frame.add(loginPanel, BorderLayout.NORTH);
        frame.add(expensePanel, BorderLayout.CENTER);
        frame.add(logoutPanel, BorderLayout.SOUTH);

        updateUIState(false);
        frame.setVisible(true);
    }

    private boolean authenticateUser(String username, String password) {
        String storedPassword = userCredentials.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    private void login(String username) {
        currentUser = new User(username, userCredentials.get(username));
        users.add(currentUser);
        updateUIState(true);
        updateExpenseList();
        updateTotalExpense();
        clearFields();
    }

    private void logout() {
        currentUser = null;
        updateUIState(false);
        clearFields();
        expenseTextArea.setText("");
        totalExpenseLabel.setText("Total Expenses: $0.00");
    }

    private void updateUIState(boolean loggedIn) {
        usernameField.setEnabled(!loggedIn);
        passwordField.setEnabled(!loggedIn);
        loginButton.setEnabled(!loggedIn);
        descriptionField.setEnabled(loggedIn);
        amountField.setEnabled(loggedIn);
       

        expenseTextArea.setEnabled(loggedIn);
        logoutButton.setEnabled(loggedIn);
    }

    private void updateExpenseList() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for (Expense expense : currentUser.getExpenseTracker().getExpenses()) {
            sb.append(expense.getDescription()).append(": $").append(decimalFormat.format(expense.getAmount())).append("\n");
        }
        expenseTextArea.setText(sb.toString());
    }

    private void updateTotalExpense() {
        double totalExpenses = currentUser.getExpenseTracker().getTotalExpenses();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        totalExpenseLabel.setText("Total Expenses: $" + decimalFormat.format(totalExpenses));
    }

    private void clearFields() {
        descriptionField.setText("");
        amountField.setText("");
    }

    public static void main(String[] args) {
        new ExpenseTrackerUI();
    }
}
