package ejercicio5;

public class Torta {
	private String relleno;
	private String masa;
	private String paso1;
	private String paso2;
	private String paso3;
	private String paso4;
	
	
	public Torta(String relleno, String masa, String paso1, String paso2, String paso3, String paso4) {
		super();
		this.relleno = relleno;
		this.masa = masa;
		this.paso1 = paso1;
		this.paso2 = paso2;
		this.paso3 = paso3;
		this.paso4 = paso4;
	}


	@Override
	public String toString() {
		return "Torta [relleno=" + relleno + ", masa=" + masa + ", paso1=" + paso1 + ", paso2=" + paso2 + ", paso3="
				+ paso3 + ", paso4=" + paso4 + "]";
	}


	



	
}
