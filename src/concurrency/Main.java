/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author borisperezg
 */
public class Main extends Thread {

    public static int amount = 100;

    public static void main(String[] args) {
        Main thread1 = new Main();
        Main thread2 = new Main();
        Main thread3 = new Main();
        Main thread4 = new Main();
        System.out.println("Saldo actual = " + amount);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
    }

    public void run() {
        if(65<amount){
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            amount -= 65;
            System.out.println("Saldo actual = " + amount);
        }else
            System.err.println("No puede retirar");
    }
    
}
