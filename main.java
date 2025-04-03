public class Ave {
    private String nome;
    private String corPena;
    private String Som;
    
    public Ave(String nome, String corPena){
            this.nome = nome;
            this.corPena = corPena;
            }
    public String getNome(){
        return this.nome;
    }
    
public String getcorPena (){
    return this.corPena;
}
public String getSom (){
    return this.Som;
}

public void voar(){
    System.out.println("voando");
