package aula19;

import java.util.ArrayList;
import model.Circulo;
import model.Forma;
import model.Quadrado;
import model.Retangulo;

public class Aula19 {

    public static void main(String[] args) {
        ArrayList<Forma> listaDeFormas = new ArrayList<>();

        Forma circulo = new Circulo();
        listaDeFormas.add(circulo);
        Forma retangulo = new Retangulo();
        listaDeFormas.add(retangulo);
        Forma quadrado = new Quadrado();
        listaDeFormas.add(quadrado);

        for (Forma forma : listaDeFormas) {
           forma.desenhar(); 
           forma.informacoes();
           
        }
    }
}
