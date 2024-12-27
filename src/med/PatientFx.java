package med;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class PatientFx extends Application{
	
	Font titleFont = new Font("Stencil",25);
	Font btnFont = new Font("Elephant",18);

	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		/*
		Parent root = FXMLLoader.load(getClass().getResource("Frontend.fxml"));
		Scene t = new Scene(root,400,180);
		mainStage.setScene(t);
		mainStage.show();
		mainStage.setTitle("ATM");
		*/
		
		Pane p1 = new Pane();
		Scene t = new Scene(p1,500,300);
		t.setRoot(login(t));
		mainStage.setTitle("");
		Image icon = new Image("https://cdn-icons-png.flaticon.com/512/781/781831.png");
		mainStage.getIcons().add(icon);
		mainStage.setScene(t);
		mainStage.show();	
	}
	
	public Pane login(Scene t) {
		Label title = new Label("Patient Management System");
		title.setFont(titleFont);
		title.setTranslateX(55);
		
		Line line = new Line();
		line.setStartX(0); 
		line.setEndX(500); 
		line.setStartY(30);
		line.setEndY(30);
		line.setSmooth(true);
		line.setStroke(Color.RED);
		line.setStrokeWidth(5);
		
		Label loginLbl = new Label("Login");
		loginLbl.setTranslateY(40);
		loginLbl.setTranslateX(223);
		loginLbl.setFont(new Font("Elephant",20));
		
		Label emailLbl = new Label("Email:");
		emailLbl.setTranslateX(130);
		emailLbl.setTranslateY(70);
		emailLbl.setFont(new Font("Impact",30));
		
		TextField emailTxtF = new TextField();
		emailTxtF.setTranslateX(205);
		emailTxtF.setTranslateY(78);
		emailTxtF.setMinHeight(30);
		
		//Password field
		Label passLbl = new Label("Password:");
		passLbl.setTranslateX(105);
		passLbl.setTranslateY(110);
		passLbl.setFont(new Font("Impact",30));
		
		TextField passTxtF = new TextField();
		passTxtF.setTranslateX(235);
		passTxtF.setTranslateY(117);
		passTxtF.setMinHeight(30);
		
		ToggleGroup group = new ToggleGroup();

		RadioButton patientRBtn = new RadioButton("Patient");
		patientRBtn.setToggleGroup(group);
		patientRBtn.setTranslateX(180);
		patientRBtn.setTranslateY(170);
				
		RadioButton doctorRBtn = new RadioButton("Doctor");
		doctorRBtn.setToggleGroup(group);
		doctorRBtn.setTranslateX(270);
		doctorRBtn.setTranslateY(170);
		
		//Login button
		Button loginBtn = new Button("Login");
		loginBtn.setTranslateX(231);
		loginBtn.setTranslateY(200);
		
		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				
			}
		});
		
		
		Button newPatientBtn = new Button("New Patient");
		newPatientBtn.setTranslateX(160);
		newPatientBtn.setTranslateY(250);
				
		newPatientBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				
			}
		});
				
		
		Button newDoctorBtn = new Button("New Doctor");
		newDoctorBtn.setTranslateX(270);
		newDoctorBtn.setTranslateY(250);
				
		newDoctorBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				
			}
		});
		
		Pane loginPane = new Pane();
		
		BackgroundFill background_fill = new BackgroundFill(Color.LIGHTBLUE,CornerRadii.EMPTY, Insets.EMPTY); 
		Background background = new Background(background_fill);
		loginPane.setBackground(background);
		
		loginPane.getChildren().addAll(title,line,loginLbl,emailLbl,emailTxtF,passLbl,passTxtF,patientRBtn,doctorRBtn,loginBtn,newPatientBtn,newDoctorBtn);
		return loginPane;
	}
	
	
	
	

}
