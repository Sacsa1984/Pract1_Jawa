public class Zad2 {
//    Задание 2
//    Создайте класс «Город». Необходимо хранить в полях класса: название города, название региона, название
//    страны, количество жителей в городе, почтовый индекс
//    города, телефонный код города. Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ
//    к отдельным полям через методы класса
   protected String Name;
    protected String Region;
    protected    String Strana_Name;
    protected double Saiz_Piopl;    //задаёться в тисячях

    public double getSaiz_Piopl() {
        return Saiz_Piopl;
    }

    public void setSaiz_Piopl(double saiz_Piopl) {
        Saiz_Piopl = saiz_Piopl;
    }


    protected   int Index;
    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }



    public String getStrana_Name() {
        return Strana_Name;
    }

    public void setStrana_Name(String strana_Name) {
        Strana_Name = strana_Name;
    }




    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "Zad2{" +
                "Name='" + Name + '\'' +
                ", Region='" + Region + '\'' +
                ", Strana_Name='" + Strana_Name + '\'' +
                ", Saiz_Piopl=" + Saiz_Piopl +
                ", Index=" + Index +
                '}';
    }
}
