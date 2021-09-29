package guru.springframework.myspring5recipeapp.services;

import guru.springframework.myspring5recipeapp.commands.RecipeCommand;
import guru.springframework.myspring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long IdToDelete);
}
