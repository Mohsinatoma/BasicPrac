package basicPrac.basicPrac;

public class MaxMultiplication {
	
	public static int[] maxMulti(int[] a) {
		int max=0;
		int[] aa = {0, 0, 0, 0, 0, 0, 0, 0}; 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]>a[i]) {
					max=a[j];
					a[j]=a[i];
					a[i]=max;
				}
			}
		}
		
		return a;
		
		
	}
	
	public static int[] frequency(String s,int[] a) {
		
		int h=0;
		
		  int[] ar = {0,0,0,0,0,0,0,0,0};

		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(a[j]==0 && s.charAt(j)== s.charAt(i)) {
				 a[j]=-1;
				 count++;	
				}
				
			}
			ar[h++]=count;
	      
	       
			}
		
		return ar;
		
	}
	

	public static int[] bubblesort(int[] a) {
		int max=0,count=0;
		
		while(true) {
		for(int i=0;i<a.length-1;i++) {
			 count=0;
			if(a[i]>a[i+1]) {
				max=a[i];
				a[i]=a[i+1];
				a[i+1]=max;
			}
		}
		if(count==0) break;
		}
		
		return a;
		
		
	}
	

	public static void main(String[] args) 
    { 
     
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
       
        int[] arr1=   maxMulti(arr);
       int mul=arr1[6]*arr1[7];
       System.out.println(mul);
       String s="adrrkdddk";
       
       int[] a = {0,0,0,0,0,0,0,0,0};
	
       int aa[]=frequency(s,a) ;
       
       for(int k=0;k<aa.length;k++) {
    	   if(aa[k]!=0) {
    		   System.out.println(aa[k]); 
    	   }
       }
       
       int[] ab=   bubblesort(arr);
       for(int k=0;k<ab.length;k++) {
    	  
    		   System.out.print(" "+ab[k]); 
    	   
       }
    } 
}
