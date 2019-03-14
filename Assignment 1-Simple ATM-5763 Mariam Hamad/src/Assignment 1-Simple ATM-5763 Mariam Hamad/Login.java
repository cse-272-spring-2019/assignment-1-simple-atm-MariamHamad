/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Mariuma
 */
public class Login {
    
    Stage stage;
    Scene scene;
    CardNumberVerification v;
    MainMenu mainMenu;

    public Login(Stage stage) {
        this.stage = stage;
    }
    

    public void formatScene() {
     
        v=new CardNumberVerification(); 
        Label cardNumberLabel= new Label("Card Number: ");
        Label cardLabel=new Label();
        Label validationLabel= new Label();
        
        cardNumberLabel.setFont(new Font("Arial", 40));
        cardLabel.setFont(new Font("Arial", 20));
        validationLabel.setFont(new Font("Arial", 13));
        cardNumberLabel.setTextFill(Color.web("#7B1FA2"));
        
        GridPane grid= new GridPane();
        grid.setAlignment(Pos.CENTER); 
        grid.add(cardNumberLabel,0,0);
        grid.add(cardLabel,1,0);
        grid.add(validationLabel,0,1);
        
        validationLabel.setTextFill(Color.web("#F44336"));
        validationLabel.setPrefWidth(250);
        validationLabel.setPrefHeight(30);  
         
        grid.setAlignment(Pos.CENTER); 
        scene= new Scene(grid,600,450);
        
        /****************************************Number Pad***********************************************/
     
     Button zero=new Button("0");
     Button one=new Button("1");
     Button two=new Button("2");
     Button three=new Button("3");
     Button four=new Button("4");
     Button five=new Button("5");
     Button six=new Button("6");
     Button seven=new Button("7");
     Button eight=new Button("8");
     Button nine=new Button("9");
     Button enter= new Button("Enter ");
     Button clear= new Button("Clear");
     
     zero.setPrefSize(50,50);
     one.setPrefSize(50,50);
     two.setPrefSize(50,50);
     three.setPrefSize(50,50);
     four.setPrefSize(50,50);
     five.setPrefSize(50,50);
     six.setPrefSize(50,50);
     seven.setPrefSize(50,50);
     eight.setPrefSize(50,50);
     nine.setPrefSize(50,50);
     clear.setPrefSize(50,50);
     enter.setPrefSize(50,50);
                       
     grid.add(zero,1,5);
     grid.add(one,2,5);
     grid.add(two,3,5);
     grid.add(three,1,6);
     grid.add(four,2,6);
     grid.add(five,3,6);
     grid.add(six,1,7);
     grid.add(seven,2,7);
     grid.add(eight,3,7);
     grid.add(nine,2,8);
     grid.add(clear,1,8);
     grid.add(enter,3,8);
     
     
       zero.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"0");
            }                
        });
       
       one.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"1"); 
            }                
        });
       
        two.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"2"); 
            }                
        });
        
         three.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
              cardLabel.setText(cardLabel.getText()+"3"); 
            }                
        });
         
          four.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"4"); 
            }                
        });
          
           five.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"5"); 
            }                
        });
           
            six.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"6"); 
            }                
        });
            
             seven.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"7"); 
            }                
        });
             
              eight.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"8"); 
            }                
        });
              
               nine.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               cardLabel.setText(cardLabel.getText()+"9"); 
            }                
        });
     /************************************End of Number Pad*******************************************/
        
                clear.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                  cardLabel.setText("");   
                  validationLabel.setText("");
            }                
        });
                
        enter.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String cardNumber = cardLabel.getText();
               boolean valid= v.verifyCardNumber(cardNumber);
               if(valid){
                    stage.setScene(mainMenu.getScene());
               }
               else
                    validationLabel.setText("Card Number is incorrect. Please try again.");
            }                
        });
            
    }
   
    public Scene getScene() {
        return this.scene;
    }
     
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
    
    
  
   
         
}


