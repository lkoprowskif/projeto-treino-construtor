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

        Colaborador objColaborador = new Colaborador();
        Endereco objEndereco = new Endereco();
        Empresa objEmpresa = new Empresa();

        objColaborador.setNumeroRegistro(inteiro("122343"));
        objColaborador.setNome(texto("Larissa"));
        objColaborador.setCpf(texto("123.456.789-10"));
        objColaborador.setQuantidadeHora(real("6"));
        objColaborador.setValorHora(real("20.543"));

        objColaborador.setEndereco(objEndereco);

        objEndereco.setLogradouro(texto("Rua Fiap"));


    }

}
