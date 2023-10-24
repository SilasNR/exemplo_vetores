public class Exemplo2Vetores {
    public static void main(String[] args) {
        //notas de alunos        0   1  2  3
        int [] notas = new int[]{4, 10, 6, 7};

        //exibir as notas
        for(int i = 0; 1 < notas.length;){
            System.out.println(notas[i++]);
        }

        //enhaced for (java 5 em diante)
        for (int nota : notas){
           System.out.println(nota);
        }

        //acumulador
        int soma = 0;
        for (int i = 0; i< notas.length; i++){
            soma = soma + notas[i];
        } 
        System.out.println(soma);
    }  
}
