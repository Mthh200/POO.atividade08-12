package br.edu.principal;
import modelo.*;

public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();
        Veterinaria veterinaria = new Veterinaria();
        
        veterinaria.examinar(cachorro);
        veterinaria.examinar(cavalo);
        veterinaria.examinar(preguica);
        
        
    }
    
}
