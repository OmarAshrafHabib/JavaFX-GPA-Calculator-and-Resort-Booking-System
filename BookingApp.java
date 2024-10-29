
/**
 * this application creats a booking outlet for users using javafx
 * @author Omar Habib ID:3742418
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.text.NumberFormat;
import java.util.Locale;

public class BookingApp extends Application {
    NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
    private TextField nameField;
    private TextField mealsField;
    private TextField spaField;
    private Button tourist;
    private Button elite;
    private Button reset;
    private Text greetings;
    private Text text;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Package calculator");
        nameField = new TextField();
        nameField.setPrefWidth(200);
        mealsField = new TextField();
        mealsField.setPrefWidth(50);
        spaField = new TextField();
        spaField.setPrefWidth(50);

        Label nameLabel = new Label("Guest name: ");
        Label mealsLabel = new Label("Number of à la carte meals: ");
        Label spaLabel = new Label("Number of Spa visits: ");

        greetings = new Text("Welcome to Paradise Palms!");
        text = new Text("Enter your booking information");

        tourist = new Button("Tourist Package");
        elite = new Button("Elite Package");
        reset = new Button("Reset");

        tourist.setOnAction(this::processButton);
        elite.setOnAction(this::processButton2);
        reset.setOnAction(this::processButton3);

        HBox box1 = new HBox(nameLabel, nameField);
        HBox box2 = new HBox(mealsLabel, mealsField);
        HBox box3 = new HBox(spaLabel, spaField);
        HBox box4 = new HBox(tourist, elite, reset);

        VBox box = new VBox(box1, box2, box3, box4, greetings, text);

        FlowPane pane = new FlowPane(box);
        pane.setVgap(12);
        box1.setSpacing(15);
        box2.setSpacing(15);
        box3.setSpacing(15);
        box4.setSpacing(15);
        box.setSpacing(15);
        pane.setVgap(12);
        pane.setHgap(12);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processButton(ActionEvent event) {
        String name = nameField.getText();
        int meals = Integer.parseInt(mealsField.getText().toString());
        int spa = Integer.parseInt(spaField.getText().toString());

        TouristPackageBooking tourist = new TouristPackageBooking(name, meals, spa);
        greetings.setText("Building number: " + tourist.getBuildingNumber());
        text.setText("Total price for this package: " + formatter.format(tourist.calculatePrice()));

    }

    public void processButton2(ActionEvent event) {
        String name = nameField.getText();
        int meals = Integer.parseInt(mealsField.getText().toString());
        int spa = Integer.parseInt(spaField.getText().toString());

        ElitePackageBooking elite = new ElitePackageBooking(name, meals, spa);
        greetings.setText("Building number: " + elite.getBuildingNumber());
        text.setText("Total price for this package: " + formatter.format(elite.calculatePrice()));

    }

    public void processButton3(ActionEvent event) {
        nameField.clear();
        mealsField.clear();
        spaField.clear();
        greetings.setText("Welcome to Paradise Palms!");
        text.setText("Enter your booking information");
    }

}