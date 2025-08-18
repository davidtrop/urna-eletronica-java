package beans;

public class Candidato {

    private int numero;
    private String nome;
    private String partido;
    private javax.swing.ImageIcon foto;
    private int votos;

    public Candidato(int numero, String nome, String partido, javax.swing.ImageIcon foto) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
        this.foto = foto;
        this.votos = 0;
    }

    public void receberVoto() {
        this.votos++;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public String getPartido() {
        return this.partido;
    }

    public javax.swing.ImageIcon getFoto() {
        return this.foto;
    }

    public int getVotos() {
        return votos;
    }
}
