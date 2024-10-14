import java.util.Arrays; 
public class Crop { 

void extractBoundaries(int arr [][]){
    int row= arr.length;
    int col=arr[0].length;
    //print first row
    printRow(arr[0]);

    
        // Print the first column
        for (int i = 1; i < row; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();

        // Print the last row
        if (row > 1) {
            printRow(arr[row - 1]);
        }

          // Print the last column
          for (int i = 1; i < row - 1; i++) {
            System.out.print(arr[i][col - 1] + " ");
        }
        System.out.println();
    }
}
private void printRow(int[] row) {
    for (int i=0;i<row.length;i++) {
        System.out.print(row[i] + " ");
    }
    System.out.println();
}

void cropCenterPart(int[][] arr) {
    int rows = arr.length;
    int cols = arr[0].length;

    // Print the center part if there is enough space
    if (rows > 2 && cols > 2) {
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    } else {
        System.out.println("The center part does not exist.");
    }
}

    
    public static void main(String []args ){
       
            int [][] arr={{1,1,1,1},{1,0,0,1},{1,0,0,1},{1,1,1,1}};
            Crop cr =new Crop();
            System.out.println("print boundaries");
            cr.extractBoundaries(arr);
            System.out.println("print center part ");
            cr.cropCenterPart(arr);

                

    }

    

