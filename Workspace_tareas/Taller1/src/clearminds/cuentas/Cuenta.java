package clearminds.cuentas;

public class Cuenta {
	//Declaracion atributos
	private String id;
	private String tipo = "A";
	private double saldo;
	
	//Encapsulamiento
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	
	//Constructores
	public Cuenta (String id) {
		this.id = id;
		tipo = "A";
	}
	
	public Cuenta (String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	
	public void imprimir () {
		System.out.println("************************");
		System.out.println("");
		System.out.println("         CUENTA         ");
		System.out.println("");
		System.out.println("************************");
		System.out.println("");
		System.out.println("Número de cuenta: "+id);
		System.out.println("");
		System.out.println("Tipo de cuenta: "+tipo);
		System.out.println("");
		System.out.println("Saldo: "+saldo);
		System.out.println("");
		System.out.println("************************");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("/*/*/*/*/*/ CUENTA /*/*/*/*/*/");
		System.out.println("------------------------------");
		System.out.println("|*| NUMERO DE CUENTA: "+id);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("|*| TIPO: "+tipo);
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("|*| SALDO: "+saldo);
		System.out.println("------------------------------");
		System.out.println("|                            |");
		
	}
	
}
