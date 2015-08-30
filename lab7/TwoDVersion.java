import java.util.*;
public class TwoDVersion
{
    public static void main (String [] args)
    {
        
        FileIO reader = new FileIO();
        Scanner scan = new Scanner(System.in);
 
        //importing movies.csv and converting it to a string array using a split method
        String[] movies = reader.load("E://movies.csv");
        String[][] table1 = new String [(movies.length+1)][2];
        
        for (int i = 0; i<movies.length; i++)
        {
            String[] temp = movies[i].split(",");
            table1[i][0]=temp[0];
            table1[i][1]=temp[1];
        }
        
        //imprting ratings.csv and converting it to a string array using a split() method
           String[] ratings = reader.load("E://ratings.csv");
           String[][] table2 = new String [(ratings.length+1)][3];
          
        for (int i = 0; i<ratings.length; i++)
        {
            String[] temp = ratings[i].split(",");
            
            table2[i][0]=temp[1];
            table2[i][1]= temp[2];
        }
        
        //Creating a 2D integer array containing movieID and one rating for it
        int[][] movRatInt= new int[98693][2];
        for(int i=0;i<=98692;i++)
        {
            for(int j=0; j<2;j++)
            {
                try{
                    movRatInt[i][j]= Integer.parseInt(table2[i][j]);
                }catch(NumberFormatException ex){
                    if(table2[i][j]=="5")
                    {
                    movRatInt[i][j]=5;
                    }
                    
                     if(table2[i][j]=="4")
                    {
                    movRatInt[i][j]=4;
                    }
                    
                     if(table2[i][j]=="3")
                    {
                    movRatInt[i][j]=3;
                    }
                    
                     if(table2[i][j]=="2")
                    {
                    movRatInt[i][j]=2;
                    }
                    
                     if(table2[i][j]=="1")
                    {
                    movRatInt[i][j]=1;
                    }
                
                }
               
                 System.out.print(movRatInt[i][j]);
                 System.out.print(" ");
                
               
            }
            System.out.println();
        }
    }
}
        
        