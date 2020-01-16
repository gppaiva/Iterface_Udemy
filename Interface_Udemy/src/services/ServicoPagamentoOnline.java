package services;

import java.util.Date;

public interface ServicoPagamentoOnline {
	
	public double taxaPagamento(double valor);
	
	public double interest(double valor, Date meses);

}
