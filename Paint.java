import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Paint extends Application {

	@Override
    public void start(Stage stage) {

    	int size = 200;
		GridPane gp = new GridPane();
		Scene scene = new Scene(gp,size,size);
		
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++)
				gp.add(new Pix(), i, j);
		}

		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args){
		
		launch();
	}	
}

class Pix extends Rectangle {

	public Pix(){
		super(1, 1);

		setFill(Color.WHITE);

		setOnMouseEntered(event -> {

			//if(!event.isPrimaryButtonDown())
				//return;

			Pix pix = (Pix) event.getTarget();

			pix.setFill(Color.BLACK);

		});
	}

}