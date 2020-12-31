import java.util.Scanner;

public class Interface {
    //Я реализовал возможность добавление любого четного размера игрового поля, на которого хватает букв
    public int ask_razmer(){
        int lengh=0;
        do{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Введите размер игрового поля:");
            System.out.print(">_");
            lengh=scanner.nextInt();
        }while (lengh<=0&&((lengh%2)!=0)&&lengh>26);
        return lengh+2;
    }
    //МЕТОД вывода игрового поля
    public void show_pole(Method_1 method_1){
        char[][] m= method_1.getPole();
        for (int i=0;i<m.length;i++){
            for (int y=0;y<m.length;y++){
                System.out.print(m[i][y]+" ");
            }
            System.out.print("\n");
        }
    }
}
