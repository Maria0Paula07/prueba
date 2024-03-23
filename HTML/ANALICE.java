

public class ANALICE {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int arreglo_numeros[];
		double cantidad;
		int indice;
		cantidad = 3;
		arreglo_numeros = new int[3];
		for (indice=1; indice<=3; ++indice) {
			arreglo_numeros[indice-1] = aleatorio(1, 3);
		}
		for (indice=1; indice<=3; ++indice) {
			System.out.println(arreglo_numeros[indice-1]+" "+Math.pow(arreglo_numeros[indice-1], 2));
		}
	}






    private static int aleatorio(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "ANALICE []";
    }


}
