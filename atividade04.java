
class Cachorro extends Animal {

    void latir (){
        System.out.println("latir");
    }
}

class Passaro extends Animal {

    void voar (){
        System.out.println("voar");
    }
}

class Animal {

    String cor;
    int tamanho;
    double peso;

    void correr(){
        System.out.println("Correr");
    }

    void dormir(){
        System.out.println("Dormir");
    }
}

class Scratch {
    public static void main(String[] args) {

      Cachorro cachorro = new Cachorro();
      cachorro.cor = "Marrom";
      cachorro.correr();
      cachorro.latir();

      Passaro passaro = new Passaro();
      passaro.cor = "branco";
      passaro.dormir();
      passaro.voar();
        
    }
}
