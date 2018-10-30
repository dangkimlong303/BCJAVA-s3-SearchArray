import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] student = {"Long","Chinh","Dat","Khoi","Phuong","Ngoc"};
        System.out.print("Enter a name's student: ");
        String name = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i< student.length; i++){
            if (student[i].equalsIgnoreCase(name)){
                System.out.println("Position of the students in the list " + name + " is: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found" + name + " in the list.");
        }


    }
}
