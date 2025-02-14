package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Dueno;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraP {
    MascotaJpaController mascotaJpaController = new MascotaJpaController();
    
    DuenoJpaController duenoJpaController = new DuenoJpaController();

    public void guardar(Dueno dueno, Mascota mascota) {
        duenoJpaController.create(dueno);
        mascotaJpaController.create(mascota);
    }

    public List<Mascota> consultar() {
        return mascotaJpaController.findMascotaEntities();
    }

    public void eliminar(int id) throws NonexistentEntityException {
        mascotaJpaController.destroy(id);
    }

    public Mascota consultaM(int id) {
        return mascotaJpaController.findMascota(id);
    }
    
    public Dueno consultaD(int id) {
        return duenoJpaController.findDueno(id);
    }

    public void modificarD(Dueno dueno) throws Exception {
        duenoJpaController.edit(dueno);
    }

    public void modificarM(Mascota mascota) throws Exception {
        mascotaJpaController.edit(mascota);
    }

}