/*

 */
package view;

import controller.ClienteController;

import java.util.Scanner;


public class ClienteGUI {
    Scanner sc = new Scanner(System.in);
    
    public ClienteGUI(){}
    
    public void cadastrar(){
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("CPF: ");
        String cpf = sc.next(
        );
        System.out.print("Sexo: ");
        String sexo = sc.next();
        
        
        ClienteController cc = new ClienteController();
        if (cc.cadastrar(nome, cpf, sexo)){
            System.out.println("Cliente Cadastrado com Sucesso");
            
        }else{
            System.out.println("Falha no cadastro");
     
          
        }
        
        
    }
     
    public static void main(String[] args) {
        ClienteGUI gui = new ClienteGUI();
        gui.cadastrar();
        
        
        
    }
    
}
