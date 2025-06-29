package com.marcod.hotelbookingsystem.frontendjavafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FrontendJavafxApplication extends Application {


	private ConfigurableApplicationContext applicationContext;


	@Override
	public void init () {
		// Initialisiere den Spring Application Context hier
		// Dies verbindet die JavaFX-Anwendung mit Spring Boot
		applicationContext = new SpringApplicationBuilder(FrontendJavafxApplication.class)
						.run(getParameters()
						.getRaw()
						.toArray(new String[0]));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Hier beginnt die JavaFX-Anwendung.
		// primaryStage ist das Hauptfenster der Anwendung
		primaryStage.setTitle("Hotel Booking System");
		primaryStage.show(); // Zeigt das leere Fenster an, um zu prüfen ob es funktioniert
	}

	@Override
	public void stop () {
		// Beendet den Spring Application Context, wenn die JavaFX-Anwendung geschlossen wird
		applicationContext.close();
		Platform.exit(); // Beendet die JavaFX-Plattform
	}

	public static void main(String[] args) {
		// Starte die JavaFX-Anwendung (die dann Spring Boot initialisiert)
		launch(args);
	}
}
