/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasyfootballsetup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author achap
 */
public class FantasyFootballSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            int optionNum = intro();
                if(optionNum == 1){
                    
                } else if(optionNum == 2){
                    
                } else {
                    
                }
            //choice();
            intro();
            input();
            
        } catch (Exception e){
            System.out.println("That was not a number!");
        }
        
    }
    
    public static int intro(){
        System.out.println("Welcome to Fantasy Football Program! What would you like to do?");
        System.out.println("1. Initialise the Program with Data");
        System.out.println("2. Enter in a Team");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        //int optionNum = Integer.parseInt(option);
        return Integer.parseInt(option);
    }
    
    /*public static void choice(){
        
        switch (option) {
                case 1:
                    System.out.println("You Initialized the Program!");
                    break;
                case 2:
                    System.out.println("You entered a Team!");
                    break;
                default:
                    System.out.println("Error, input entered is not an available option!");
                    break;
        }
    }*/
    
    public static void input() throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData2.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] playerData = line.split(",");
            System.out.println(playerData[0]);
            if (playerData[4].equals("Forward")) {
                Forward player = new Forward(0, playerData[0], playerData[1], playerData[2], Integer.parseInt(playerData[3]), playerData[4]);
                player.
            }
        }
        
        
        //System.out.println("The first line is: " + line);
        
    }
    
}
