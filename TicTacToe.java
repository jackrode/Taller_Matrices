
public class TicTacToe {

	private char [][] tablero;
	private char jugador;
	
	public TicTacToe(){
		tablero = new char [3][3];
		jugador='x';
		iniciartablero();
		
		}
	public void iniciartablero(){
		 for (int i = 0; i < 3; i++){
			 for (int j = 0; j < 3; j++){
			   tablero[i][j] = '-';

			 }
		 }
	}
	public void ImprimirPartida(){
		  System.out.println("-------------");
		          for (int i = 0; i < 3; i++) {
		              System.out.print("| ");
		              for (int j = 0; j < 3; j++) {
		                  System.out.print(tablero[i][j] + " | ");
		              }
		              System.out.println();
		              System.out.println("-------------");
		          }
		      }

	public boolean TableroLleno(){
		boolean TableroLleno= true;
		 for (int i = 0; i < 3; i++){
			 for (int j = 0; j < 3; j++){
			   if(tablero[i][j] == '-');{
				   TableroLleno=false;
			   }

			 }
		 }
		return TableroLleno;
	}
	public char NuevoTurno(char jugador) {
	    this.jugador=jugador;
		char nuevoTurno='e';
	    if (jugador == 'o')
	        nuevoTurno='x';
	    if (jugador == 'x')
	        nuevoTurno='o';
	    return nuevoTurno;
	}
	public boolean CheckEmpate() {
	    for (int i = 0; i < 3; i++)
	        for (int p=0; p < 3; p++)
	            if(tablero [i][p]==' ')
	                return false;

	    return true;
	}
	public boolean checkForWin() {
		        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
		    }
	private boolean checkRowsForWin() {
		        for (int i = 0; i < 3; i++) {
		            if (checkRowCol(tablero[i][0], tablero[i][1], tablero[i][2]) == true) {
		                return true;
		            }
		        }
		        return false;
		    }
		     


	 private boolean checkColumnsForWin() {
		         for (int i = 0; i < 3; i++) {
		             if (checkRowCol(tablero[0][i], tablero[1][i], tablero[2][i]) == true) {
		                 return true;
		             }
		         }
		         return false;
		     }
	 
		     private boolean checkDiagonalsForWin() {
		         return ((checkRowCol(tablero[0][0], tablero[1][1], tablero[2][2]) == true) || (checkRowCol(tablero[0][2], tablero[1][1], tablero[2][0]) == true));
		     }
		     
		     private boolean checkRowCol(char c1, char c2, char c3) {
		         return ((c1 != '-') && (c1 == c2) && (c2 == c3));
		     }
		     public boolean placeMark(int row, int col) {
		    	         if ((row >= 0) && (row < 3)) {
		    	             if ((col >= 0) && (col < 3)) {
		    	                 if (tablero[row][col] == '-') {
		    	                     tablero[row][col] = jugador;
		    	                     return true;
		    	                 }
		    	             }
		    	         }
		    	         return false;
		    	     }

}

