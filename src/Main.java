public class Main {
    public static void main(String[] args) {

        int age = 17;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " то он совершеннолетний");
        } else  {
            System.out.println( " Если возраст человека равен " + age + " то он не достиг совершеннолетия");
        }

        int temperature = 8;
        if (temperature < 5) {
            System.out.println(" На улице " + temperature + " градуса, нужно надеть шапку ");
        } else  {
            System.out.println( " На улице " + temperature + " градусов, можно идти без шапки");
        }

        int speed = 100;
        if (speed > 60) {
            System.out.println( " Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println( " Если скорость " + speed + " то можно ездить спокойно");
        }

        int age1 = 24;
        if (age1 <= 2) {
            System.out.println( " Если возраст человека равен " + age1 + " то ему пора спать");
        }
        else if (age1 > 2 && age1 <= 6) {
            System.out.println( " Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        }
        else if (age1 >= 7 && age1 < 18) {
            System.out.println( " Если возраст человека равен " + age1 + " то ему нужно ходить в школу ");
        }
        else if (age1 >= 18 && age1 < 24) {
            System.out.println( " Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        }
        else if (age1 >= 24 && age1 <= 60) {
            System.out.println( " Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        } else {
            System.out.println( " Если возраст человека равен " + age1 + " то он может отдохнуть");
        }

        int age2 = 14;
        if (age2 < 5) {
            System.out.println( " Если возраст ребенка равен " + age2 + ", то он не может кататься на аттракционе");
        } else if (age2 >= 5 && age2 <= 14) {
            System.out.println( " Если возраст ребенка равен " + age2 + ", то он может кататься на аттракционе в сопровождении взрослого. Если взрослого нет, кататься нельзя");
        } else if (age2 > 14){
            System.out.println( " Если возраст ребенка равен " + age2 + ", то он может кататься без сопровождения взрослого");
        }

        int place = 102;
        if ( place >= 102) {
            System.out.println( "Если в вагоне " + place + " человека, то мест больше нет" );
        } else if (place <60) {
            System.out.println( " Если в вагоне " + place + " человек, то есть сидячие места");
        } else if (place >=60 && place < 102) {
            System.out.println( " Если в вагоне " + place + " человек, то остались только стоячие места");
        }

        int one = 10;
        int two = 20;
        int three = 30;
        if (one > two)  {
            System.out.println( " Наибольшее число " + one );
        } else if  ( two > three) {
                System.out.println(" Наибольшее число " + two);
            } else {
            System.out.println( " Наибольшее число " + three);
        }

        }
    }
