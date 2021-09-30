package guru.springframework.myspring5recipeapp.services;

import guru.springframework.myspring5recipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
