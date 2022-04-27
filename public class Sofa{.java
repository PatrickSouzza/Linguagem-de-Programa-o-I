public class Sofa{

    private String cor;
    private String marca;
    private int acentos;

    public Sofa(String cor, String marca, int acentos){
        this.cor = cor;
        this.marca = marca;
        this.acentos = acentos;
    }
    public String getCor() {
        return cor;
    }
    public String setCor(String cor) {
        return this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public String setMarca(String Marca) {
        return this.marca = marca;
    }
    public int getAcentos() {
        return acentos;
    }
    public int setAcentos(int Acentos) {
        return this.acentos = acentos;
	}
	
	public void list (Sofa s) {
		System.out.println("\nCor:"+ cor +"\nMarca:"+marca+"\nAcentos:"+ acentos);	
}
	public static void main(String[] args) {
		
		
		 Sofa s1 = new Sofa ("Roxo", "Ortobom", 3);
		 
		 