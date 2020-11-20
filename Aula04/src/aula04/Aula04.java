package aula04;

import java.util.ArrayList;
import model.Animal;
import model.Cachorro;
import model.Cavalo;
import model.Preguica;

public class Aula04 {

    public static void main(String[] args) {

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();

        Animal cachorro = new Cachorro();
        listaDeAnimais.add(cachorro);
        Animal cavalo = new Cavalo();
        listaDeAnimais.add(cavalo);
        Animal preguica = new Preguica();
        listaDeAnimais.add(preguica);

        for (Animal animal : listaDeAnimais) {
            System.out.println(animal.emitirSom());
        }
    }

}
