public class No {
    int idade;
    No proximo;

    No(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        // Criando os nós
        No n1 = new No(40);
        No n2 = new No(38);
        No n3 = new No(22);

        // Ligando os nós
        n1.proximo = n2;
        n2.proximo = n3;

        // Exibindo as idades
        System.out.println("Primeiro nó: " + n1.idade);
        System.out.println("Segundo nó: " + n1.proximo.idade);
        System.out.println("Terceiro nó: " + n1.proximo.proximo.idade);
    }
}
