package Eats.Unlimited.View;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class UEView {

    private JFrame frame;
    private JButton genButton;
    private JButton accountsButton;
    private JPanel buttonPanel;
    private JPanel defaultPanel;
    private JLabel defaultLabel;
    private JTextField userNameTextField;
    private JLabel userNameLabel;
    private JLabel passLabel;
    private JPasswordField passwordField;
    private JPanel genPanel;
    private Container c;
    private CardLayout mainPaneCardLayout;


    public UEView(){

        frame = new JFrame("Unlimited Eats 2.0");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension minSize = new Dimension(400,250);
        frame.setMinimumSize(minSize);
        frame.setBackground(Color.lightGray);
        Border padding = BorderFactory.createEmptyBorder(4,4,4,4);


        //gotta reference src folder in file
        Icon genIcon = new ImageIcon("src/main/java/org/example/settings-min.png");

        genButton = new JButton("Generate");
        //make back of button transparent for icon: genButton.setBorder(new EmptyBorder(3,0,3,0));
        accountsButton = new JButton("Accounts");
        GridBagLayout gridLayout = new GridBagLayout();
        buttonPanel = new JPanel(gridLayout);
        //figure out how to draw a line
        //Line2D splitLine = new Line2D.Float(20,frame.getHeight() - 20,20,20);

        //create constraints to be altered for each new component added
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //if there is extra horizontal space then it won't occupy it
        gbc.weightx = 0;
        buttonPanel.add(genButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //insets?
        buttonPanel.add(accountsButton, gbc);

        //figure out how to put multiple panels seamlessly
        //figure out why icon is really big
        //make borderline separating buttons and rest of GUI
        //make horizontal and vertical spacers to make things look nice


        //DEFAULT PANEL
        defaultPanel = new JPanel(gridLayout);
        defaultLabel = new JLabel("Welcome to Unlimited Eats 2.0!");
        defaultPanel.add(defaultLabel);
        defaultPanel.setBorder(padding);


        //MAIN PANEL
        userNameTextField = new JTextField(11);
        userNameLabel = new JLabel(" Enter Username:");
        passLabel = new JLabel(" Enter Password:");
        LineBorder roundedButtonBorder = new LineBorder(Color.gray, 2);
        passwordField = new JPasswordField(11);
        //roundedButtonBorder.getRoundedCorners();
        //passwordField.setBorder(roundedButtonBorder);

        genPanel = new JPanel(gridLayout);
        //default is off


        genPanel.setBorder(padding);
        GridBagConstraints gbc1 = new GridBagConstraints();

        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.anchor = GridBagConstraints.LINE_START;
        genPanel.add(userNameLabel, gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 1;
        genPanel.add(userNameTextField, gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 2;
        genPanel.add(passLabel, gbc1);
        gbc1.gridx = 0;
        gbc1.gridy = 3;
        genPanel.add(passwordField, gbc1);

        c = new JPanel();
        mainPaneCardLayout = new CardLayout();
        c.setLayout(mainPaneCardLayout);
        c.add("Default", defaultPanel);
        c.add("Generate", genPanel);

        frame.getContentPane().add(BorderLayout.WEST, buttonPanel);
        frame.getContentPane().add(BorderLayout.CENTER, c);
        frame.pack();
    }
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JButton getGenButton() {
        return genButton;
    }

    public void setGenButton(JButton genButton) {
        this.genButton = genButton;
    }

    public JButton getAccountsButton() {
        return accountsButton;
    }

    public void setAccountsButton(JButton accountsButton) {
        this.accountsButton = accountsButton;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public void setButtonPanel(JPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public JPanel getDefaultPanel() {
        return defaultPanel;
    }

    public void setDefaultPanel(JPanel defaultPanel) {
        this.defaultPanel = defaultPanel;
    }

    public JLabel getDefaultLabel() {
        return defaultLabel;
    }

    public void setDefaultLabel(JLabel defaultLabel) {
        this.defaultLabel = defaultLabel;
    }

    public CardLayout getMainPaneCardLayout() {
        return mainPaneCardLayout;
    }

    public JTextField getUserNameTextField() {
        return userNameTextField;
    }

    public void setUserNameTextField(JTextField userNameTextField) {
        this.userNameTextField = userNameTextField;
    }

    public JLabel getUserNameLabel() {
        return userNameLabel;
    }

    public void setUserNameLabel(JLabel userNameLabel) {
        this.userNameLabel = userNameLabel;
    }

    public Container getC() {
        return c;
    }

    public JLabel getPassLabel() {
        return passLabel;
    }

    public void setPassLabel(JLabel passLabel) {
        this.passLabel = passLabel;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JPanel getGenPanel() {
        return genPanel;
    }

    public void setGenPanel(JPanel genPanel) {
        this.genPanel = genPanel;
    }



}
