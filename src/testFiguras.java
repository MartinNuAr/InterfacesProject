
public class testFiguras {
	
	// Se imprimen valores de prueba para probar el funcionamiento
	
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Triángulo T1", 20.0, 10.0, 15.0); imprimirCalculo(t1);
		Triangulo t2 = new Triangulo("Bermudas", 87.0, 121.0, 101.0); imprimirCalculo(t2); 
		Cuadro c1 = new Cuadro("Cuadro 1", 5.0); imprimirCalculo(c1);
		Rectangulo re1 = new Rectangulo("Rectángulo", 5.0, 10.0); imprimirCalculo(re1);
		Rombo ro1 = new Rombo("Rombo 1", 15, 10, 20); imprimirCalculo(ro1);
		Romboide rm1 = new Romboide("Romboide 1", 10, 5); imprimirCalculo(rm1);
		Trapecio tr1 = new Trapecio("Trapecio", 5, 10, 5, 20, 10, 20, 12); imprimirCalculo(tr1);
		
	} // main
	
	// Se crea un método para imprimir los datos
	
	public static void imprimirCalculo(FiguraGeometrica fg) {
		System.out.println("========================");
		System.out.println("|El área de [" + fg.getName() +"] es: " + fg.calcularArea());
		System.out.println("|El perímetro de [" + fg.getName() +"] es: " + fg.calcularPerimetro());
		System.out.println("========================");
	}

} // testFiguras
