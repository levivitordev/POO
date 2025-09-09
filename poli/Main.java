package poli;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();

        interagirComAnimais(animais);
    }
    public static void interagirComAnimais(Animal[]animais){
        for(int i = 0 ; i < animais.length; i++){  
            animais[i].fazerSom();

            if (animais[i] instanceof Cachorro) {
                ((Cachorro) animais[i]).abanarRabo();
            } else if (animais[i] instanceof Gato) {
                ((Gato) animais[i]).arranharMoveis();
            }

            System.out.println("--------------------");
        }
    }
}
