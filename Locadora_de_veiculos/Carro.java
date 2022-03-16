public class Carro {



    String placa;
    float potencia;
    String modelo;
    String cor;
    String marca;
    boolean cambio_automatico;
    int ano;
    double preco;


    //métodos -> ações

    public void andar() {
        System.out.println("andando...");
    }

    public boolean frear() {
        System.out.println("freando...");
        return true;
    }

    public void correr(int velocidade) {
        System.out.println("Estou correndo " + velocidade +" KM/h");
    }
     
    public static void main (String[] args) {

        //instânciando objetos da classe

        Carro C1 = new Carro();
        
        //declarei e depois instânciei o objeto
        
        Carro C2;
        C2 = new Carro();

        C1.modelo = "Parati";
        C1.marca = "Volkswagen";
        C1.ano = 1997;
        C1.cor = "Preto";
        C1.cambio_automatico = false;
        C1.preco = 23000.00;

        C2.modelo = "Fiesta";
        C2.marca = "Ford";
        C2.ano = 2015;
        C2.cor = "Azul";
        C2.placa = "ECB-4385";
        C2.potencia = 32000;    
   
        System.out.println("Modelo: " + (C1.modelo) + "\nMarca: " 
                + (C1.marca) +"\nAno: " + (C1.ano) + "\nCor: " + (C1.cor) + "\nCâmbio Automatico: "
                + (C1.cambio_automatico) +  "\nPreço: " + (C1.preco) + "\n" );
        System.out.println("Modelo: " + (C2.modelo) + "\nMarca: " + (C2.marca) 
                +"\nAno: " + (C2.ano) + "\nCor: " + (C2.cor) + "\nPlaca: " 
                + (C2.placa) +  "\nPotência: " + (C2.potencia) + "\n" );

    }

}
