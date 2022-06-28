import java.util.Arrays;
class Matrix {
    int[][] matrix;
    int columns;
    int rows;
    String[] columnsInString;

    Matrix(String matrixAsString) {
        String [] lines = matrixAsString.trim().split("\n");
        for (int x = 0 ; x < lines.length ; x++){
        this.columnsInString = lines[x].split(" ");
    }
        this.rows = lines.length;
        this.columns = this.columnsInString.length;
        this.matrix = new int [rows][columns];
        for (int a = 0 ; a < lines.length ; a++){
            String st = lines[a];
            String[] stArray = st.split(" ");
            for (int b = 0 ; b < stArray.length ; b++){
             int num = Integer.parseInt(stArray[b]); 
                matrix[a][b] = num; 
            }
        }
    
      }    
             
    int[] getRow(int rowNumber) {
   
        int[] row = new int [this.columns];
        int[] rowToExtract = this.matrix[rowNumber-1];
            for(int j = 0; j< rowToExtract.length; j++){
               row[j] = rowToExtract[j] ;
            }
         return row;     
    }

    int[] getColumn(int columnNumber) {
        
        int [] column = new int [this.rows];
        for(int i = 0; i < this.rows ; i++){
               column[i] = this.matrix[i][columnNumber-1] ;
            }
         return column;     
    }
    }

