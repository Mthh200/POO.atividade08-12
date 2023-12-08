package modelo;

public class Cachorro extends Animal{
    
    @Override
    public void fazerZuada(){
        System.out.println("Auau");
    }
    @Override
    public void deslocar(){
        System.out.println("Correr woof woof");
    }
    
    
}
