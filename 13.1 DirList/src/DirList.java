// Visualizza i file nella cartella di lavoro eventualmente filtrandoli

import java.io.*;
import java.util.*;	

public class DirList {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list; 
		if(args.length == 0)
		list = path.list();
		else
		list = path.list(new DirFilter(args[0]));
		for(int i = 0; i < list.length; i++)
		System.out.println(list[i]);
	}
}

class DirFilter implements FilenameFilter {
	String afn;
	
	DirFilter(String afn) {		this.afn = afn; }	//costruttore
	public boolean accept(File dir, String name) {		
		String f = new File(name).getName();		// Strip path information: (indipendente dalla piattaforma)
		return f.indexOf(afn) != -1;
	}
}

