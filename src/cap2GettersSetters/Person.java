package cap2GettersSetters;

public class Person {
    
    //main
    public static void main(String[] args) {
        Person pessoa = new Person("Maria Fernanda Pereira Caetano");
        System.out.println(pessoa.getNome());
        pessoa.setNome("Maria");
        System.out.println(pessoa.getNome());
    }

    //variaveis
    private String nome;
    //construtor
    public Person(String nome){
        this.nome = nome;
    }
    //getters e setters
    public String getNome() {
        if (nome.length()>16) {
            return "Nome muito grande";
        }
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && nome.length()>2) {
            this.nome = nome;
        }
        
    }
}
