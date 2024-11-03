/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonsolution;

/**
 *
 * @author borisperezg
 */
public class ClienteThread extends Thread{
    
    @Override
    public void run() {
        SingletonSolution prob = SingletonSolution.getInstance();
    }
    
}
