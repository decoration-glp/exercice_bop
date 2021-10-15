public class Parfait {
	
public static void main(String args[]) {
	
	String x = args[1]; 
	
	int i;
	
	i = Integer.parseInt(x); //conversion du type string en int 
	
	
	if(i%1==0 || i%2==0 ||i%3 == 0){
	
	
	System.out.println("le nombre est parfait"+i);
	
	else{
	
	System.out.println("le nombre n'est parfait"+i);
	
	System.out.println(i);
		} 
	}
	
}

} 

