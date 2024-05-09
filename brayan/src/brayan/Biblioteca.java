package brayan;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void realizarEmprestimo(Livro livro, Membro membro) {
        if (livros.contains(livro) && membros.contains(membro)) {
            Emprestimo emprestimo = new Emprestimo(livro, membro);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado: " + emprestimo);
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
        }
    }

    public void devolverLivro(Livro livro, Membro membro) {
        Emprestimo emprestimo = buscarEmprestimo(livro, membro);
        if (emprestimo != null) {
            emprestimos.remove(emprestimo);
            System.out.println("Livro devolvido: " + livro);
        } else {
            System.out.println("Não foi possível devolver o livro.");
        }
    }

    private Emprestimo buscarEmprestimo(Livro livro, Membro membro) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro) && emprestimo.getMembro().equals(membro)) {
                return emprestimo;
            }
        }
        return null;
    }
}
