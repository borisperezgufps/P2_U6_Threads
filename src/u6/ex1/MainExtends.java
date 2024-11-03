/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u6.ex1;

/**
 *
 * @author borisperezg
 */
public class MainExtends extends Thread {

    public static void main(String[] args) {
        MainExtends thread = new MainExtends();
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
