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
        //String nome, int numeroRegistro, String cpf, double valorHora, double quantidadeHoraa
        Colaborador objColaborador = new Colaborador();

        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade, String estado
        Endereco objEndereco = new Endereco();

        //String cnpj, String nomeFantasia, String razaoSocial, String segmento
        Empresa objEmpresa = new Empresa();



        System.out.println(
                objColaborador + "" + objEmpresa
        );

    }

}
