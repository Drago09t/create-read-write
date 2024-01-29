import java.io.;
import java.util.;

public class Lab2{
    public static void main(String [] args)throws IOException{

        File myFile = new File("d:/hello.txt");

        boolean flag = myFile.exists();

    if(flag == true){
        System.out.println("file is already created");
    }
    else{
        myFile.createNewFile();
        System.out.println("new file is created");
    }
    //writing into file
    PrintWriter pw = new PrintWriter(myFile);
    pw.println("hello");
    pw.println("I am student of stmu");
    pw.close();

    //reading into file
    Scanner scan = new Scanner(myFile);
    while(scan.hasNext())
    {
        String str = scan.nextLine();
        System.out.println(str);
    }
 
    }
