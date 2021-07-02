/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author feder
 */
public class Jugador {
    String nombre;
    Integer numero;
    
    public Jugador(Integer nroJugador) {
        numero = nroJugador;
        nombre = "Jugador " + nroJugador;
    }
}
