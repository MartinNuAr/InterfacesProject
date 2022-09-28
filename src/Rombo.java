
public class Rombo implements FiguraGeometrica{

	private String name;
	private double lado;
	private double diagMenor;
	private double diagMayor;
	public Rombo(String name, double lado, double diagMenor, double diagMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagMenor = diagMenor;
		this.diagMayor = diagMayor;
	} // constructor
	
	public double calcularArea() {
		return (getDiagMayor()*getDiagMenor())/2;
	} // calcularArea
	
	public double calcularPerimetro() {
		return getLado()*4;
	} // calcularPerimetro
	
	public String getName() {
		return name;
	} // getName
	
	public void setName(String name) {
		this.name = name;
	} // setName
	
	public double getLado() {
		return lado;	
	} // getLado
	
	public void setLado(double lado) {
		this.lado = lado;
	} // setLado
	
	public double getDiagMenor() {
		return diagMenor;
	} // getDiagMenor
	
	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	} // setDiagMenor
	
	public double getDiagMayor() {
		return diagMayor;
	} // getDiagMayor
	
	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	} // setDiagMayor
	
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagMenor=" + diagMenor + ", diagMayor=" + diagMayor + "]";
	} // toString
	
	
}
