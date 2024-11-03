/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonsolution;

/**
 *
 * @author borisperezg
 */
public class SingletonSolution {

    private static SingletonSolution instance;

    private SingletonSolution() {

    }

    public static synchronized SingletonSolution getInstance() {

        if (instance == null) {
            instance = new SingletonSolution();
            System.out.println("Crea instancia");
        }

        return instance;
    }

}



