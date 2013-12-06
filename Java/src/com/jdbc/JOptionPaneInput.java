package com.jdbc;

import javax.swing.*;
public class JOptionPaneInput
{
  public static void main(String[] args)
  {
    // a jframe here isn't strictly necessary, but it makes the example a little more real
    JFrame frame = new JFrame("InputDialog Example #1");

    // prompt the user to enter their name
    String name = JOptionPane.showInputDialog(frame, "What's your name?");

    // get the user's input. note that if they press Cancel, 'name' will be null
    System.out.printf("The user's name is '%s'.\n", name);
    System.exit(0);
  }
}