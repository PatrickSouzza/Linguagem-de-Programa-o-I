public class Moto{
    
    String modelo;
    String fabricante;
    String placa;
    short cc;
    String cor;
    short ano;
    double preco;
    
    
    public Moto(String modelo, String fabricante, String placa, int cc, String cor, int ano, int preco){
        
        this.modelo= modelo;
        this.fabricante = fabricante;
        this.placa = placa;
        this.cc = (short) cc;
        this.cor = cor;
        this.ano = (short) ano;
        this.preco = preco;
    }
    public void InfoMoto(){
        
        System.out.println("\nModelo: " + modelo + "\nFabricante: " + fabricante
        + "\nPlaca: " + placa + "\nCilindrada: " + cc + "\nCor: " + cor
        + "\nAno: " + ano + "\nPreço: " + preco +"\n");
    }
    public static void main(String[] args) {
    Moto M1 = new Moto("Fazer","Yamaha","ECB-4363",250,"Preta",2012,8000);
    Moto M2 = new Moto("Ninja","Kawazaki","EDP-1546",300,"Verde",2008,10000);

    M1.InfoMoto();
    M2.InfoMoto();
}
}

