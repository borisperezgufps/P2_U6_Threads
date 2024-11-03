/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author borisperezg
 */
public class SingletonProblem {
    
    private static SingletonProblem instance;
    
    private SingletonProblem(){
        
    }
    
    public static SingletonProblem getInstance(){
        if(instance==null){
            instance = new SingletonProblem();
            System.out.println("Crea instancia");
        }
        return instance;
    }
    
}
