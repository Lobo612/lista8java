package Principal;

import Animais.*;

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal preguica = new Preguiça();

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
        preguica.emitirSom();
    }
}