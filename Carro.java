public class Carro {
     // Atributos privados (Encapsulamento)
     private String marca;
     private String modelo;
     private int anoFabricacao;
     
     // Construtor para inicializar os atributos
     public Carro(String marca, String modelo, int anoFabricacao) {
         this.marca = marca;
         this.modelo = modelo;
         this.anoFabricacao = anoFabricacao;
     }
     
     // Métodos getters e setters
     public String getMarca() {
         return marca;
     }
 
     public void setMarca(String marca) {
         this.marca = marca;
     }
 
     public String getModelo() {
         return modelo;
     }
 
     public void setModelo(String modelo) {
         this.modelo = modelo;
     }
 
     public int getAnoFabricacao() {
         return anoFabricacao;
     }
 
     public void setAnoFabricacao(int anoFabricacao) {
         this.anoFabricacao = anoFabricacao;
     }
     
     // Método para exibir as informações do carro
     public void exibirInformacoes() {
         System.out.println("Marca: " + marca);
         System.out.println("Modelo: " + modelo);
         System.out.println("Ano de Fabricação: " + anoFabricacao);
     }
}
