package app;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
    	student.setSaldo(2000);
        Titular titul= new Titular("56f",TipoDocumento.CUC,"ffff", LocalDate.now(),"asalomao@uta.cv");


        EpassStudent student= new EpassStudent(8,"uta") {
            
            @Override
            protected void clone(EpassStandard pass) {

            }
        };



    }
}
