//    Задание 3
//    Создайте класс «Страна». Необходимо хранить в полях
//    класса: название страны, название континента, количество жителей в стране, телефонный код страны, название
//    столицы, название городов страны. Реализуйте методы
//    класса для ввода данных, вывода данных, реализуйте
//    доступ к отдельным полям через методы класса

import java.util.Arrays;

public class Zd3 {
   protected String Name;
    protected String Kontinent;
    protected float saiz_pipl;
    protected int Cod_Stran;
    protected String Name_Stolica;
    protected String [] Name_Goroda;

    public  Zd3()
    {
      this. Name_Goroda=new String[1];

    }

    public String[] getName_Goroda() {

        return Name_Goroda;
    }

    public void setName_Goroda(String[] name_Goroda) {

        Name_Goroda=new String[name_Goroda.length];
        for ( int i = 0 ; i < Name_Goroda .length; i ++ ) {

            this.Name_Goroda[i] = name_Goroda[i];
        }

    }

    public String getName_Stolica() {
        return Name_Stolica;
    }

    public void setName_Stolica(String name_Stolica) {
        Name_Stolica = name_Stolica;
    }



    public int getCod_Stran() {
        return Cod_Stran;
    }

    public void setCod_Stran(int cod_Stran) {
        Cod_Stran = cod_Stran;
    }



    public float getSaiz_pipl() {
        return saiz_pipl;
    }

    public void setSaiz_pipl(float saiz_pipl) {
        this.saiz_pipl = saiz_pipl;
    }


    public String getKontinent() {
        return Kontinent;
    }

    public void setKontinent(String kontinent) {
        Kontinent = kontinent;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "Zd3{" +
                "Name='" + Name + '\'' +
                ", Kontinent='" + Kontinent + '\'' +
                ", saiz_pipl=" + saiz_pipl +
                ", Cod_Stran=" + Cod_Stran +
                ", Name_Stolica='" + Name_Stolica + '\'' +
                ", Name_Goroda=" + Arrays.toString(Name_Goroda) +
                '}';
    }
}
