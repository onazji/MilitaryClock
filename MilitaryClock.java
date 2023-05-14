//Onazji Drayden
//App asks for laymen clock time and converts to military clock format.
import java.util.Scanner;

public class MilitaryClock {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Military Clock Translator!");
        System.out.println("Please enter any time in the given format: HR:MN:SD(AM/PM)");
        System.out.println("Refer to the example: 07:05:45PM");
        String s = scan.nextLine();
        System.out.println("Your input: "+s);
        char[]arr=s.toCharArray();
        String time="";
        //AM
        if(s.charAt(s.length()-2)=='A'){
            if(arr[0]=='1' && arr[1]=='2'){
                time+="00";
            }else{
                time+=arr[0];
                time+=arr[1];
            }
            for(int x=2;x<arr.length-2;x++){
                time+=arr[x];
            }
            //AM
        }else{
            if(arr[0]=='1' && arr[1]=='2'){
                time+=arr[0];
                time+=arr[1];
            }else{
                time+=arr[0];
                time+=arr[1];
                int tmp=Integer.parseInt(time)+12;
                time=String.valueOf(tmp);
            }
            for(int x=2;x<arr.length-2;x++){
                time+=arr[x];
            }
        }
        System.out.println("Your output: "+time);
        System.out.println("Your clock has been converted. -Terminated Application");
    }
}

