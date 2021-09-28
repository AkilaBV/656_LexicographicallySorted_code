package _LexicographicallySorted_package._LexicographicallySorted;

import java.util.Arrays;

import org.testng.annotations.Test;

public class LexicographicallySorted {
	int count=0;
	
	public int countNonLexicograhicallySorted(String[]input,int num) {
		char temp[]=new char[input.length];
		
		for(int i=0;i<num;i++ ) {
			for(int j=0,k=0;j<input.length && k<input.length;j++,k++) {
				temp[k]=input[j].charAt(i);
				System.out.print(temp[k]);
			}
			
		
			String temp2=String.valueOf(temp);
			//System.out.println("temp2" + temp2);
			Arrays.sort(temp);
			String sorted=String.valueOf(temp);
		//	System.out.println("sorted : " +sorted );
			if(sorted.equals(temp2) ){
				count=count+1;
			}
			System.out.println();
		}
		return  count;
		
	}

	
	@Test
	public void testcase1() {
		String [] in={"abc","def","ecg"};
		/*
		for(int i=0;i<in.length;i++) {
			System.out.println(in[i]);
		}
		*/
		int n=3;
		 int c= countNonLexicograhicallySorted(in,n);
		 System.out.println("number of columns are not lexicologicolly sorted are : "+ c);
	}
	
	
	@Test
	public void testcase2() {
		String [] in={"abcd","defb","ecgz"};
		/*
		for(int i=0;i<in.length;i++) {
			System.out.println(in[i]);
		}
		*/
		int n=4;
		 int c= countNonLexicograhicallySorted(in,n);
		 System.out.println("number of columns are not lexicologicolly sorted are : "+ c);
	}
	
	@Test
	public void testcase3() {
		String [] in={"ab","de","ec"};
		/*
		for(int i=0;i<in.length;i++) {
			System.out.println(in[i]);
		}
		*/
		int n=2;
		 int c= countNonLexicograhicallySorted(in,n);
		 System.out.println("number of columns are not lexicologicolly sorted are : "+ c);
	}
}
