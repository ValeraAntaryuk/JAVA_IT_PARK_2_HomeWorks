package ru.itpark;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Food food1 = new Food("Цезарь", "Салат",
                "популярный салат, одно из самых известных блюд североамериканской кухни",
                230, 230, 350);
        Food food2 = new Food("Стейк из говядины", "Горячее",
                "Толстый кусок обжаренного мяса, из лучших частей говядины",
                320, 480, 650);
        Food food3 = new Food("Jack Daniels", "Алкоголь",
                "Вид американского виски. Выпускается в винокурнях города Линчберг[en], штат Теннесси, США, с XIX века.",
                100, 217, 400);
        Food food4 = new Food("Греческий","Салат",
                               "Салат из помидоров, огурцов, фета, шалота и маслин, заправленный оливковым маслом с солью",
                                184,161,300);
        Food food5 = new Food("Стейк из лосося","Горячее",
                              "Неповторимый мягкий, насыщенный вкус красной рыбы",
                              240,283,750);
        Food food6 = new Food("Spaten","Алкоголь",
                               "Знаменитое немецкое пиво,прекрасный представитель Баварского пивоварения",
                                500,225,350);
        Razdel razdel1 = new Razdel("САЛАТЫ","Салат");
        Razdel razdel2 = new Razdel("ГОРЯЧИЕ БЛЮДА","Горячее");
        Razdel razdel3 = new Razdel("КАРТА БАРА","Алкоголь");
        razdel1.addFoods(food1);
        razdel1.addFoods(food4);
        razdel2.addFoods(food2);
        razdel2.addFoods(food5);
        razdel3.addFoods(food3);
        razdel3.addFoods(food6);
        //razdel2.showRazdel();
        Menu menu1 = new Menu("Основное");
        menu1.addRazdel(razdel1);
        menu1.addRazdel(razdel2);
        menu1.addRazdel(razdel3);
        Restaurant restaurant1 = new Restaurant("Манхетен","Антон",
                                                "Казань ул. Ершова д.5","Гриль - бар");
        //menu1.showMenu();
        // Работа ресторана
       restaurant1.addMenuRestouran(menu1);
       restaurant1.welcome();
       System.out.println("Вы готовы сделать заказ прямо сейчас?");
       System.out.println("1 -  сделать заказ, 2 - показать меню, 3 - спасибо, я не буду заказывать");

        int a = 0;
        while (a != 3) {
           a = scanner.nextInt();
           if (a == 1) {
                restaurant1.zakaz();
           }
           if (a == 2) {
               //TODO: все меню или часть?
               //все
               restaurant1.showMenuRestaurant();
               //часть
               //restaurant1.showRazdel();
           }
       }
    }

}
