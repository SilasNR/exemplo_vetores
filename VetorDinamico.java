public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos;
    
    public VetorDinamico(){
        qtde = 0;
        cap = 4;
        elementos = new int[cap];
    }

    public void adicionar (int e){
        if(estaCheio())
            aumentarCapacidade();
        elementos[qtde++] = e; 
    }

    public void remover(){
        if(!estaVazio())
            qtde--;
    }

    public void exibir(){
        System.out.printf(
            "Qtde: %d\nCap: %d\n",
            qtde, cap
        );

        // for (int e : elementos){
        //     System.out.printf("%d ", e);
        // }
        for(int i = 0; i < qtde; i ++){
             System.out.printf("%d ", elementos[i]);
        }
    }

    private void aumentarCapacidade(){

        //1. alocar novo vetor com o dobro da capacidade atual
        var temp = new int[cap + cap];

        //2.Copiar todos os elementos para o vetor temp
        //faça um for

        // int i = 0;
        // for(int n : elementos){
        //     temp[i] = n;
        //     i++;
        // }

        for(int i = 0; i< elementos.length; i++){
            temp[i] = elementos[i];
        }

        //3. fazer com que elementos referencie o vetor referenciado por temp
        elementos = temp;

        //4. dobrar o valor de cap
        cap *= 2; // cap * 2;
    }

    private void reduzirCapacidade(){
        
    }

    private boolean estaCheio(){

        // if(qtde == cap)
        //     return true;
        // // }else{
        // //     return false;
        // // }
        // return false;

        // return qtde == cap ? true : false;
        return qtde == cap;
    }

    private boolean estaVazio(){
        return qtde == 0;
    }
}
