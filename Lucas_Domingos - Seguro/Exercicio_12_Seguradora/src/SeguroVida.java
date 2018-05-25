//LUCAS DOMINGOS LEAO GOMES
public class SeguroVida extends Seguro {

	public SeguroVida(int numApolice, String nome, Endereco endereco, float valor, float premio, String beneficiario, Data datanasc) {
		super(numApolice, nome, endereco, valor, premio);
		this.beneficiario = beneficiario;
		this.datanasc = datanasc;
	}
	private String beneficiario;
	private Data datanasc;
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	public Data getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(Data datanasc) {
		this.datanasc = datanasc;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Beneficiario: "+this.beneficiario).append("\n");
		sb.append("Data de nacimento: "+this.datanasc).append("\n");
		return super.toString()+sb;
	}
}
