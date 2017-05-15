package utils;

public class Sinal {
	
	private int remetente;
	private int destinatario;
	private int tipo;

	public Sinal(int remetente, int destinatario, int tipo) {
		super();
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.tipo = tipo;
	}

	public int getRemetente() {
		return remetente;
	}

	public void setRemetente(int remetente) {
		this.remetente = remetente;
	}

	public int getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(int destinatario) {
		this.destinatario = destinatario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Sinal [remetente=" + remetente + ", destinatario=" + destinatario + ", tipo=" + tipo + "]";
	}

}