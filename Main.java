 class Calc{
   int num1,num2,result;
   public void process(){
     result = num1 + num2;
   }
 }

class Main {
  public static void main(String[] args) {
    Calc obj = new Calc();
    obj.num1 =6;
    obj.num2 = 7;
    obj.process();
    System.out.println(obj.result);
    }
}