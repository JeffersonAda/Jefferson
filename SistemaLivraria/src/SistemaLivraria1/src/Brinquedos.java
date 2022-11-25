public class Brinquedos {
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
    public String tipo(){
        return this.tipo;
    }
    
}
