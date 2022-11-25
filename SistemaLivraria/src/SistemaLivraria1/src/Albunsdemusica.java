public class Albunsdemusica {
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
    public String musicosbandas(){return this.musicosbandas;}
    public String selos(){return this.selos;}

}
