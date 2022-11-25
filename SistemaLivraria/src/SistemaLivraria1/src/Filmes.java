public class Filmes extends Sistema {
    private String id;
    private String nome;

    private String preco;

    private String genero;

    private String diretores;

    private String estudio;

    private String produtores;

    public Filmes(String nome, String id, String preco, String generos, String diretores, String estudio){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
        this.diretores = diretores;
        this.estudio = estudio;
        this.produtores = produtores;
    }

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

    @Override
    public String escritor() {
        return null;
    }

    @Override
    public String editora() {
        return null;
    }

    @Override
    public String distribuidora() {
        return null;
    }

    public String diretores(){return this.diretores;}

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

    public String estudio(){return this.estudio;}

    public String Produtores(){return this.produtores;}

}
