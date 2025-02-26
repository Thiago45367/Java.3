
    class Camisa {
      // Atributos privados (encapsulamento)
      private String cor;
      private String tamanho;
      private String tipo;
      
      // Construtor para inicializar a camisa
      public Camisa(String cor, String tamanho, String tipo) {
          this.cor = cor;
          this.tamanho = tamanho;
          this.tipo = tipo;
      }
  
      // Métodos getters e setters para acessar e modificar os atributos
      public String getCor() {
          return cor;
      }
  
      public void setCor(String cor) {
          this.cor = cor;
      }
  
      public String getTamanho() {
          return tamanho;
      }
  
      public void setTamanho(String tamanho) {
          this.tamanho = tamanho;
      }
  
      public String getTipo() {
          return tipo;
      }
  
      public void setTipo(String tipo) {
          this.tipo = tipo;
      }
  
      // Método para exibir as informações da camisa
      public void exibirInformacoes() {
          System.out.println("Cor: " + cor);
          System.out.println("Tamanho: " + tamanho);
          System.out.println("Tipo: " + tipo);
      }
  }

