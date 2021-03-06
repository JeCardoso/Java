package br.com.softblue.bluekeeper.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Application class, a classe onde tudo come�a no JavaFX
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Carrega o layout FXML
		Pane root = FXMLLoader.load(getClass().getResource("Layout.fxml"));
		
		// Cria a cena
		Scene scene = new Scene(root, 850, 400);
		
		// Define par�metros para a janela
		primaryStage.setMinWidth(850);
		primaryStage.setMinHeight(400);
		primaryStage.setMaxHeight(800);
		primaryStage.setTitle("BlueKeeper");
		
		// Atrela a cena � janela
		primaryStage.setScene(scene);
		
		// Exibe a janela
		primaryStage.show();
	}

	public static void main(String[] args) throws Exception {
		// Inicializa o JavaFX
		launch(args);
	}
}
