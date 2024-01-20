

package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.interfazgrafica.Principal;


public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        Principal principal = new Principal();         // Instancio la clase Principal
        principal.setVisible(true);                 //Le doy visibilidad
        principal.setLocationRelativeTo(null);      //Con esto hago que se abra la ventana en el medio
         
    }
}
