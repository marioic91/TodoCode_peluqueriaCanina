package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraP;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraL {
    ControladoraP controladoraP = new ControladoraP();

    public void guardar(String nombreM, String color, String raza, String observaciones, boolean alergico, boolean atencionEsp, String nombreD, String celular) {
        Dueno dueno = new Dueno(nombreD, celular);
        Mascota mascota = new Mascota(nombreM, raza, color, alergico, atencionEsp, observaciones, dueno);
        
        controladoraP.guardar(dueno,mascota);
    }

    public List<Mascota> consultar() {
        return controladoraP.consultar();
    }

    public void eliminar(int id) throws NonexistentEntityException {
        controladoraP.eliminar(id);
    }

    public Mascota consultaM(int id) {
        return controladoraP.consultaM(id);
    }
    
    public Dueno consultaD(int id) {
        return controladoraP.consultaD(id);
    }
    
    public void editarD(Dueno dueno, String nombreD, String celular) throws Exception {
        dueno.setNombre(nombreD);
        dueno.setCelular(celular);
        
        controladoraP.modificarD(dueno);
    }

    public void editarM(Mascota mascota, String nombreM, String color, String raza, String observaciones, boolean alergico, boolean atencionEsp) throws Exception {
        mascota.setNombre(nombreM);
        mascota.setColor(color);
        mascota.setRaza(raza);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEsp(atencionEsp);
        
        controladoraP.modificarM(mascota);
    }

}