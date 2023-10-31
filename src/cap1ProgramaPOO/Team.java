package cap1ProgramaPOO;

public class Team {
    Member member;
    public Team (Member member){
        this.member = member;
    }
    
    public static void main(String[] args) {

        Member membro = new Member("Nanda", "Java", 1, 8);
        Team time = new Team(membro);

        System.out.println(time.member.getNome());
    }
}

class Member {
    public Object member;
    private String nome;
    private String tipo;
    private int nivel;
    private int rank;

    public Member (String nome, String tipo,int nivel, int rank){
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
}