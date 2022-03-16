public class Cliente {

    String nome;
    long cpf;
    String rg;
    short idade;


public Cliente(String nome, long cpf, String rg, int i){
    this.nome = nome;
    this.cpf = cpf;
    this.rg = rg;
    this.idade = (short) i;
}

public void InfoCliente(){
    System.out.println("\nNome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nIdade: " + idade);

}
public static void main(String[] args) {
    Cliente CL1 = new Cliente("Jordan Lima",445847,"507901159",27);
    Cliente CL2 = new Cliente("Felipe Sobral",23541,"367421698",25); 

    CL1.InfoCliente();
    CL2.InfoCliente();
}


    
}
