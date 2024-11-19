package ies.losmontecillos.libretasfxml;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTableViewController {
    @FXML
    private TableView<Person> tableView;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField emailField;

    public FXMLTableViewController() {
    }

    @FXML
    protected void addPerson(ActionEvent event) {
        ObservableList<Person> data = this.tableView.getItems();
        data.add(new Person(this.firstNameField.getText(), this.lastNameField.getText(), this.emailField.getText()));
        this.firstNameField.setText("");
        this.lastNameField.setText("");
        this.emailField.setText("");
    }
}
