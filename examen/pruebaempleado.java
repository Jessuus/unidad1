class pruebaempleado{
	public static void main( String args[] ){
		
       		Empleado empleado1 = new Empleado(" Juan " , " Martinez ", 8000.0);
			empleado1.establecernombre();
			empleado1.establecersalariobase();
                               		
                        Empleado empleado2 = new Empleado(" Julio " , " Martinez ", 7000.0);
			empleado2.establecernombre();
			empleado2.establecersalariobase();


			Empleado empleado3 = new Empleado(" Pedro "," Juarez ", -12000.0);
			empleado3.establecernombre();
			empleado3.establecersalariomensual();
                        
                        Empleado empleado4 = new Empleado("Arturo "," Mendez ", 5000.0);
			empleado4.establecernombre();
			empleado4.establecersalariomensual();


}

}