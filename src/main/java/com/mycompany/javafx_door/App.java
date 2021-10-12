package com.mycompany.javafx_door;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Polygon;

/**
 * JavaFX App
 */
public class App extends Application {
    /*
    *initializing all the different shapes.
    */
    Polygon tangle;
    Circle circ;
    Rectangle beam;
    Rectangle columns;
    Rectangle stairs;
    Rectangle house;
    Canvas bg1, bg2;
    Group gp = new Group();
    
    
    
    @Override
    public void start(Stage stage) {
        
        
        draw();
        
        
        
        var scene = new Scene(gp, 800, 800);
        stage.setScene(scene);
        stage.setTitle("GUI Door");
        stage.show();
    }
    
    public void draw(){ //method that draws the main house
            //set background rectangles
        
            Canvas canvas = new Canvas(800, 450);
            Group Gc = new Group(canvas);
            canvas.setStyle("-fx-background-color: sky blue");
        
      
        //set triangle and color
        tangle = new Polygon();
        tangle.getPoints().addAll(new Double[]{
           400.0, 50.0,
           100.0, 150.0,
           700.0, 150.0
        });
        tangle.setStroke(Color.BLACK);
        tangle.setFill(Color.WHITE);
        gp.getChildren().add(tangle);
        
        house = new Rectangle(200, 150, 400, 400);
        house.setFill(Color.BROWN);
        house.setStroke(Color.BLACK);
        gp.getChildren().add(house);
        
        for(int i = 0; i < 10; i++){
            int x = 200 - (i * 10);
            int y = 550 + (i * 10);
            int w = 400 + (i * 20);
            int l = 50;
            stairs = new Rectangle(x, y, w , l);
            stairs.setStroke(Color.BLACK);
            gp.getChildren().add(stairs);
            
            
        }       
        
    }
    
    public void doorGlass(int x, int y){
        int b = 0;
        for(int i = 0; i < 1; i++){
            Rectangle window = new Rectangle(x, y, 10, 20);
            gp.getChildren().add(window);
            
            b+= 30;
        }
    }
    
    
    

    public static void main(String[] args) {
        launch();
    }
    
    
    

}