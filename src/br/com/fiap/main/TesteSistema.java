package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Empresa;
import br.com.fiap.entities.Endereco;

import javax.swing.*;

public class TesteSistema {
    //String
    static String texto(String j){

        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j) {
        return Integer.parseInt(j);
    }
    //double
    static double real(String j){

        return Double.parseDouble(j);
    }

    public static void main(String[] args) {
        //String nome, int numeroRegistro, String cpf, double valorHora, double quantidadeHora
        Colaborador objColaborador = new Colaborador(
                texto("--Informações do colaborador--\nNome:"),
                inteiro("Nº de registro: "),
                texto("CPF:"),
                real("Valor da hora:"),
                real("Quantidade da hora:")
        );


        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndereco = new Endereco(
                texto("--Informações do endereço do colaborador--\nLogradouro:"),
                inteiro("Número:"),
                texto("Complemento"),
                texto("CEP: "),
                texto("Bairro: "),
                texto("Cidade"),
                texto("Estado")
        );

        //String cnpj, String nomeFantasia, String razaoSocial, String segmento
        Empresa objEmpresa = new Empresa(
                texto("--Informações da empresa--\nCNPJ: "),
                texto("Nome fantasia: "),
                texto("Razão Social: "),
                texto("Segmento:")
        );



        System.out.println(
                objColaborador + "" + objEmpresa
        );

    }

}
