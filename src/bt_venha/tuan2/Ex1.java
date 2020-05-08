package tuan2;
import javax.swing.JOptionPane;
public class Ex1 {
	public static void main(String[] args) {
		// Enter height of triangle
		int h;
		String s;
		do {
			s = JOptionPane.showInputDialog(null, "Nhap vao chieu cao h: ");
			try {
		        Integer.parseInt(s);
		        h = Integer.parseInt(s); 
		    }
		    catch( Exception e ) {
		        h = 0;
		    }
		} while((h<2) || (h>10));
		
		// Create triangle
		String output = "";
		int i, j;
		for(i=1; i<=h; i++) {
			for(j=0; j<= h-i; j++)
				output += " ";
			for(j=1; j<= 2*i-1; j++) 
				output += "*";
			output += "\n";
		}
		
		// Show result
		System.out.println(output);
	}

}
