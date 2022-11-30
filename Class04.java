import java.io.*;
public class Class04 {
    public static void main(String[] args) throws IOException {
        char data[]=new char[120];
        FileReader fr =new FileReader("C:\\Users\\skes9\\Desktop\\donkey.txt");
        int num=fr.read(data) ;
        String str = new String(data,0,num);

        System.out.println(str);
        System.out.println("輸出字數:"+num);
    }
}
