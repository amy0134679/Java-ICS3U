import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.effect.*;
import java.lang.Math;

public class GradeTool extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage) {              
		GridPane mainPane = new GridPane();
		int output = 0;
		Scene scene = new Scene(mainPane);
		primaryStage.show();
		
		Label grade1 = new Label("Enter your first Grade: "); 
		GridPane.setRowIndex(grade1, 0); 
		GridPane.setColumnIndex(grade1, 4); 
		Label grade2 = new Label("Enter your second Grade: "); 
		GridPane.setRowIndex(grade2, 1); 
		GridPane.setColumnIndex(grade2, 4);
		Label grade3 = new Label("Enter your third Grade: "); 
		GridPane.setRowIndex(grade3, 2); 
		GridPane.setColumnIndex(grade3, 4);
		Label answer = new Label(String.valueOf(output));
		GridPane.setRowIndex(answer, 4); 
		GridPane.setColumnIndex(answer, 2);
		
		TextField first = new TextField(); 
		GridPane.setRowIndex(first, 0); 
		GridPane.setColumnIndex(first, 3); 
		TextField second = new TextField(); 
		GridPane.setRowIndex(second, 1); 
		GridPane.setColumnIndex(second, 3);
		TextField third = new TextField(); 
		GridPane.setRowIndex(third, 2); 
		GridPane.setColumnIndex(third, 3);
		
		String num1 = first.getText();
		String num2 = second.getText();
		String num3 = third.getText();
	
		Button max = new Button("Maxiumum");
		GridPane.setRowIndex(max, 4); 
		GridPane.setColumnIndex(max, 3);
		max.setOnAction((ActionEvent e)-> { 
			 output = (Math.max(Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3))); 
				 answer.setText(String.valueOf(output));
		});
		
		Button min = new Button("Minimum");
		GridPane.setRowIndex(min, 5); 
		GridPane.setColumnIndex(min, 3);
		min.setOnAction((ActionEvent e)-> {
			output = (Math.min(Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3))); 
				answer.setText(Integer.toString(output));
		});
		Button av = new Button("Average");
		GridPane.setRowIndex(av, 5); 
		GridPane.setColumnIndex(av, 2);
			av.setOnAction((ActionEvent e)-> {
			output = ((Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3)) / 3); 
				answer.setText(Integer.toString(output));
		});
		
		mainPane.getChildren().add(first);
		mainPane.getChildren().add(second);
		mainPane.getChildren().add(third);
		mainPane.getChildren().add(answer);
    
 		}
	}






