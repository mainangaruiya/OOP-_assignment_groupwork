import javax.swing.*;
import java.awt.*;

public class PalindromeChecker {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Check if a Number is Palindrome");
        frame.getContentPane().setBackground(Color.ORANGE);

        JLabel titleLabel = new JLabel("Check if a Number is Palindrome:");
        titleLabel.setBounds(90, 20, 250, 20);

        JLabel enterLabel = new JLabel("Enter the number:");
        enterLabel.setBounds(50, 60, 150, 20);

        JTextField textField = new JTextField();
        textField.setBounds(50, 90, 150, 20);

        JButton checkButton = new JButton("Check");
        checkButton.setBounds(50, 130, 95, 30);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(160, 130, 200, 30);

        frame.add(titleLabel);
        frame.add(enterLabel);
        frame.add(textField);
        frame.add(checkButton);
        frame.add(resultLabel);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        checkButton.addActionListener(e -> {
            String inputText = textField.getText();
            if (isPalindrome(inputText)) {
                resultLabel.setText(inputText + " is a palindrome");
            } else {
                resultLabel.setText(inputText + " is not a palindrome");
            }
        });
    }

    public static boolean isPalindrome(String number) {
        int length = number.length();
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
