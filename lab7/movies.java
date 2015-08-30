
/**
 * Write a description of class movies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class movies
{ public static void main (String [] args)
    {
        
        FileIO reader = new FileIO();
        Scanner scan = new Scanner(System.in);
 
        String[] movies = reader.load("E://movies.csv");
        
        String[][] table1 = new String [(movies.length+1)][2];
        
        for (int i = 0; i<movies.length; i++)
        {
            String[] temp = movies[i].split(",");
            table1[i][0]=temp[0];
            table1[i][1]=temp[1];
        }
        
        
        
    
        for(int j = 0; j< movies.length; j++)
        {
            for(int k=0; k<2;k++)
            {
                System.out.println(table1[j][k]);
            }
        }
    }
}
