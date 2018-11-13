import javax.swing.JOptionPane;
class main{
	public static void main(String[] args) {

		int kilometros = 0;
		int litros=0;

	kilometros = Integer.parseInt( JOptionPane.showInputDialog("kilometros recorridos:"));
     
        litros = Integer.parseInt( JOptionPane.showInputDialog("litros usados:"));
        double kilometroslitros =kilometros/litros;
        kilometroslitros = Integer.parseInt( JOptionPane.showInputDialog("kilometros recorridos:"));
        kilometros = Integer.parseInt( JOptionPane.showInputDialog("kilometros recorridos:"));
        
        System.out.println(" "+kilometroslitros);
        System.out.println("    litros por kilometros ");


        
       
      
        
                     
		}




	}
