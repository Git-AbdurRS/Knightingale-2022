package day2;
//Uneven multi-dimentional array
public class ArrayDemo3 {
    public static void main(String[] args) {
    	int ue[][]=new int[4][];
    	
    	ue[0]=new int[4];//row zero is assigned four columns
    	ue[1]=new int[1];//row one is assigned one columns
    	ue[2]=new int[7];//row two is assigned seven columns
    	ue[3]=new int[3];//row three is assigned three columns
    	
    	System.out.println(ue.length);//give number of rows
    	
    	System.out.println(ue[0].length);// gives number of columns in first row
    	System.out.println(ue[1].length);// gives number of columns in second row
    	System.out.println(ue[2].length);// gives number of columns in third row
    	System.out.println(ue[3].length);// gives number of columns in fourth row
    	
		ue[1][0]=909091;
		System.out.println(ue[1][0]);

	}

}
