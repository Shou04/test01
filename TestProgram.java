import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;


public class TestProgram{
    public static void main(String args[]){
        //2つの変数「x」と「y」を宣言
        int    x = 7;
        int    y = 3;
        String z = null;
        String time = null;
        String filename = null;
        String dirname  = null;
        MakeDir makeD = new MakeDir();
        ZonedDateTime zd = ZonedDateTime.now();

        dirname  = "c:/jenkins_plugin_workspase/Data/" + args[0];
        filename = dirname+ "/" + args[1] + ".txt";

        makeD.makeDir(dirname); //新しいディレクトリを作成

        while(true){
          x = 1;
          y = 2;
        }

        // try{
        //   File file = new File(filename);
        //   try{
        //       file.createNewFile();
        //   }catch(IOException e){
        //       System.out.println(e);
        //   }
        //
        //   if (checkBeforeWritefile(file)){
        //     FileWriter filewriter = new FileWriter(file, true);
        //
        //     z    = String.valueOf(args[2])+"\n";
        //     time = String.valueOf(zd)+"\n";
        //
        //     filewriter.write(time);
        //     filewriter.write(z);
        //
        //     filewriter.close();
        //   }else{
        //     System.out.println("ファイルに書き込めません");
        //   }
        // }catch(IOException e){
        //   System.out.println(e);
        // }

    }

    private static boolean checkBeforeWritefile(File file){
      if (file.exists()){
        if (file.isFile() && file.canWrite()){ return true; }
      }
      return false;
    }
}
