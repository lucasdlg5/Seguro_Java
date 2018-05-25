//LUCAS DOMINGOS LEAO GOMES
public abstract class Seguro {
private int numApolice;
private String nome;
private Endereco endereco;
private float valor;
private float premio;
public int getNumApolice() {
	return numApolice;
}
public void setNumApolice(int numApolice) {
	this.numApolice = numApolice;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
public float getValor() {
	return valor;
}
public void setValor(float valor) {
	this.valor = valor;
}
public float getPremio() {
	return premio;
}
public void setPremio(float premio) {
	this.premio = premio;
}

public Seguro (int numApolice, String nome, Endereco endereco, float valor, float premio) {
this.numApolice = numApolice;
this.nome = nome;
this.endereco = endereco;
this.valor = valor;
this.premio = premio;
}

public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("\n--------------------------\n\nNumero da Apolice: "+this.numApolice).append("\n");
	sb.append("Nome: "+this.nome).append("\n");
	sb.append("Endereco: "+this.endereco).append("\n");
	sb.append("Valor: "+this.valor).append("\n");
	sb.append("Premio: "+this.premio).append("\n");
	return sb.toString();
}


}
