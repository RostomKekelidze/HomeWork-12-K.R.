package lesson1;

public class HomeWork {
    public static void main(String[] args) {


        Author dovlatov = new Author("Сергей", "Довлатов");
        Author bulgakov = new Author("Михаил", "Булгаков");
        Book remeslo = new Book("Ремесло", 1975, dovlatov);
        Book morfiy = new Book("Морфий", 1926, bulgakov);

        remeslo.printinfo();
        morfiy.printinfo();

        remeslo.setPublishingYear(1976);
        remeslo.printinfo();

    }
}


