package ru.itpark;

public class Razdel {
    private final int max_razdel = 10;
    private String name;
    private String typeRazdel;
    private int countOfRazdel;
    private Food foods[];

    public Razdel (String name,String typeRazdel){
        this.name = name;
        this.typeRazdel = typeRazdel;
        this.foods = new Food[max_razdel];
        this.countOfRazdel = 0;
    }
    public void addFoods (Food food){
        if (typeRazdel == food.getTypeFood()) {
            if (countOfRazdel < max_razdel) {
                foods[countOfRazdel] = food;
                countOfRazdel++;
            } else {
                System.err.println("Превышен лимит блюд меню");
            }
        } else {
            System.err.println("Не правильно выбран раздел");
        }
    }
    public void showRazdel (){
        System.out.println("                                __________" + name + "__________");
        System.out.println();
        for(int i = 0; i < countOfRazdel; i++){
            foods[i].showFood();
            System.out.println();
        }
    }
 }


