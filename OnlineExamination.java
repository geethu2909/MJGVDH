import java.io.*;
import java.lang.*;
import java.util.*;
public class OnlineExamination {
  private String Username;
  private String password;
  private boolean isLogin;
  private int time;
  private int questions;
  private int[] answer;
  private int[] correctanswer;
  public OnlineExamination(String Username,String password){
    this.Username=Username;
    this.password=password;
    System.out.println("registered successfully.");
    this.isLogin=false;
    this.time=20;  //time in minutes.
    this.questions=5;
    this.answer=new int[questions];
    this.correctanswer=new int[questions];
    for(int i=0;i<questions;i++){
      correctanswer[i]=(int) Math.random();
    }
  }
  public void login(){
    Scanner sc=new Scanner(System.in);
    System.out.println("\t LOGIN\t");
    System.out.println("Username: ");
    String User_name=sc.nextLine();
    System.out.println("Password: ");
    String pin=sc.nextLine();
    if(User_name.equals(Username) && pin.equals(password)){
      isLogin=true;
      System.out.println("login successful");

    }
    else System.out.println("login failed");
  }
  public void logout(){
    isLogin=false;
   System.out.println("logout successful");
  }
  public void examStart(){
    if(isLogin){
      System.out.println("Please login");

    }
    System.out.println("time left:"+time);
    Scanner sc1=new Scanner(System.in);
    for(int i=0;i<questions;i++){
      System.out.println("question "+(i+1)+":");
      System.out.println("1.option 1");
      System.out.println("2.option 2");
      System.out.println("your answer: ");
      int ans=sc1.nextInt();
      answer[i]=ans;
    }
    System.out.println("do u want to submit\n 1.yes \n 2.no");
    int n=sc1.nextInt();
    if(n==1) submit();
    else{
      try{
        Thread.sleep(time*10*1000);
      }
      catch(InterruptedException e){
        e.printStackTrace();
        submit();
      }
    }
  }
  private void submit(){
    if(isLogin){
      System.out.println("login first");


    }
    int score=0;
    for(int i=0;i<questions;i++){
      if(answer[i]==correctanswer[i]) score++;

    }
    System.out.println("your score : "+score);
    System.out.println("out of :"+questions);
    logout();
  }
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter username:");
    String User_name=scan.nextLine();
    System.out.println("enter password:");
    String pin=scan.nextLine();
    OnlineExamination online=new OnlineExamination(User_name,pin);
    online.login();
  online.examStart();
  }
}
