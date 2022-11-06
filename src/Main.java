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

        //Задача 4
        System.out.println("Задача 4");
        int age4 = 20;
        if (age4 >= 18) {
            System.out.println("Поздравлем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        int age5 = 15;
        if (age5 >= 18) {
            System.out.println("Поздравлем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        //Задача 5
        System.out.println("Задача 5");
        int age6 = 24;
        if (age6 >= 7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Ребенок пока не ходит в школу");
        }
        int age7 = 24;
        if (age7 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек не закончил школу и не может отправляться в университет");
        }

        int age8 = 24;
        if (age8 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек не окончил университет и ему еще рано искать первую работу");
        }

        //Задача 6
        System.out.println("Задача 6");
        int currentSits1 = 60;
        int allSits1 = 102;
        int sittingSits1 = 60;

        if (currentSits1 < sittingSits1){
            System.out.println("Есть сидячие места");
        }else {
            if(currentSits1 >= allSits1){
                System.out.println("Мест нет");
            }else {
                System.out.println("Есть стоячие места");
            }
        }
        //Задача 7
        System.out.println("Задача 7");
        int age9 = 18;
        if (age9 >= 2 && age9 <= 5) {
            System.out.println("Если возраст человека равен " + age9 + " то ему нужно ходить в детский сад;");
        }
        if (age9 >= 7 && age9 <= 18) {
            System.out.println("Если возраст человека равен " + age9 + " то ему нужно ходить в школу");
        }
        if (age9 > 18 && age9 <= 24) {
            System.out.println("Если возраст человека равен " + age9 + " то его место в университете");
        }
        if (age9 > 24) {
            System.out.println("Если возраст человека равен " + age9 + " то его место в университете");
        }

        //Задача 8
        System.out.println("Задача 8");
        int age10 = 50;
        boolean x = age10 < 5;
        if (x) {
            System.out.println("Ребенок не может кататься на аттракционе");
        }
        boolean y = age10 >= 5 && age10 < 14;
        if (y) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        }
        boolean z = age10 >= 14;
        if (z) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }


        //Задача 9
        System.out.println("Задача 9");
        int one = 1;
        int two = 2;
        int three =3;

        if (one > two && one > three){
            System.out.println("One");
        }
        if (two > one && two > three) {
            System.out.println("Two");
        }
        if(three > one && three > two){
            System.out.println("Three");
        }

    }
}

