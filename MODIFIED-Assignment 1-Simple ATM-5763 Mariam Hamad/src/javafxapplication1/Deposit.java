/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;
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
import javafx.stage.Stage;
/**
 *
 * @author Mariuma
 */
public class Deposit {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariuma
 */
    
    Stage stage;
    Scene scene;
    MainMenu mainMenu;
    ATM obj= new ATM();
  
     public Deposit(Stage stage) {
        this.stage = stage;
    }
    
     public void formatScene(){
         

    Label label=new Label("Amount: ");
    Label labelSpace=new Label("");
    Label labelSpace2=new Label("");
    Label labelSpace3=new Label("");
    Label amountLabel= new Label("");
    Button back= new Button("Back to Main Menu");
   
    label.setFont(new javafx.scene.text.Font("Arial", 30));
    label.setTextFill(Color.web("#7B1FA2"));
    amountLabel.setFont(new javafx.scene.text.Font("Arial", 15));
   
    label.setPrefWidth(150);
    label.setPrefHeight(30);
    labelSpace3.setPrefWidth(120);
    labelSpace3.setPrefHeight(30);
    amountLabel.setPrefWidth(50);
    amountLabel.setPrefHeight(30);
    
    
   GridPane grid= new GridPane();
     grid.setAlignment(Pos.CENTER); 
     grid.add(label,0,0);
     grid.add(amountLabel,1,0);
     grid.add(back,4,9);
     grid.add(labelSpace,0,3);
     grid.add(labelSpace2,0,4);
     grid.add(labelSpace3,0,2);
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
               amountLabel.setText(amountLabel.getText()+"0");
            }                
        });
       
       one.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"1"); 
            }                
        });
       
        two.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"2"); 
            }                
        });
        
         three.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"3"); 
            }                
        });
         
          four.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"4"); 
            }                
        });
          
           five.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"5"); 
            }                
        });
           
            six.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"6"); 
            }                
        });
            
             seven.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"7"); 
            }                
        });
             
              eight.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"8"); 
            }                
        });
              
               nine.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
               amountLabel.setText(amountLabel.getText()+"9"); 
            }                
        });
     /************************************End of Number Pad*******************************************/
     
        clear.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                  amountLabel.setText("");   
            }                
        });
                 
        back.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                 amountLabel.setText("");
                 mainMenu.label.setText("");
                stage.setScene(mainMenu.getScene());
            }                
        });
        
        enter.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                String amount=amountLabel.getText();
                obj.deposit(amount);
            }                
        });
     
     }  
    
  
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
  
    public Scene getScene() {
        return scene;
    }

    public void setObj(ATM obj) {
        this.obj = obj;
    }
    
    
}
