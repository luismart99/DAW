package AgendaContactos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 *
 * @author Luis
 */
public class Agenda {
    
    
    private Contacto agenda[];
    private int numContactos;

    public Agenda(int tamanio) {
        agenda = new Contacto[tamanio];
        numContactos = 0;
    }
    
    
    public void nuevoContacto(String nombre, String telefono){
        
        if(numContactos < agenda.length){
            agenda[numContactos] = new Contacto(nombre, telefono);
            numContactos++;
        }
    }
    
    public boolean agendaLlena(){
        return (numContactos == agenda.length);
    }
    
    public void buscaNombre(String nombre){
       Contacto nBuscar = new Contacto(nombre, "");
        for (int i = 0; i < numContactos; i++) {
           if(agenda[i].equals(nBuscar)){  
               System.out.println(agenda[i]);
           }
            
        }
    }
    
    public void mostrarContactos(){
        Arrays.sort(agenda, 0, numContactos);
        
        for (int i = 0; i < numContactos; i++) {
            System.out.println(agenda[i]);
            
        }
    }
    
    public void eliminarContacto(String nombre) {
 
        boolean encontrado = false;
        for (int i = 0; i < agenda.length && !encontrado; i++) {
            if (agenda[i] != null && agenda[i].equals(nombre)) {
                agenda[i] = null; 
                encontrado = true; 
            }
        }
 
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");
 
        }
 
    }
    
    
    public void desdeFichero() throws Exception{
        
        try{
            
            BufferedReader fr = new BufferedReader(new FileReader("agenda.txt"));
            
            String linea = fr.readLine();
            
            while(linea != null && !agendaLlena()){
                nuevoContacto(linea.split(" - ") [0], linea.split(" - ")[1]);
                linea = fr.readLine();
                
            }
            
            if(agendaLlena() && linea != null){
                System.out.println("Se ignoran algunos contactos del fichero");
                System.out.println("agenda.txt es demasidado grande");
            }
            
            fr.close();
        } catch (EOFException ex) {
            System.out.println(ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void volcarFichero() throws Exception{
        
        try{
            
            BufferedWriter fw = new BufferedWriter(new FileWriter ("agenda.txt"));
            
            for (int i = 0; i < numContactos; i++) {
                fw.write(agenda[i].fomartoFichero());
                fw.newLine();
                
            }
            
            fw.close();
            
        } catch (EOFException ex) {
            System.out.println(ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
