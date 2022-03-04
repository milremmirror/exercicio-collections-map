import java.util.Objects;

public class Contato {
    private String nome;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    private Integer numero;

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }
}
