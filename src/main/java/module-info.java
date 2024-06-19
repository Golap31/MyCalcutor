module cse213projects.spring2024.mycalcutor {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213projects.spring2024.mycalcutor to javafx.fxml;
    exports cse213projects.spring2024.mycalcutor;
}