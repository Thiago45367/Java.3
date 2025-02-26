public class PessoApp {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bob","2517233");

        System.out.println("O nome é :"+p1.getNome()+ " Telefone"+ p1.getTelefone());

        p1.setNome("Davi");
        System.out.println("O novo nome é : "+p1.getNome()+ " Telefone"+ p1.getTelefone());

        Pessoa p2 = new Pessoa("Carlos","132142");

        System.out.println("O nome: "+p2.getNome()+ " Telefone"+p2.getTelefone());

    }
}
