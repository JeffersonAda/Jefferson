public class Jogos {
    private String id;
    private String nome;

    private String preco;

    private String genero;

    private String distribuidora;

    private String estudio;

    public Jogos(String nome, String id, String preco, String generos, String distribuidora, String estudio){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
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
    public String distribuidora(){return this.distribuidora;}
    public String estudio(){
        return this.estudio;
    }

}
