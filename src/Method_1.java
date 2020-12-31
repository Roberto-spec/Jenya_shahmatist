public class Method_1 {
    private char[][] pole;
    //Конструктор класса
    Method_1(int lengh){
        pole=new char[lengh][lengh];
        pole=zapolnenie(lengh);
    }
    //создание списка черно белых квадратов игрового поля
    private char[] list_kvadratov(int lengh){
        char[] l=new char[(lengh*lengh)-lengh-lengh-lengh+2];
        for(int i=0;i<l.length;i++){
            l[i]='⬛';
            i++;
            l[i]='⬜';
        }

        return l;
    }
    //заполнение игрового поля
    private char[][] zapolnenie(int lengh){
        char[][] z=new char[lengh][lengh];
        z=zapolnenie_kvadratami(lengh);
        z=zapolnenie_bukvami(lengh,z);
        z=zapolnenie_ciframi(lengh,z);
        z=zapolnenie_probelami(lengh,z);
        return z;
    }
    //вставка списка черно-белых квадратов
    private char[][] zapolnenie_kvadratami( int lengh){
        int index=0;
        char[] list=list_kvadratov(lengh);
        char[][] z=new char[lengh][lengh];
        for(int i=1;i<lengh-1;i++){
            for(int y=0;y<lengh-1;y++){
                z[i][y]=list[index];
                index++;
            }
        }
        return z;
    }
    //заполнение латинскими буквами верхнюю и нижнюю строку игрового поля
    private char[][] zapolnenie_bukvami(int lengh, char[][] pole){
        char b='A';
        for(int i=1;i<lengh-1;i++){
            pole[0][i]=b;
            pole[lengh-1][i]=b;
            b++;
        }
        return pole;
    }
    //заполнение цифрами первый и последний столбец игрового поля
    private char[][] zapolnenie_ciframi(int lengh, char[][] pole){
        char b='1';
        for(int i=1;i<lengh-1;i++){
            pole[i][0]=b;
            pole[i][lengh-1]=b;
            b++;
        }
        return pole;
    }
    private char[][] zapolnenie_probelami(int lengh, char[][] pole){
        char b=' ';
        pole[0][0]=b;
        pole[0][lengh-1]=b;
        pole[lengh-1][0]=b;
        pole[lengh-1][lengh-1]=b;
        return pole;
    }

    public char[][] getPole() {
        return pole;
    }
}
