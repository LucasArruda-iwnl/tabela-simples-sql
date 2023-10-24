/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

import DAO.ConnectionFactory;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestePessoa {

    public static void main(String[] args) throws SQLException {
        
        String nome, fone, email; 
        int codigo; 
        
        
        String menu = "1- Cadastrar \n2-Atualizar \n3-Deletar \n4-Listar"
                + " \n0-Sair";
        int opcao;
        
        do{  Pessoa p = new Pessoa(); 
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao) {
                case 1:
                    System.out.println("cadastrar");
                    nome = JOptionPane.showInputDialog("nome: ");
                    email =   JOptionPane.showInputDialog("e-mail: ");
                    fone =  JOptionPane.showInputDialog("telefone: ");
                  

                    p.setNome(nome);
                    p.setEmail(email); 
                    p.setFone(fone);
                    
                    
                    p.inserir();
                    break;
                    
                case 2:
                     System.out.println("Atualizar");
                    nome = JOptionPane.showInputDialog("nome: ");
                    email =   JOptionPane.showInputDialog("e-mail: ");
                    fone =  JOptionPane.showInputDialog("telefone: ");
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("código: ")); 
                  

                    p.setNome(nome);
                    p.setEmail(email); 
                    p.setFone(fone);
                    p.setCodigo(codigo); 
                    p.inserir();
                    break; 
                    
                    
                case 3: 
                      System.out.println("Deletar");
         
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("código: ")); 
                  

                   
                    p.setCodigo(codigo); 
                    p.apagar(); 
                    break; 
                case 4: 
                    System.out.println("listar");
                    p.listar(); 
                default:
                    System.out.println("Opção Inválida!!");
            }
            
            
        } while (opcao != 0);
        
        
        
 
    }
}
