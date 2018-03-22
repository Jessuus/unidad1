public class Empleado{

	private String nombre;
	private String apellidopaterno;
	private double salariomensual;
    private double sueldobase;

	public Empleado(String nombre, String apellidopaterno, double salariomensual)
	{

		this.nombre = nombre;
		this.apellidopaterno=apellidopaterno;
		this.salariomensual=salariomensual;
                sueldobase=8000.00;
	}


		public void establecernombre(){
			System.out.println("su nombre es "+ ( nombre    +    apellidopaterno ));

		}
		public void establecersalariobase(){
		if (salariomensual<0.0){
				System.out.println( nombre    +    apellidopaterno +" salario anual es 0.0");
                               
				}
                else if (salariomensual != 8000.00 ) { 
                    
			System.out.println("su salario mensual de "+( nombre    +    apellidopaterno) +"debe ser de " +(sueldobase ));
			}
                else {
                        System.out.println( nombre    +    apellidopaterno+ "su salario mensual es de "+ sueldobase );
                        System.out.println( nombre    +    apellidopaterno+ "su salario anual es de "+( sueldobase * 12));
                        }
                }
		public void establecersalariomensual(){
		if (salariomensual<0.0){
                   
				System.out.println( (nombre    +    apellidopaterno)+ " su salario anual es 0.0");
                               
				}
                else { 
                     System.out.println( nombre    +    apellidopaterno+ " su salario mensual es de "+ salariomensual );
					System.out.println( nombre    +    apellidopaterno+" su salario anual es de "+ ( salariomensual * 12));
			}
}
}