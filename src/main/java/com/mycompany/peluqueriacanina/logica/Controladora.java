
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasota, String raza, String color, String observaciones, 
            String alergico, String atEspecial, String nombreDuenio, String celDuenio) {
        
        //CREAMOS EL DUEÑO Y ASIGNAMOS VALORES
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCel_duenio(celDuenio);
        
        //CREAMOS LA MASCOTA Y ASIGNAMOS VALORES
        Mascota mascota = new Mascota();
        mascota.setNombreMascota(nombreMasota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atEspecial);
        mascota.setObservaciones(observaciones);
        
        mascota.setDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
        
        
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascotas(num_cliente);
    }

    public void modificarMascota(Mascota mascota, String nombreMasota, String raza, String color, 
            String observaciones, String alergico, String atEspecial, String nombreDuenio, 
            String celDuenio) {
        
        mascota.setNombreMascota(nombreMasota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atEspecial);
        
        //MODIFICO LA MASCOTA
        controlPersis.modificarMascota(mascota);
        
        //SETEO LOS NUEVOS VALORES
        Duenio duenio = this.buscarDuenio(mascota.getDuenio().getId_duenio());
        duenio.setNombre(nombreDuenio);
        duenio.setCel_duenio(celDuenio);
        
        //llamar al modificar dueño
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
       controlPersis.modificarDuenio(duenio);
    }

   
    
    
}
