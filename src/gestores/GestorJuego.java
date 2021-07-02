/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import clases.Juego;


/**
 *
 * @author feder
 */
public class GestorJuego {
    
    
    
    public Juego nuevoJuego(Integer numeroJugadores) {
        Juego juego = new Juego(numeroJugadores);
        
        return juego;
    }
}
