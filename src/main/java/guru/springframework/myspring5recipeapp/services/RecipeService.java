package guru.springframework.myspring5recipeapp.services;

import guru.springframework.myspring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
