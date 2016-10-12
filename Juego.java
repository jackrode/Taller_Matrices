import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Juego {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TicTacToe game = new TicTacToe();
		
		
		System.out.println("\t¡¡¡¡¡Bienvenido al juego, chaval!!!!\t");
		System.out.println("Ingrese fila columna"
				+ "recuerde ingresar filas y columnas en un intervalo de 1 a 3");
		
		System.out.println("Fila:");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Columna:");
		
		int col=Integer.parseInt(br.readLine());
		game.placeMark(row, col);
		
		game.ImprimirPartida();
	
		
		if (game.checkForWin()) {
		   System.out.println("We have a winner! Congrats!");
		   game.ImprimirPartida();
		   System.exit(0);
		}
		else if (game.TableroLleno()) {
		  if (game.CheckEmpate());{
			  System.out.println("Appears we have a draw!");
			  game.ImprimirPartida();
		  }
		   System.exit(0);
		}
		


	}

}
