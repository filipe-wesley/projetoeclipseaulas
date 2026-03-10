package gestaoBiblioteca.model;

//A) Superclasse abstrata Usuario, que será a base para as classes Aluno, Professor e Administrador//
//B) Criar a classe Usuario como uma classe abstrata, que não pode ser instanciada diretamente, 
// mas serve como base para as outras classes. Ela deve conter um atributo id e métodos para acessar e modificar esse id.//
//C) Implementar a interface Autenticavel na classe Usuario, para que os usuários possam ser autenticados no sistema.//
public abstract class Usuario implements Autenticavel{
    private long id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private Boolean primeiroAcesso = true;
    private Perfil perfil; // ADMIN, PROFESSOR, ALUNO//

    public Usuario(long id , String nome, String email, 
        String login, String senha, Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public void setId(long id) {
        if (id<=0) {
            throw new IllegalArgumentException("ID deve ser um número positivo.");
        }
        this.id = id;
    }
}