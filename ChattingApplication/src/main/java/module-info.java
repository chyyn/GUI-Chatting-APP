module chatting.chattingapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    requires com.jfoenix;

    opens chatting.Message to javafx.fxml;
    exports chatting.Message;
}