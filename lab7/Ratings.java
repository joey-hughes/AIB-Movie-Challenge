
/**
 * Write a description of class Ratings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ratings
{
    
    public static void main (String [] args)
    {
        
        FileIO reader = new FileIO();
        Scanner scan = new Scanner(System.in);
 
        String[] ratings = reader.load("E://ratings.csv");
        String[][] table2 = new String [(ratings.length+1)][3];
        
        
        //storing the values of each column in ratings into a 3D array
        for (int i = 0; i<ratings.length; i++)
        {
            String[] temp = ratings[i].split(",");
            table2[i][0]=temp[0];
            table2[i][1]=temp[1];
            table2[i][2]= temp[2];
        }
        
       
            
        //printing out array
        for(int j = 0; j< ratings.length; j++)
        {
            for(int k=0; k<3;k++)
            {
                System.out.println(table2[j][k]);
            }
        }
    }
}
