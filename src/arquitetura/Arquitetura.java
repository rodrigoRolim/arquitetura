/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitetura;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo e Lucas Joaquim
 */
public class Arquitetura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Entre com um número 1 para adicionar cliente e 2 para listar todos os clientes 3 para sair");
            int index = scanner.nextInt();
            switch(index){
                case 1:
                    Scanner s = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente");
                    String name = s.nextLine();
                    cliente.addCliente(name);
                    break;
                case 2:
                    for(String c : cliente.getList()){
                        System.out.println("Nome " + c);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    
}
