package app;

import java.time.LocalDate;

public class EpassFuncionario extends EpassStandard implements TituloTransporte{
    @Override
    protected void clone(EpassStandard pass) {
    }

    public void carregar(double n){
        super.setSaldo(n);
    }
    public void pagarViagem(double n){

        if(super.getSaldo()<0)
            System.out.println("Saldo indisponivel");
        else
            super.pagarSaldo();
    }
    public boolean checkValidade(){
        boolean t;
        if(super.getDataValida().compareTo(LocalDate.now())<0){
            return t=true;
        }else return t=false;

    }
    public boolean passarSaldo(double PassStandard){
        boolean y= true;
        return y;
    }