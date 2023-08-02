package programms;

public class QN_49_FindingStringInStringArray {

	public static void main(String[] args) {

		String[] str = {"Donna","Rachel","Rakesh","Scott","Jenny"};
		String find = "Rachel";
		for(String st : str) {
			if(st.equals(find)){
				System.out.println("Name found "+ st);
			}
		}
	}
	
}
