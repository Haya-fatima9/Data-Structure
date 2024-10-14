import java.util.Arrays; 

class Conversion {
    public static void noDup(int[][] array)
    {
        int row= array.length;
        int column=array[0].length;
        int[]tempArray=new int[row*column];
        int index=0;

//conversion of 2d to 1d array
        for(int i=0;i<=row;i++)
        {
            for(int j=0;j<=column;j++ )
            {
                tempArray[index]=array[i][j];
                index++;
            }
        }
// check for duplicate
for(int i=0 ;i<tempArray.length;i++)
{
    boolean isDuplicate=false;

    for(int j=0;j<i;j++)
    {
        if(tempArray[i]==tempArray[j])
        {
            isDuplicate =true;
            break;
        }
    }
    
        if(!isDuplicate)
        {
                System.out.println(tempArray[i] + " ");
        }

        
    }
}
}

    public class TwoDarray{
public static void main(String[] args) {
Conversion c =new  Conversion();
    int[][] array={{1,2,3,9,17},{3,4,5,8,11},{7,8,2,12,1},{17,18,19,11,20}};
    c.noDup(array);
    
}

}


