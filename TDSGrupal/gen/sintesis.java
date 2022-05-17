
public class sintesis {
	private int variable, declaraciones;
	public sintesis () {
		variable = 0;
		declaraciones = 0;
	}
	
	public void newDec ( ) {
		declaraciones++;
		variable++;
	}
	
	public void newVar ( ) {
		variable++;
	}

	public void resumen () {
		if(declaraciones == 0) System.out.println("No hay declaraciones.");
		else {
			if(declaraciones == 1) System.out.print("Se ha detectado una declaraci�n ");
			else System.out.print("Se han detectado " + declaraciones + " declaraciones ");
			if(variable == 1) System.out.println(" con una variable.");
			else System.out.println("con " + variable + " variables.");
		}
		
	}

}
