/*
 * La clase contacto almacenará información de una persona: nombre y teléfono
 * Pondremos final a los atributos, para una vez que estén creados no se modifiquen 
 *  los datos.
 */
package AgendaContactos;

import java.util.Objects;

/**
 *
 * @author Luis
 */
public class Contacto implements Comparable<Contacto> {
        
     private final String nombre; 
     private final String telefono; 


    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String fomartoFichero(){
        return (nombre + " - " +telefono);  
    }


    @Override
    public boolean equals(Object otro) {
        Contacto otroContacto = (Contacto) otro;
        return this.nombre.equals(otroContacto.nombre) || this.nombre.startsWith(otroContacto.nombre);
    }
    
    @Override
    public String toString(){
        String cad;
        cad = "Nombre: "+ nombre + "\tTeléfono: "+ telefono;
        return cad;
    }
    
    @Override
    public int compareTo(Contacto otro){
        return this.nombre.compareTo(otro.nombre);
    }
    
}
