/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author borisperezg
 */
public class ClienteThread extends Thread{
    
    @Override
    public void run() {
        SingletonProblem prob = SingletonProblem.getInstance();
    }
    
}
