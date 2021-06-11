package app;
public class EpassFestival extends PasseSazonal implements TituloTransporte {
	private double saldoCartaoPgmt;
	private String nomeEvento;

	EpassFestival(double saldo,String evento){
		setNomeEvento(evento);
		setSaldoCartaoPgmt(saldo);

	}
	EpassFestival(String evento){
		setNomeEvento(evento);
	}
	EpassFestival(EpassFestival outros){
		setSaldoCartaoPgmt(outro.getSaldo());
		setNomeEvento(outro.getNomeEvento());
	}
}

