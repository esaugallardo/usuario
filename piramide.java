import javax.swing.JOptionPane;
class piramide{
	 public static void main(String[] args){

		 int dato1= 1;
		 int dato2= 0;
		 int dato3= 0;
		 int dato4= 0;
		 int dato5= 0;
		 int dato6= 0;
		 int dato7= 0;
		int nivel = 7;


		for(int i=1;i<=nivel;i++){
			for (int espacios=1; espacios<=(nivel-i); espacios++) {
				System.out.print(" ");
			}

			  System.out.print(dato1);
			  System.out.print("  ");
			  if(i>1){
			  System.out.print(dato1+dato2);
			  }
			  System.out.print("  ");
			  if ((dato2+dato3)>0) {
			  	System.out.print(dato2+dato3);
			  	System.out.print("  ");
			  }
			  if ((dato3+dato4)>0) {
			  	System.out.print(dato3+dato4);
			  	System.out.print("  ");
			  }
			  if ((dato4+dato5)>0) {
			  	System.out.print(dato4+dato5);
			  	System.out.print("  ");
			  }
			  if ((dato5+dato6)>0) {
			  	System.out.print(dato5+dato6);
			  	System.out.print("  ");
			  }
			  if ((dato6+dato7)>0) {
			  	System.out.print(dato6+dato7);
			  	dato7=dato6+dato7;
			  }
			  dato6=dato5+dato6;
			  dato5=dato4+dato5;
			  dato4=dato3+dato4;
			  dato3=dato2+dato3;
			  if(i>1){
				  dato2=dato1+dato2;
			  }else{
				  dato2=dato2;
			  }

			  System.out.print("\n");

		}
	}
}
