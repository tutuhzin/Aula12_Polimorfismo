public class Main {
    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro C = new Cachorro();
        Cobra K = new Cobra();
        GoldFish g = new GoldFish();
        Tartaruga t = new Tartaruga();
        Arara A = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        c.locomover(); // canguru
        C.emitirSom(); // Cachorro
        K.locomover(); // cobra



    }
}