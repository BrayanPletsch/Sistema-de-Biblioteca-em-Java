
# Sistema de Biblioteca em Java

Este é um projeto de sistema de biblioteca desenvolvido em Java, demonstrando habilidades de **Programação Orientada a Objetos (POO)**.

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. **Livro.java**: Esta classe representa um livro na biblioteca, contendo informações como ID, título, autor e ano de publicação. Ela demonstra minha habilidade em modelar objetos com atributos relevantes e métodos de acesso para manipular esses atributos de forma segura.
	```java
	public class Livro {
	    private int id;
	    private String titulo;
	    private String autor;
	    private int anoPublicacao;
	    private boolean disponivel;
	}
	```

2. **Membro.java**: A classe Membro representa um membro da biblioteca, com atributos como ID, nome, endereço e email. Ela complementa o sistema, permitindo o cadastro e gerenciamento de membros que podem emprestar livros da biblioteca.
	```java
	public class Membro {
	    private int id;
	    private String nome;
	    private String endereco;
	    private String email;
	}
	```
    
3. **Biblioteca.java**: A classe Biblioteca é responsável por gerenciar o sistema como um todo, incluindo a adição de livros e membros, a realização de empréstimos e a devolução de livros emprestados. Demonstrando minha competência em desenvolver soluções robustas e bem estruturadas em Java.
	```java
	public class Biblioteca {
	    private List<Livro> livros;
	    private List<Membro> membros;
	    private List<Emprestimo> emprestimos;
	}
	```
## Funcionalidades Principais

- **Cadastro de Livros**: Permite adicionar novos livros à biblioteca.
	```java
	public class Biblioteca {
	    private List<Livro> livros;

	    public Biblioteca() {
	        this.livros = new ArrayList<>();
	    }
    
	    public void adicionarLivro(Livro livro) {
	        livros.add(livro);
	        System.out.println("Novo livro cadastrado: " + livro.getTitulo());
	    }
	}
	```
- **Cadastro de Membros**: Permite cadastrar novos membros que podem emprestar livros.
    ```java
  public class Biblioteca {
	    private List<Membro> membros;

	    public Biblioteca() {
	        this.membros = new ArrayList<>();
	    }

	    public void adicionarMembro(Membro membro) {
	        membros.add(membro);
	        System.out.println("Novo membro cadastrado: " + membro.getNome());
    }
    ```
- **Empréstimo de Livros**: Possibilita que membros realizem empréstimos de livros disponíveis na biblioteca.
    ```java
    public void realizarEmprestimo(Livro livro, Membro membro) {
        if (livros.contains(livro) && membros.contains(membro)) {
            Emprestimo emprestimo = new Emprestimo(livro, membro);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado: " + emprestimo);
        } else {
            System.out.println("Não foi possível realizar o empréstimo.");
        }
    }
    ```
- **Devolução de Livros**: Permite que membros devolvam os livros emprestados.
	```java
    public void devolverLivro(Livro livro, Membro membro) {
        Emprestimo emprestimo = buscarEmprestimo(livro, membro);
        if (emprestimo != null) {
            emprestimos.remove(emprestimo);
            System.out.println("Livro devolvido: " + livro);
        } else {
            System.out.println("Não foi possível devolver o livro.");
        }
    }
	```

## Execução

Para executar o projeto, basta compilar os arquivos `.java` e executar a classe principal `Brayan.java`.

```bash
javac *.java
java Brayan
> Biblioteca.java <
> Brayan.java <
> Emprestimo.java <
> Livro.java <
> Membro.java <
```

## Sobre o Autor

Este projeto foi desenvolvido por Brayan, demonstrando seu conhecimento em POO em Java. Você pode entrar em contato comigo em brayan.pletsch@gmail.com para mais informações.

---
Visite meu site: 
https://brayan.website
