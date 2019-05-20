/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaContactos;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Scanner T = new Scanner(System.in);
        Scanner S = new Scanner(System.in);
        
        
        int tamAgenda = (int) (Math.random() * 15) +1;
        
        Agenda agenda;
        int opcion = 0;
        String nombre, telefono;
        
        agenda = new Agenda(tamAgenda);
        
        agenda.desdeFichero();
        
        do{
            
            System.out.println("AGENDA TELEFONICA");
            System.out.println("================");
            System.out.println("1. Nuevo Contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Salir");
            opcion = S.nextInt();
            
            
            switch(opcion){
                
                case 1:
                    
                    if(agenda.agendaLlena() == true){
                        System.out.println("La agenda está llena");
                    } else {
                        System.out.println("Nombre: ");
                        nombre = T.nextLine();
                        System.out.println("Teléfono: ");
                        telefono = T.nextLine();
                        agenda.nuevoContacto(nombre, telefono);
                    }
                    
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Buscar: ");
                    nombre = S.nextLine();
                    agenda.buscaNombre(nombre);
                    
                    
                    break;
                    
                    
                case 3:
                    
                    agenda.mostrarContactos();
                    
                    
                    break;
                
            }
            
        } while(opcion != 4);
            
        agenda.volcarFichero();
    }
    
}
