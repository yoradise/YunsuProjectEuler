package Problem_1;

class Main {
	  public static void main(String[] args) {
	    int sub;
	    int num2 = 1;
	    int sum = 2;

	    for(int num = 2; num < 4000000;){
	      sub = num2;
	      num2 = num;
	      num += sub;

	      if(num %2 ==0){
	        sum +=num;
	      }
	    }
	    
	    System.out.print(sum);
	  }
	}
