package prova.exercicio4;

import java.util.Objects;

public class Pessoa {
    
    private long codigo;
    private String telefone;
    private int idade;

    public Pessoa() {}

    public Pessoa(long codigo, String telefone, int idade) {
        this.codigo = codigo;
        this.telefone = telefone;
        this.idade = idade;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return codigo == pessoa.codigo && idade == pessoa.idade && Objects.equals(telefone, pessoa.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, telefone, idade);
    }
}

