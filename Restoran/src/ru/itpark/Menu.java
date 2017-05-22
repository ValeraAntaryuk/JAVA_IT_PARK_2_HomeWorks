package ru.itpark;


public class Menu {
    private final int MAX_RAZDEL_COUNT = 10;
    private String name;
    private int countOfMenu;
    private Razdel razdels[];

    public Menu(String name) {
        this.name = name;
        this.countOfMenu = 0;
        this.razdels = new Razdel[MAX_RAZDEL_COUNT];
    }
    public void addRazdel(Razdel razdel){
        if (countOfMenu < MAX_RAZDEL_COUNT){
            razdels[countOfMenu] = razdel;
            countOfMenu++;
        } else{
            System.err.println("Превышен лимит разделов");
        }
    }
    public void showMenu (){
        System.out.println("                                 __________МЕНЮ__________");
        System.out.println();
        for (int i = 0; i < countOfMenu;i++){
            razdels[i].showRazdel();
        }
    }

}

