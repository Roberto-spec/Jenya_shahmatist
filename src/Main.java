public class Main {
    public static void main(String args[])
    {
        //Класс тестирования программы
        Interface inter=new Interface();
        Method_1 method_1=new Method_1(inter.ask_razmer());
        inter.show_pole(method_1);
    }
}
