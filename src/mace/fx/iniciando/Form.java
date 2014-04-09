package mace.fx.iniciando;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Form extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		
		stage.setTitle("Formulario JavaFX");
		stage.show();
		
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(25, 25, 25, 25));
		
		Text titulo = new Text("Bem vindo");
		titulo.setId("titulo");
		//titulo.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		gridPane.add(titulo, 0, 0, 2, 1);
		
		Label labelUsuario = new Label("Nome Usuario:");
		gridPane.add(labelUsuario, 0, 1);
		
		TextField textFieldUsuario = new TextField();
		gridPane.add(textFieldUsuario, 1, 1);
		
		Label labelSenha = new Label("Senha:");
		gridPane.add(labelSenha, 0, 2);
		
		PasswordField passwordFieldSenha = new PasswordField();
		gridPane.add(passwordFieldSenha, 1, 2);
		
		Button Button = new Button("Log in");
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.BOTTOM_RIGHT);
		hBox.getChildren().add(Button);
		gridPane.add(hBox, 1, 4);
		
		final Text mensagem = new Text();
		mensagem.setId("mensagem");
		//mensagem.setFill(Color.FIREBRICK);
		gridPane.add(mensagem, 1, 6);
		
		Button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
		    public void handle(ActionEvent e) {
				mensagem.setFill(Color.FIREBRICK);
				mensagem.setText("Botao de log in pressionado!");
		    }
		});
		
		Scene scene = new Scene(gridPane, 400, 400);
		scene.getStylesheets().add(Form.class.getResource("form.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
}