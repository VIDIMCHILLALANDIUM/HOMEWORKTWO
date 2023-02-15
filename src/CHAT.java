import java.util.Scanner;

public class CHAT {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Привет! Как тебя зовут?");
        String Name = input.nextLine();
        System.out.println("Приятно познакомится, " + Name );
        System.out.println("Ты учишься или работаешь?");
        String Work = input.nextLine();
        System.out.println("Какое у тебя хобби?");
        String Hobby = input.nextLine();
        System.out.println("Кем ты хочешь стать?");
        String Target = input.nextLine();
        System.out.println("Какую книгу читаешь на данный момент?");
        String Book = input.nextLine();
        System.out.println("Часто ли ты путешествуешь?");
        String Journey = input.nextLine();
        System.out.println("Куда ездил отдыхать?");
        String Recreation = input.nextLine();
        System.out.println("Твое любимое животное?");
        String Animal = input.nextLine();
        System.out.println("Есть ли у тебя дома животные?");
        String Pet = input.nextLine();
        System.out.println("Твою любимый фильм?");
        String Film = input.nextLine();
        System.out.println("Какую музыку слушаешь?");
        String Music = input.nextLine();
        System.out.println( Music + "мне тоже нравится)");
        System.out.println("Твой любимый исполнитель?");
        String Performer  = input.nextLine();
        System.out.println("Какие иностранные языки знаешь?");
        String ForeignLanguages = input.nextLine();
        System.out.println("Много ли у тебя друзей?");
        String Friends = input.nextLine();
        System.out.println("Какое у тебя прозвище?");
        String Nickname = input.nextLine();
        System.out.println( Nickname + " интересное прозвище)");
        System.out.println("Как ты относишься к азартным играм?");
        String Gambling = input.nextLine();
        System.out.println("Есть ли люди на которые на тебя повлияли и дальше на тебя влияют?");
        String TheInfluenceOfPeople = input.nextLine();
        System.out.println("Любишь экстрим?");
        String Extreme = input.nextLine();
        System.out.println("Как долго зависаешь за компом?");
        String Computer = input.nextLine();
        System.out.println("Приятно было с тобой пообщаться. Всего доброго!");
        String Bye = input.nextLine();
    }
}
