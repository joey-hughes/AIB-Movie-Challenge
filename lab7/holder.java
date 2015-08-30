//Creating a 2D integer array containing movieID and one rating for it
        int[][] movRatInt= new int[98693][2];
        for(int i=0;i<=98692;i++)
        {
            for(int j=0;j<2;j++)
            {
                movRatInt[i][j]= Integer.parseInt(table2[i][j]);
                 
                System.out.print(movRatInt[i][j]);
                System.out.print(" ");

               
            }
          
            System.out.println();
        }


//create a 1d count array and a 1d rating total array
        int [] count= new int[1683];
        int[] totalRatings=new int[1683];
        
        
       //running a loop and sorting the movieID and Rating together
       //starting with smallest movie Id, fiding how many times it was counted and its total count
       //selection sort
       //creating a new array, searches od array for the smalest value and puts it first in the new array
       //a new array has to be created as the old array is far too long than needed 
        for(int i=1;i<=1683;i++)
        {
            for(int j=0;j<=98693; j++)
            {
                if (movRatInt[i][0]==i)
                {
                    count[i]++;
                    totalRatings[i]= totalRatings[i]+i;
                }
            }
        }
        
        
        //now get the average rating for each of the movies by dividing the value in totalRatings and count
        int[] ratAvg=new int[1682];
        for(int i=0; i<1682; i++)
        {
            
            if(count[i]==0)
            {totalRatings[i]=0;
            }
            
            else{
                ratAvg[i]=totalRatings[i]/count[i];
            }
           
        }
        
        
        //Create a 2D wih MovieId and ratAvg
        int[][] movRat= new int[1682][2];
        for(int i=0; i<1682;i++)
        {  movRat[i][0]=i;
           for(int j=0;j<2;j++)
           {
               movRat[i][j]= (ratAvg[i]);
           }
        }
        
        
        //now sort this 2D array by ratings
        selectionSort(movRat);
       
        
       
        try{
            reader.save("E://resultsofCode.csv", mode(movRat));
        }catch (Exception e){
            System.out.println(e.getClass());
        }
    }
        
        
        
        public static void selectionSort(int[][] list)
        {

            for(int k = 0; k < list.length;k++){

                for(int i = 0; i < list[k].length;i++) {
                        int currentMin = list[k][i];
                        int currentMinIndexRow = k;
                        int currentMinIndexColumn = i;

                            if(k == 3 && i == 3) continue;

                                for(int m = k; m < list.length; m++){
                                    for (int j = i; j < list[k].length; j++) {
                                        if (m == k && i == j) continue;

                                        if (currentMin > list[m][j]) {
                                            currentMin = list[m][j];
                                            currentMinIndexRow = m;
                                            currentMinIndexColumn = j;
                                        }
                                    }
                                }       
                        if (currentMinIndexRow != k && currentMinIndexColumn != i) {
                            list[currentMinIndexRow][currentMinIndexColumn] = list[k][i];
                            list[k][i] = currentMin;
                    }


        }
      }
      
      
  }
  
  
  public static String[] mode(int[][] arr)
  {
      String[] oneDArray = new String[1682];
        for(int i = 0; i < 1682; i ++)
        {
            oneDArray[i] = arr[i][0] + "," + arr[i][1];
            
        }
        return oneDArray;
    }
}
    


