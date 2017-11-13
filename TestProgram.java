import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class TestProgram{
    public static void main(String args[]){
        //2つの変数「x」と「y」を宣言
        int    x = 7;
        int    y = 3;
        String z = null;
        String filename = null;

        z        = String.valueOf(x+y)+"\n";
        //filename = "c:/jenkins_plugin_workspase/test/"+args[0]+".txt";
        //filename = "c:/jenkins_plugin_workspase/test/data_test.txt";
        filename = "https://github.com/Shou04/test01.git/data_test.txt";
        try{
          File file = new File(filename);
          try{
              file.createNewFile();
          }catch(IOException e){
              System.out.println(e);
          }

          if (checkBeforeWritefile(file)){
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(z);
            filewriter.write(z);
            filewriter.close();
          }else{
            System.out.println("ファイルに書き込めません");
          }
        }catch(IOException e){
          System.out.println(e);
        }
    }

    private static boolean checkBeforeWritefile(File file){
      if (file.exists()){
        if (file.isFile() && file.canWrite()){ return true; }
      }
      return false;
    }

}
