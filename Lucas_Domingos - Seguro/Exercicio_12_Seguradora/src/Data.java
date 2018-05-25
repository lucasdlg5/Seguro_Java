//LUCAS DOMINGOS LEAO GOMES
public class Data {
private int dia;
private int mes;
private int ano;
public Data(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
}
public int getDia() {
	return dia;
}
public void setDia(int dia) {
	this.dia = dia;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(this.dia).append("/");
	sb.append(this.mes).append("/");
	sb.append(this.ano);
	return sb.toString();
}
}
