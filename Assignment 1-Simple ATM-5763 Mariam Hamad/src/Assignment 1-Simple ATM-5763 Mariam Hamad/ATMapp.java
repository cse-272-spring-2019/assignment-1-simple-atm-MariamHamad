/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author Mariuma
 */
public class ATMapp extends Application {
   
     public static void main(String[] args) {
        launch(args);}
     
     @Override
    public void start(Stage primaryStage) {
     
        primaryStage.setTitle("Simple ATM");
        
        Login login= new Login(primaryStage);
        MainMenu mainMenu= new MainMenu(primaryStage);
        Withdraw withdraw= new Withdraw(primaryStage);
        Deposit deposit= new Deposit(primaryStage);
        
        login.formatScene();
        mainMenu.formatScene();
        withdraw.formatScene();
        deposit.formatScene();
        login.setMainMenu(mainMenu);
        
        mainMenu.setWithdraw(withdraw);
        withdraw.setMainMenu(mainMenu);
        mainMenu.setDeposit(deposit);
        deposit.setMainMenu(mainMenu);
 
        primaryStage.setScene(login.getScene());
        primaryStage.show();
}
}