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
public class MainMenu {
    
    ATM obj = new ATM();
    Stage stage;
    Scene scene;
    Login login;
    Withdraw withdraw1;
    Deposit deposit1;
    Label label=new Label(); //in order to set it to nothing again when i press back in withdraw scene
    

    public MainMenu(Stage stage) {
        this.stage = stage;
    }
    
     public void formatScene() {
         
    Button deposit= new Button("Deposit");
    Button withdraw= new Button("Withdraw");
    Button balanceInquiry= new Button("Balance Inquiry");
    Button previous= new Button("Previous");
    Button next=new Button("Next");
    
    deposit.setFont(new Font("Arial", 14));
    withdraw.setFont(new Font("Arial", 14));
    balanceInquiry.setFont(new Font("Arial", 14));
    previous.setFont(new Font("Arial", 14));
    next.setFont(new Font("Arial", 14));
    label.setFont(new Font("Arial", 17));
    
     deposit.setTextFill(Color.web("#7B1FA2"));
     withdraw.setTextFill(Color.web("#7B1FA2"));
     balanceInquiry.setTextFill(Color.web("#7B1FA2"));
     previous.setTextFill(Color.web("#7B1FA2"));
     next.setTextFill(Color.web("#7B1FA2"));
         
     
    deposit.setPrefSize(120,120);
    withdraw.setPrefSize(120,120);
    balanceInquiry.setPrefSize(120,120);
    previous.setPrefSize(120,120);
    next.setPrefSize(120,120);
    
    label.setPrefWidth(230);
    label.setPrefHeight(20);
 
     
    GridPane grid= new GridPane();
        grid.setVgap(20); 
        grid.setHgap(35);
        grid.setAlignment(Pos.CENTER); 
        grid.add(deposit,1,0);
        grid.add(withdraw,2,0);
        grid.add(balanceInquiry,1,2);
        grid.add(previous,1,3);
        grid.add(next,2,3);
        grid.add(label,1,4);
        
    scene= new Scene(grid,600,450);  
        
           withdraw.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                withdraw1.setObj(obj);
                stage.setScene(withdraw1.getScene());
                
            }                
        });
           
             deposit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                deposit1.setObj(obj);
                stage.setScene(deposit1.getScene());
                
            }                
        });
           
             balanceInquiry.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
          
             String balance=obj.getCurrentBalance();
               label.setText("Current balance is "+balance);
            }                
        });
    
             previous.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
          
                String prev=obj.previous();
              if(!("null").equals(prev))
              {  
                  label.setText(""+prev);
              }
              else if(prev.equals("null"))
                  label.setText("No more history!");
            }                
        });
             
             
             next.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
          
                String n=obj.next();
              if(!("null").equals(n))
              {  
                  label.setText(""+n);
              }
              else if(n.equals("null"))
                  label.setText("No more history!");
              
            }                
        });
    }

    public Scene getScene() {
        return scene;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setWithdraw(Withdraw withdraw) {
        this.withdraw1 = withdraw;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit1 = deposit;
    }

    
    
    
    
}
