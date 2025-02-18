import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealName();
}

class VegetarianMeal implements MealPlan {
    private String mealName;
    public VegetarianMeal(String mealName) {
        this.mealName = mealName;
    }
    public String getMealName() {
        return mealName;
    }
}

class VeganMeal implements MealPlan {
    private String mealName;
    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }
    public String getMealName() {
        return mealName;
    }
}

class KetoMeal implements MealPlan {
    private String mealName;
    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }
    public String getMealName() {
        return mealName;
    }
}

class HighProteinMeal implements MealPlan {
    private String mealName;
    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }
    public String getMealName() {
        return mealName;
    }
}

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();
    public void addMeal(T meal) {
        meals.add(meal);
    }
    public List<T> getMeals() {
        return meals;
    }
    public static <T extends MealPlan> void generateMealPlan(List<T> mealOptions) {
        for (T meal : mealOptions) {
            System.out.println("Meal Plan: " + meal.getMealName());
        }
    }
}

public class MealPlanGenerator {
    public static void main(String[] args) {
        List<VegetarianMeal> vegetarianMeals = new ArrayList<>();
        vegetarianMeals.add(new VegetarianMeal("Vegetable Stir Fry"));
        vegetarianMeals.add(new VegetarianMeal("Pasta Primavera"));

        List<VeganMeal> veganMeals = new ArrayList<>();
        veganMeals.add(new VeganMeal("Quinoa Salad"));
        veganMeals.add(new VeganMeal("Lentil Soup"));

        Meal.generateMealPlan(vegetarianMeals);
        Meal.generateMealPlan(veganMeals);
    }
}
