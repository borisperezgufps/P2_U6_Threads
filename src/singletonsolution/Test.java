/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonsolution;

/**
 *   
 * @author borisperezg
 */
public class Test {
    
    public static void main(String[] args) {
        ClienteThread cli1 = new ClienteThread();
        ClienteThread cli2 = new ClienteThread();
        ClienteThread cli3 = new ClienteThread();
        ClienteThread cli4 = new ClienteThread();
        ClienteThread cli5 = new ClienteThread();
        cli1.start();
        cli2.start();
        cli3.start();
        cli4.start();
        cli5.start();
    }
    
}
