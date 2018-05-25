//LUCAS DOMINGOS LEAO GOMES
public class SeguroCasa extends Seguro {

	private int deducaoCasa;
	private int anoConstrucao;
	public int getDeducaoCasa() {
		return deducaoCasa;
	}
	public void setDeducaoCasa(int deducaoCasa) {
		this.deducaoCasa = deducaoCasa;
	}
	public int getAnoConstrucao() {
		return anoConstrucao;
	}
	public void setAnoConstrucao(int anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}
	
	public SeguroCasa(int numApolice, String nome, Endereco endereco, float valor, float premio, int deducaoCasa, int anoConstrucao) {
		super(numApolice, nome, endereco, valor, premio);
		this.deducaoCasa = deducaoCasa;
		this.anoConstrucao = anoConstrucao;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ano de Construcao: "+this.anoConstrucao).append("\n");
		sb.append("Deducao Casa: "+this.deducaoCasa).append("\n");
		return super.toString()+sb;
	}
}
