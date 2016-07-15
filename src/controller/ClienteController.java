/*
GUI =(É MOSTRAR) E SÓ PODE ACESSAR O CONTROLLER
 */
package controller;

import dao.ClienteDAO;
import dao.SexoDAO;
import model.Cliente;
import model.Sexo;

public class ClienteController {
    
    public boolean cadastrar(String nome, String cpf, String sexo){
       SexoDAO sdao = new SexoDAO(); 
       Sexo s = new Sexo();
           if (sdao.buscarPorSexo(sexo) != null){
               s = sdao.buscarPorSexo(sexo);
               Cliente cliente = new Cliente(nome, s, cpf); 
               ClienteDAO cdao = new ClienteDAO();
               if (cdao.inserir(cliente)){
               return true;
                   
               }
           }
           
           return false;
               
             
               
           }
           
    public void listar(){
        ClienteDAO cdao = new ClienteDAO();
        for(Cliente c: cdao.buscarTudo()){
            System.out.println(
                    "\tId: " + c.getId() +
                    "\tCPF: " + c.getCpf() +
                    "\tNome: "  + c.getNome() +
                    "\tSexo: "  + c.getSexo().getSigla());
    
        
       }
    
    }     
 }
    
    
    
    
    
    
    

