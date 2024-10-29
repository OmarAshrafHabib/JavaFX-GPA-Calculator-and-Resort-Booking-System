
/**
 * this code creats a gpa calculator using javafx
 * @author Omar Habib ID:3742418
 */
import java.text.NumberFormat;
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

public class GPA extends Application {

    private double points;
    private TextField letter;
    private TextField hours;
    private Text greetings;
    private Text text;
    private Button add;
    private Button clear;
    private double gpa;

    private double totalCreditHours = 0;
    private double totalPoints = 0;

    public void start(Stage primaryStage) {
        primaryStage.setTitle("GPA Calculator");
        letter = new TextField();
        letter.setPrefWidth(50);
        hours = new TextField();
        hours.setPrefWidth(50);

        Label letterlbl = new Label("Course letter grade: ");
        Label hourslbl = new Label("Course credit hours: ");

        greetings = new Text("Welcome to my GPA calculator!");
        text = new Text("Enter your 1st grade & credit hrs.");

        add = new Button("Add to GPA");
        clear = new Button("Clear GPA");

        HBox box1 = new HBox(letterlbl, letter);
        HBox box2 = new HBox(hourslbl, hours);
        HBox box3 = new HBox(add, clear);
        VBox box = new VBox(box1, box2, box3, greetings, text);

        add.setOnAction(this::processButton);
        clear.setOnAction(this::processButton2);

        FlowPane pane = new FlowPane(box);
        pane.setVgap(12);
        box1.setSpacing(15);
        box2.setSpacing(15);
        box3.setSpacing(15);
        box.setSpacing(15);
        pane.setVgap(12);
        pane.setHgap(12);
        pane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void processButton(ActionEvent event) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(1);
        boolean invalid = false;
        double ch = Double.parseDouble(hours.getText().toString());
        totalCreditHours += ch;
        String letterIn = letter.getText().toString();

        switch (letterIn.toUpperCase()) {
            case "A+":
                gpa = 4.3;
                break;
            case "A":
                gpa = 4.0;
                break;
            case "A-":
                gpa = 3.7;
                break;
            case "B+":
                gpa = 3.3;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "B-":
                gpa = 2.7;
                break;
            case "C+":
                gpa = 2.3;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "D":
                gpa = 1.0;
                break;
            case "F":
                gpa = 0.0;
                break;
            case "WF":
                gpa = 0.0;
                break;
            default:
                greetings.setText("invalid grade - GPA not changed");
                invalid = true;
        }

        points = gpa * ch;
        totalPoints += points;

        if (!invalid) {
            greetings.setText("Points for this course: " + formatter.format(points));
            text.setText("Cumulative GPA: " + formatter.format(totalPoints / totalCreditHours));
        }

    }

    public void processButton2(ActionEvent event) {
        letter.clear();
        hours.clear();
        totalCreditHours = 0;
        totalPoints = 0;
        greetings.setText("Total has been reset");
        text.setText("Enter your 1st grade & credit hrs.");
    }

}