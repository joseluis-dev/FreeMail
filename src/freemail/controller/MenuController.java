package freemail.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class MenuController {

    @FXML
    private Button sendMailButton;

    @FXML
    private Button recievedMessages;

    @FXML
    private MenuItem AddAccountButton;

    @FXML
    private MenuItem changeAccountInformationButton;

    @FXML
    private MenuItem deleteAccountButton;

    @FXML
    void pushAddAccountButton(ActionEvent event) {
    	General.menu.close();
    	General.addNewAccount.show();
    }

    @FXML
    void pushChangeAccountInformationButton(ActionEvent event) {

    }

    @FXML
    void pushDeleteAccountButton(ActionEvent event) {

    }

    @FXML
    void pushRecievedMessages(ActionEvent event) {
    	General.menu.close();
    	General.receivedMessages.show();
    }

    @FXML
    void pushSendMailButton(ActionEvent event) {
    	General.menu.close();
    	General.sendMail.show();
    }

}