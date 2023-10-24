import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploVetores{
    public static void main(String[] args) {
        // //String nome1 = "Ana"; 
        // //String nome2 = "Marcos";

        // String[] nomes = new String[10];

        // nomes[0] = "Silas";
        // nomes[1] = "Sabrina";
        
        // for(int i = 0; i < nomes.length ;i++){
        //     System.out.println(nomes[i]);
        // }
        int cap = 0;

        String [] nomes = new String[cap];
        int controle = 0;
        
        do{
            // System.out.println("digite : \n\n1 - escrever nomes \n2 - exibir nomes\n0 - sair ");
            controle = Integer.parseInt(
                JOptionPane.showInputDialog(
                    null,"digite : \n\n1 - escrever nomes \n2 - exibir nomes\n0 - sair \n\ncapacidade : " + cap + "\nvetor : "+ nomes.length));
            
            switch(controle){
                case 1:
                    cap = cap +Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos nomes ?"));
                    nomes = new String[cap];
                    for(int i = 0; i < nomes.length ;i++){
                        nomes[i] = JOptionPane.showInputDialog(null,"Digite o nome " + (i + 1) );
                    }
                    break;

                case 2:
                    int i = 0;
                    String text = "";

                    for(String nome : nomes){
                        
                        text = text + "\n" + (i + 1) +" - "+ nome;
                        i++;
                    }
                    JOptionPane.showMessageDialog(null, text);

                    break;

                case 0:
                    
                    break;
            }
        }while(controle != 0);
    }
}