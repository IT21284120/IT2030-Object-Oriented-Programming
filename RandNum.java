
	public class RandNum
	
	{
		
	    // Finding the Maximum value of Array
	    public int maximum(int No[][]) 
		
		{
	        int MaxNo= No[0][0];

	        for (int i = 0; i < No.length; i++)
			
			{
	            for (int j = 0; j < No.length; j++)
				
				{
	                if (MaxNo < No[i][j])
					
					{
	                    MaxNo = No[i][j];
	              
					}
	            
				} 
			

	        }

	        return MaxNo;

	    }

	    //Finding  the Minimum Value of Array

	    public int minimum(int No[][])
		
		{
	        int MinNo = No[0][0];

	        for (int i = 0; i < No.length; i++) 
			
			{
	            for (int b = 0; b < No.length; b++) 
				
				{
	                if (MinNo > No[i][b]) 
					
					{

	                    MinNo = No[i][b];
	               
					}
	            
				}

	       
			}

	        return MinNo;

	    }

	    public double displayAvg(int number[][])
		
		{
	        int count = 0;
	        double Total = 0;

	        for (int c = 0; c < number.length; c++) 
			
			{
	            for (int b = 0; b < number.length; b++) 
				
				{

	                Total +=  number[c][b];
	                count++;
	            
				}
	        
			}

	        double avg = Total / count;
	        return avg;

	    }
	
	
	}

