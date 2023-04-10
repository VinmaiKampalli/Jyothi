import java.util.Scanner;

public class Search_Test {
public static void main (String []args) {
	Search search = new Search();
	int arr [] = {21,18,18,5,10};
	int temp;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Element: ");
	temp = scan.nextInt();
	//search.linearSearch(arr,temp);
	search.duplicateOfElements(arr,temp);
    }
}