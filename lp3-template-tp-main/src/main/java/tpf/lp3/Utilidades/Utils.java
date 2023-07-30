package tpf.lp3.Utilidades;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	public static String definirOperacion(String origen) {
		if(Objects.equals(origen, "Paraguay") || Objects.equals(origen, "paraguay") ){
			return "Exportacion";
			
		}
		else return "Importacion";	
	}
	public static Boolean tieneDescuento(String origen) { // retorna true si es un producto del Mercosur y false en caso contrario
		Boolean esMercosur = false;
		String[] mercosur = {"Argentina", "Paraguay", "Brasil", "Bolivia", "Uruguay", "Venezuela"};
		for(int i=0; i<5; i++) {
			if(Objects.equals(origen, mercosur[i])) {
				esMercosur=true;
				break;
			}
		}
		return esMercosur;
	}
	
}



