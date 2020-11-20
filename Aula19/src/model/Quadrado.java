
package model;

public class Quadrado extends Forma{

    @Override
    public void desenhar() {
        System.out.println("quadrado");
    }

    @Override
    public void informacoes() {
        System.out.println("base x altura");
    }
    
}
