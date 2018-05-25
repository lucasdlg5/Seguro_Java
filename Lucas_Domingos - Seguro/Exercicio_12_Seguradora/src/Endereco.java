//LUCAS DOMINGOS LEAO GOMES
public class Endereco {
private String enderecoCompleto;
private String cidade;
private String estado;
private String cep;
public Endereco(String enderecoCompleto, String cidade, String estado, String cep) {
	this.enderecoCompleto = enderecoCompleto;
	this.cidade = cidade;
	this.estado = estado;
	this.cep = cep;
}
public String getEnderecoCompleto() {
	return enderecoCompleto;
}
public void setEnderecoCompleto(String endeecoCompleto) {
	this.enderecoCompleto = endeecoCompleto;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}

public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(this.enderecoCompleto).append("\n");
	sb.append("Cidade: "+this.cidade).append("\n");
	sb.append("Estado: "+this.estado).append("\n");
	sb.append("CEP: "+this.cep);
	return sb.toString();
}
}
