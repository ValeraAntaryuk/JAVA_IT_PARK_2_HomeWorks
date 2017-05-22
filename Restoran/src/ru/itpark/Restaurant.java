package ru.itpark;

public class Restaurant {
    private String name;
    private String chiefName;
    private String address;
    private String typeRestaurant;
    private Menu menuRestaurant[];

    public Restaurant(String name, String chiefName, String address, String typeRestaurant){
        this.name = name;
        this.chiefName = chiefName;
        this.address = address;
        this.typeRestaurant = typeRestaurant;
        this.menuRestaurant = new Menu [1];

    }
    public void addMenuRestouran(Menu menu) {
        menuRestaurant[0] = menu;
    }

    public void welcome (){
        System.out.println("Мы рады приветствовать Вас в нашем " + typeRestaurant + " \"" + name + "\"" + " !" );
        System.out.println("Меня зовут " + chiefName + " и я буду сегодня Вашим официантом.");
    }
    public void zakaz(){
        System.out.println("Какой Салат Вы хотите заказать ?");
        menuRestaurant[0].

    }
    public void showMenuRestaurant(){
        for (int i = 0; i < menuRestaurant.length; i++) {
            menuRestaurant[i].showMenu();
        }

    }
}

