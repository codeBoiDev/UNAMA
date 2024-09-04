class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade; 

    //construtor (metodo) - cria o objeto, tem o mesmo nome da classe (JAVA)
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) { //o metodo possui os atributos da classe
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;

    }

    //metodos Get e Set 
    public String getTitulo() {
        return this.titulo; //"this" busca a variavel dentro do objeto
    }

    public void setTitulo(String titulo) { //altera um valor ("seta")
    this.titulo = titulo; //Set nao retorna nada ~ void

    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public void exibirDetalhes() {
        
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Descricao: "+ this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);

    }

}

public class Main {

    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar Classes", "Amanhã", 8); //usando o construtor
        Tarefa tarefa2 = new Tarefa("Estudar Concstrutores", "Revisar metodos", "Hoje",0);
        tarefa1.exibirDetalhes();
        tarefa2.exibirDetalhes();
    }

}