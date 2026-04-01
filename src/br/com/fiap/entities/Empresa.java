package br.com.fiap.entities;

public class Empresa {

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String segmento;

    //Constructor vazioo
    public Empresa() {
    }
    //Constructor cheio
    public Empresa(String cnpj, String nomeFantasia, String razaoSocial, String segmento) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.segmento = segmento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return "\n\n--Empresa--" +
                "\nCnpj = " + cnpj +
                "\nNome Fantasia = " + nomeFantasia +
                "\nRazão Social = " + razaoSocial +
                "\nSegmento = " + segmento;
    }
}
