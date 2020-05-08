package quan_ly_lop_hoc;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teacher {
	private String name;
	private int age;
	private Student sv;
	public void setSv(Student sv) {
		this.sv = sv;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Teacher(String name, int age, Student sv) {
		this.setName(name);
		this.setAge(age);
		this.setSv(sv);
	}
		
	public static void modify1(Student sv1, Student sv2) {
		sv1 = sv2;
	}
	public void modify2(Student sv2) {
		this.sv = sv2;
	}
	
	public static String result (int size) {
//		Student sv1 = new Student("Sv 1", 20);
//		Student sv2 = new Student("Sv 2", 20);
//		Teacher gv1 = new Teacher("", 0, sv1);
//		
//		//modify1(gv1.sv, sv2);
//		gv1.modify2(sv2);
//		
//		System.out.println("Sv ung voi gv1: " + gv1.sv.getName());
		String result = "";
		String s = JOptionPane.showInputDialog("Nhập vào kích thước: ");
		size=0;
		try {
			size = Integer.parseInt(s);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Nhập sai dữ liệu");
		}
			 
		int i,j,k;
		for(i=1; i <= 2*size+1; i++) {
			if((i==1) || (i==2*size+1)) {
				result += "+";
				for(j=1; j <= 2*size; j++)
					result += "-";
				result += "+\n";
			} else if(i == size+1) {
				result += "|<";
				if(size%2 == 0)
					for(j=1; j <= 2*size-2; j++)
						result += "-";
				else
					for(j=1; j <= 2*size-2; j++)
						result += "=";
				result += ">|\n";
			} else {
				if(i<=size)
					k=i;
				else 
					k = 2*size+2-i;
				
				result += "|";
				for(j=1; j <= size-k+1; j++) 
					result += " ";
				if(k==i)
					result += "/";
				else
					result += "\\";
				if(k%2 == 1) {
					for(j=1; j <= 2*(k-2); j++)
						result += "-";
				} else
					for(j=1; j <= 2*(k-2); j++)
						result += "=";
				if(k==i)
					result += "\\";
				else
					result += "/";
				for(j=1; j <= size-k+1; j++)
					result += " ";
				result += "|\n";
			}
		}
		System.out.println(result);
		return result;				
	}
}
