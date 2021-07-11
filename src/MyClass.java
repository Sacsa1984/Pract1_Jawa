import java.util.Scanner;

public class MyClass {
    @Override
    public String toString() {
        return "MyClass{}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Вібор задания 1-4");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1: {
                    Zad1 zd1 = new Zad1();
                    zd1.setName("Александр");
                    zd1.setFamali("Высоцкий");
                    zd1.setOchestwo("Николаевич");
                    zd1.setPhone("09773215");
                    zd1.Siti = "Кривой рог";
                    zd1.setAdres("Ивана ивраменка д 8 кв 75");

                    System.out.println(zd1.getName());
                    System.out.println(zd1.getFamali());
                    System.out.println(zd1.getOchestwo());
                    System.out.println(zd1.getPhone());
                    System.out.println(zd1.getSiti());
                    System.out.println(zd1.getAdres());
                    break;
                }
                case 2: {
                    Zad2 zd2 = new Zad2();
                    zd2.setStrana_Name("Украина");
                    zd2.setName("Кривой Рог");
                    zd2.setRegion("непропетровская");
                    zd2.setSaiz_Piopl(12.2);
                    zd2.setIndex(2979);
                    System.out.println(zd2.toString());
                    break;
                }
                case 3: {
                    String[] Goro = new String[]{"Кривой Рог", "Апостолово"};

                    Zd3 zd3 = new Zd3();
                    zd3.setKontinent("Евразия");
                    zd3.setName("Украина");
                    zd3.setName_Stolica("Киев");
                    zd3.setCod_Stran(067);

                    zd3.setName_Goroda(Goro);
                    System.out.println(zd3.toString());
                    break;

                }
                case 4: {
                    Zd4 zd4 = new Zd4();
                    zd4.Wod_Dan();
                    String znac = "";

                    while (true) {
                        System.out.println("Для вычисления наберите \" + - * : \" завершение роботы \" $\"");
                        znac = scanner.next();
                        switch (znac) {
                            case "+": {
                                zd4.Znamenatel(zd4.getX(), zd4.getY());
                                zd4.Slojenie();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case "-": {
                                zd4.Znamenatel(zd4.getX(), zd4.getY());
                                zd4.Subtraction();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case "*": {
                                zd4.Umnojenie();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case ":": {
                                zd4.Delenie();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case "$": {
                                System.exit(1);

                            }
                            default: {
                                System.out.println("не коректные данные");
                                break;


                            }
                        }
                    }
                }
                case 0: {
                    System.exit(1);
                }
                default: {
                    System.out.println("не коректные данные");
                }
            }
        }
    }




}
