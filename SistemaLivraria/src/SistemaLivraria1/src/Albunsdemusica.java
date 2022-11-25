public class Albunsdemusica extends Sistema {
    private String id;
    private String nome;

    private String preco;

    private String genero;

    private String musicosbandas;

    private String selos;

    public Albunsdemusica(String nome, String id, String preco, String generos, String musicosbandas, String selos){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
        this.musicosbandas = musicosbandas;
        this.selos = selos;
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

    public String musicosbandas(){return this.musicosbandas;}
    public String selos(){return this.selos;}

    @Override
    public String tipo() {
        return null;
    }

}
