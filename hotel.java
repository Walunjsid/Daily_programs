import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		int choise,ch1;
		int total=0;
		char ans;
		String item_ord="";
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1:Main course\n2:Desert\n3:Drink");
			choise=sc.nextInt();
			switch(choise) {
			case 1:
				System.out.println("Main course");
				System.out.println("1:Item1        40Rs");
				System.out.println("2:Item2        50Rs");
				System.out.println("3:Item3        60Rs");
				System.out.println("4:Item4        70Rs");
				ch1=sc.nextInt();
				switch(ch1) {
				case 1:
					total=total+40;
					item_ord+="Item 1";
					break;
				case 2:
					total=total+50;
					item_ord+="Item 2";
					break;
				case 3:
					total=total+60;
					item_ord+="Item 3";
					break;
				case 4:
					total=total+70;
					item_ord+="Item 4";
					break;
				}
				break;
			case 2:
				System.out.println("Desert");
				System.out.println("1:Item1        40Rs");
				System.out.println("2:Item2        50Rs");
				System.out.println("3:Item3        60Rs");
				System.out.println("4:Item4        70Rs");
				ch1=sc.nextInt();
				switch(ch1) {
				case 1:
					total=total+40;
					item_ord+="Item 1";
					break;
				case 2:
					total=total+50;
					item_ord+="Item 2";
					break;
				case 3:
					total=total+60;
					item_ord+="Item 3";
					break;
				case 4:
					total=total+70;
					item_ord+="Item 4";
					break;
				}
				break;
			case 3:
				System.out.println("Drink");
				System.out.println("1:Item1        40Rs");
				System.out.println("2:Item2        50Rs");
				System.out.println("3:Item3        60Rs");
				System.out.println("4:Item4        70Rs");
				ch1=sc.nextInt();
				switch(ch1) {
				case 1:
					total=total+40;
					item_ord+="Item 1";
					break;
				case 2:
					total=total+50;
					item_ord+="Item 2";
					break;
				case 3:
					total=total+60;
					item_ord+="Item 3";
					break;
				case 4:
					total=total+70;
					item_ord+="Item 4";
					break;
				}
				break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			System.out.println("Do you want to add other item Y/N");
			ans=sc.next().charAt(0);
		}
		while(ans=='y' ||ans=='Y');
			System.out.println("Thank you\nvisit again:");
			System.out.println("Bill");
			System.out.println("the order item are:"+item_ord);
			System.out.println("Total amount="+total);
		}
			
	}
