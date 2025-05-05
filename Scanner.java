import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //这个nextLine是可以读取空格的 整行文本（读到行尾 \n） 空格会被保留
        //next() 单个“单词”（遇到分隔符立即停止）空格、Tab、换行都会截断
        //

        //在调用 nextInt() / nextDouble() 等后紧接 nextLine() 时，需要先消耗掉行尾残留的 \n，否则 nextLine() 会直接返回空串：

      //int n = sc.nextInt();
      sc.nextLine();        // 把换行符吸掉
      String str = sc.nextLine();


        System.out.println("Hello " + name);
        scanner.close();

    }
}
