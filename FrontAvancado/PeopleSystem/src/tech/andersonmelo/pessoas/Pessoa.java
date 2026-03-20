package tech.andersonmelo.pessoas;

import tech.andersonmelo.auxi.Endereco;

public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected Endereco endereço;
    protected String telsContato;

    public void cadastrar(){};
    public int obterIdade(){
        return 0;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }
}
