package app;

public class EpassTurista extends PasseSazonal implements CartaoPagamento,TituloTransporte{
    Duracao duracao;

    EpassTurista(Duracao duracao){
        this.duracao=duracao;
    }

    EpassTurista(EpassTurista turista){
       this.duracao= turista.duracao;
   }


   public boolean pagar(double valor){
        boolean h= true;
        return h; 
    }

    public void creditar(double valor){

    }
    public void carregar(double i){}

    public void pagarViagem(double i){}

    public boolean checkValidade(){
        boolean t= true;
        return t;

    }
    public boolean passarSaldo(double PassStandard){
        boolean y= true;
        return public void testName() throws Exception {
            
        };
    }

    public Duracao getDuracao(){
        return duracao;

        }

}
