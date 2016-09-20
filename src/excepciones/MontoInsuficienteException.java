/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author rmorales1
 */
public class MontoInsuficienteException extends Exception{
    public MontoInsuficienteException(){
        super("Fondos insuficientes para retirar");
    }
}
