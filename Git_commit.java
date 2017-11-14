// import org.eclipse.jgit.*;
//
// class GitCommit{
//
//   public GitCommit(){
//   }
//
//   public void commitToGit(){
//     try{
//       Repository localRepo = new FileRepository( "c:/jenkins_plugin_workspase/Data/.git" );
//       Git git = new Git( localRepo );
//       if( git != null ){
//         //. git commit
//         CommitCommand cc = git.commit();
//         //. コミッターの名前とメールアドレス、コミットメッセージを指定
//         cc.setCommitter( "WatanabeShou", "hoshihsou" ).setMessage( "This is a Test." );
//         try{
//           cc.call();
//         }catch( NoHeadException e ){
//           e.printStackTrace();
//         }catch( NoMessageException e ){
//           e.printStackTrace();
//         }catch( ConcurrentRefUpdateException e ){
//           e.printStackTrace();
//         }catch( WrongRepositoryStateException e ){
//           e.printStackTrace();
//         }
//       }
//     }catch( Exception e ){
//       e.printStackTrace();
//     }
//   }
// }
