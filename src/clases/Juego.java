/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author feder
 */
public class Juego {
    List<Jugador> jugadores;
    List<Transferencia> transferencias;
    Pozo pozo;
    
    public Juego(Integer nroJugadores) {
        jugadores = new ArrayList<>();
        transferencias = new ArrayList<>();
        
        for (int i=0; i<nroJugadores; i++) {
            jugadores.add(new Jugador(i+1));
        }
        
        pozo = new Pozo();
    }
    
    
}
