import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class MakeDir{

  public MakeDir(){
	}

  public void makeDir(String filename){
    File newfile = new File(filename);
    if (newfile.mkdir()){
      System.out.println("ディレクトリの作成に成功しました");
    }else{
      System.out.println("ディレクトリの作成に失敗しました");
    }
  }
}
