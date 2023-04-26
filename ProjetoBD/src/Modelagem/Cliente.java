/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm-2
 */
public class Cliente {
    
    private String nome;
    private String endereco;
    private String telefone;
    
    // instanciar a classe conexao
    
    Conexao conCliente = new Conexao();
    
    public Cliente(){
        this("","","");
    }

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void salvar(){
        String sql = "Insert into cliente(nome,endereco,telefone)values"+"('"+getNome()+"' ,'"+getEndereco()+"' , '"+getTelefone()+"')";
        conCliente.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro salvo com sucesso!!");
    }
    public ResultSet Consultar(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from Cliente";
        tabela = conCliente.RetornarResultset(sql);
        return tabela;
    }
    
}
