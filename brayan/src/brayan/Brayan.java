package brayan;

public class Brayan {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando livros
        Livro livro1 = new Livro(1, "Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro(2, "A Divina Comédia", "Dante Alighieri", 1320);
        Livro livro3 = new Livro(3, "As Viagens de Gulliver", "Jonathan Swift", 1726);

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando membros
        Membro membro1 = new Membro(1, "João", "Rua A, 123", "joao@example.com");
        Membro membro2 = new Membro(2, "Maria", "Rua B, 456", "maria@example.com");

        // Adicionando membros à biblioteca
        biblioteca.adicionarMembro(membro1);
        biblioteca.adicionarMembro(membro2);

        // Realizando empréstimos
        biblioteca.realizarEmprestimo(livro1, membro1);
        biblioteca.realizarEmprestimo(livro2, membro2);
        biblioteca.realizarEmprestimo(livro3, membro1);

        // Devolvendo livros
        biblioteca.devolverLivro(livro1, membro1);
    }
}
