public class Brinquedos extends Sistema {
    private String id;
    private String nome;

    private String preco;

    private String tipo;

    public Brinquedos(String nome, String id, String preco, String tipo){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
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

    @Override
    public String genero() {
        return null;
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

    @Override
    public String musicosbandas() {
        return null;
    }

    @Override
    public String selos() {
        return null;
    }

    public String tipo(){
        return this.tipo;
    }

}
