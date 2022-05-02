public class Pilotos {
    private String _nome;
    private int _cpf;
    

    public Pilotos(String nome, int cpf) {
        _nome = nome;
        _cpf = cpf;
        
    }

    public String get_nome() {
        return _nome;
    }
    public int get_cpf() {
        return _cpf;
    }
   
    
    @Override
    public String toString(){
        return "Nome: " + _nome + " " + _cpf;
    }

   

   
}