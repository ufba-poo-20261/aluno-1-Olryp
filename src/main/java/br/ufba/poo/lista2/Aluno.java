package br.ufba.poo.lista2;

public class Aluno {

    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // matrícula só pode ser lida (não pode mudar)
    public String getMatricula() {
        return matricula;
    }

    // nome pode ser lido
    public String getNome() {
        return nome;
    }

    // nome pode ser alterado
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aluno outro = (Aluno) obj;
        return this.matricula.equals(outro.matricula);
    }
}
