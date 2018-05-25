//LUCAS DOMINGOS LEAO GOMES
public class SeguroAuto extends Seguro {
private int deducaoAutomovel;
private int numLicenca;
private String estado;
private String modelo;
private int ano;
public int getDeducaoAutomovel() {
	return deducaoAutomovel;
}
public void setDeducaoAutomovel(int deducaoAutomovel) {
	this.deducaoAutomovel = deducaoAutomovel;
}
public int getNumLicenca() {
	return numLicenca;
}
public void setNumLicenca(int numLicenca) {
	this.numLicenca = numLicenca;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}

public SeguroAuto(int numApolice, String nome, Endereco endereco, float valor, float premio, int deducaoAutomovel, int numLicenca, String estado, String modelo, int ano) {
	super(numApolice, nome, endereco, valor, premio);
	this.deducaoAutomovel = deducaoAutomovel;
	this.numLicenca = numLicenca;
	this.estado = estado;
	this.modelo = modelo;
	this.ano = ano;
	
}
public String toString() {
	StringBuilder sb = new StringBuilder();
	/*sb.append("Numero de Apolice:"+this.numApolice).append("\n");
	sb.append("Nome:"+this.nome).append("\n");
	sb.append("Endereco:"+this.endereco).append("\n");
	sb.append("Valor:"+this.valor).append("\n");
	sb.append("Premio:"+this.premio).append("\n");*/
	sb.append("Deducao do Automovel: "+this.deducaoAutomovel).append("\n");
	sb.append("Numero da Licenca: "+this.numLicenca).append("\n");
	sb.append("Estado: "+this.estado).append("\n");
	sb.append("Modelo: "+this.modelo).append("\n");
	sb.append("Ano: "+this.ano).append("\n");
	return super.toString()+sb;
}
}
