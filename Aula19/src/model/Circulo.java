package model;

public class Circulo extends Forma {

    @Override
    public void desenhar() {
        System.out.println("Circulo");    
    }

    @Override
    public void informacoes() {
        System.out.println("diametro");
    }

}
