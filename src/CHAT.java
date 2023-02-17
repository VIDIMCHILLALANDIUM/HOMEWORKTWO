import java.util.Scanner;

public class CHAT {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Привет! Как тебя зовут?");
        String name = input.nextLine();
        System.out.println("Приятно познакомится, "+ name );
        System.out.println("Сколько тебе годиков?)");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Ты учишься или работаешь?");
        String work = input.nextLine();
        System.out.println("На каком ты учишься курсе?");
        int course = input.nextInt();
        input.nextLine();
        System.out.println("Сколько лет тебе учится?");
        int years = input.nextInt();
        input.nextLine();
        System.out.println("У тебя есть стипендия?");
        String fellowship = input.nextLine();
        System.out.println("Какая сумма стипендии тебе приходит?");
        int amount = input.nextInt();
        input.nextLine();
        System.out.println("Какое у тебя хобби?");
        String hobby = input.nextLine();
        System.out.println("Кем ты хочешь стать?");
        String target = input.nextLine();
        System.out.println("Какую книгу читаешь на данный момент?");
        String book = input.nextLine();
        System.out.println("Часто ли ты путешествуешь?");
        String journey = input.nextLine();
        System.out.println("Куда ездил отдыхать в последний раз?");
        String recreation = input.nextLine();
        System.out.println("Сколько дней отдыхал?");
        int dayOff = input.nextInt();
        input.nextLine();
        System.out.println("Твое любимое животное?");
        String animal = input.nextLine();
        System.out.println("Есть ли у тебя дома животные?");
        String pet = input.nextLine();
        System.out.println("Твою любимый фильм?");
        String film = input.nextLine();
        System.out.println("Какую музыку слушаешь?");
        String Music = input.nextLine();
        System.out.println( Music + "мне тоже нравится)");
        System.out.println("Твой любимый исполнитель?");
        String performer  = input.nextLine();
        System.out.println("Какие иностранные языки знаешь?");
        String foreignLanguages = input.nextLine();
        System.out.println("Много ли у тебя друзей?");
        String friends = input.nextLine();
        System.out.println("Какое у тебя прозвище?");
        String Nickname = input.nextLine();
        System.out.println( Nickname + " интересное прозвище)");
        System.out.println("Как ты относишься к азартным играм?");
        String gambling = input.nextLine();
        System.out.println("Есть ли люди на которые на тебя повлияли и дальше на тебя влияют?");
        String importantPeople = input.nextLine();
        System.out.println("Любишь экстрим?");
        String extreme = input.nextLine();
        System.out.println("Занимаешься ли ты спортом?");
        String sports = input.nextLine();
        System.out.println("Приятно было с тобой пообщаться. Всего доброго!");
        String bye = input.nextLine();
    }
}
