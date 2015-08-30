
/**
 * Write a description of class lab7split here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class lab7split
{
    public static void main(String[] args)
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
        
        
        String[][] table3= new String[(table2.length+1)][2];
        for (int i = 0; i<table2.length; i++)
        {
            
            String[] temp = table2[i][1].split("[\\r\\n]+");
            table3[i][0]=table2[i][0];
            table3[i][1]= temp[0];
        }
        
        
        
        for(int i=0;i<=98692;i++)
        {
            for(int j=0;j<2;j++)
            {
                
                 
                System.out.print(table3[i][j]);
                System.out.print(" ");

               
            }
          
            System.out.println();
        }
            
            
        
        
         
          
   
}
}
