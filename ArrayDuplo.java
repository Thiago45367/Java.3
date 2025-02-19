public class ArrayDuplo {
    

    public static void main(String[] args) {
        // Decração e inicialização dos arrays
        String[] alunos ={"ANA","BRUNO","CARLOS","DIANA"};
        double[] notas ={8.5, 7.0, 9.2, 6.8};

        // Percorrendo os arrays e exibindo os dados
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i] + " - Nota: " + notas[i]);
        }
    }
}
