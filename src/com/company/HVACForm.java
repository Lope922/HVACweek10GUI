package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Lope on 3/30/2015.
 */
public class HVACForm extends JFrame {
    private JPanel rootPanel;
    private JCheckBox furnaceCheckBox;
    private JCheckBox acCheckBox;
    private JList FurnaceList;
    private JList AClist;
    private JButton addServiceCallButton;
    private JButton resolveServiceCallButton;
    private JTextField addressTextField;
    private JList ACcallList;
    private JList furnaceCallList;
    private JSpinner spinner1;
    private JTextField probDesciptionTextField;
    private JTextField HVACageTextfield;

    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
//    SpinnerDateModel spinnerDateModel = new SpinnerDateModel("MM,dd,yy");{


    //set the models for both the list used in this app.
    DefaultListModel<CallForService> callForServiceDefaultListModel;


    // setup the window.
    protected HVACForm() {
        super("HVAC Ticket Manager");// declare super as the label for this app.
        setContentPane(rootPanel); // get the content pane for this GUI as the rootPanel
        pack(); // pack all the contents into the box
        setVisible(true); // set the GUI window to visible by default.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make the jlist's invisible until data is added.
        furnaceCallList.setVisible(false);
        ACcallList.setVisible(false);


        // add the action listener to the main form to listen for button click events
        addServiceCallButton.addActionListener(new ActionListener() {
        });
    }

    //TODO write the code to add info to the list.


    @Override
    public void actionPerformed(ActionEvent e) {
        String servCallAddress = addressTextField.getText();
        Date callRequestdate = spinner1.getDate();
        String servCallDescript = probDesciptionTextField.getText();
        int ageOfHVAC = Integer.parseInt(HVACageTextfield.getText()); // parse the info read from HVAC age to display the
        // integer as a string

        if (furnaceCheckBox.isSelected()) {
            // make that list visible
            furnaceCallList.setVisible(true);
            {
                // add to the furnace list of tickets
                callForServiceDefaultListModel.addElement(CallForService(servCallAddress, callRequestdate, servCallDescript, ageOfHVAC));

            }else if (acCheckBox.isSelected()) {

                // make the ac call list visible
                ACcallList.setVisible(true);
                // add the service call to the list of ac service calls
                callForServiceDefaultListModel2.addElement(CallForService(servCallAddress,callRequestdate, servCallDescript, ageOfHVAC))
            }
        }
    }
}

