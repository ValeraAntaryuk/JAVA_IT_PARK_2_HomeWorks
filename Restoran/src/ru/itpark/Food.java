package ru.itpark;

public class Food {
    private String nameFood;
    private String typeFood;
    private String aboutFood;
    private int weightFood;
    private int caloriesFood;
    private int priceFood;

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getAboutFood() {
        return aboutFood;
    }

    public void setAboutFood(String aboutFood) {
        this.aboutFood = aboutFood;
    }

    public int getWeightFood() {
        return weightFood;
    }

    public void setWeightFood(int weightFood) {
        if (weightFood > 0) {
            this.weightFood = weightFood;
        } else {
            System.err.println("Не корректный вес блюда");
        }
    }
    public int getCaloriesFood() {
        return caloriesFood;
    }

    public void setCaloriesFood(int caloriesFood) {
         if (caloriesFood > 0){
             this.caloriesFood = caloriesFood;
         } else {
             System.err.println("Не корректные каллории блюда");
         }

    }

    public int getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(int priceFood) {
        if (priceFood > 0){
           this.priceFood = priceFood;
        } else {
            System.err.println("Не кооректная цена блюда");
        }
    }

    public Food(String nameFood, String typeFood, String aboutFood, int weightFood, int caloriesFood, int priceFood) {
        this.nameFood = nameFood;
        this.typeFood = typeFood;
        this.aboutFood = aboutFood;
        this.weightFood = weightFood;
        this.caloriesFood = caloriesFood;
        this.priceFood = priceFood;
    }

    Food() {
        nameFood = "Default name";
        typeFood = "Default type";
        aboutFood = "Think Different";
        weightFood = 10;
        caloriesFood = 10;
        priceFood = 10;
    }
    public void showFood(){
        System.out.println(nameFood + " : ");
        System.out.println(aboutFood);
        System.out.println("Выход блюда: " + weightFood + " грамм " + " Каллории: " + caloriesFood + " ккал.");
        System.out.println("Цена: " + priceFood + " руб.");
    }

}