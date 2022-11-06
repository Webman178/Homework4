public class Main {
    public static void main(String[] args) {
        //Задание 4
        //Задача 1
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравлем с совершеннолетием");
            {

                int age2 = 16;
                if (age2 < 18) {
                    System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
                }

                //Задание 2
                System.out.println("Задача 2");
                int age3 = 24;
                if (age3 >= 7) {
                    System.out.println("Ребенок ходит в школу");

                    if (age3 >= 18) {
                        System.out.println("Человек уже закончил школу и может отправляться в университет");

                        if (age3 >= 24) {
                            System.out.println("Человек окончил университет и ему пора искать первую работу");
                        }
                    }
                }

            }
        }
        //Задача 3
        System.out.println("Задача 3");
        int currentSits = 100;
        int allSits = 102;
        int sittingSits = 60;
        if (currentSits < sittingSits) {
            System.out.println("Есть сидячие места");
        }
        if (currentSits > sittingSits ) {
            if (currentSits > allSits) {
                System.out.println("Вагон уже полностью забит");
            }
            if (currentSits < allSits) {
                System.out.println("Есть стоячие места");
            }
        }


    }
}

