package cr.ac.ucenfotec.EjemploVeterinaria.bl.entidades;

import java.util.Objects;

public class DatosMascota {

    private Mascota mascota;
    private Persona personas;


    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    public DatosMascota() {
    }

    public DatosMascota(Mascota mascota, Persona personas) {
        this.mascota = mascota;
        this.personas = personas;
    }

    @Override
    public boolean equals(Object o) {
        DatosMascota objeto = (DatosMascota) o;
        boolean igual= false;
        if (mascota.equals(objeto.mascota) ||  personas.equals(objeto.personas)){
            igual = true;
        }
        return igual;
    }

    @Override
    public int hashCode(){
        return Objects.hash(mascota, personas);
    }

    @Override
    public String toString() {
        return "Datos de la Mascota: "
                + mascota +
                ", Dueño=" + personas;
    }
}

