public class Livros extends Sistema {
    private String id;
    private String nome;

    private String preco;

    private String genero;

    private String escritor;

    private String editora;

    public Livros(String nome, String id, String preco, String generos, String escritor, String editora){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public String id(){
        return this.id;
    }

    public String nome(){
        return this.nome;
    }
    public String preco(){
        return this.preco;
    }
    public String genero(){
        return this.genero;
    }
    public String escritor(){
        return this.escritor;
    }
    public String editora(){
        return this.editora;
    }

    @Override
    public String distribuidora() {
        return null;
    }

    @Override
    public String estudio() {
        return null;
    }

    @Override
    public String diretores() {
        return null;
    }

    @Override
    public String produtores() {
        return null;
    }

    @Override
    public String musicosbandas() {
        return null;
    }

    @Override
    public String selos() {
        return null;
    }

    @Override
    public String tipo() {
        return null;
    }

}
