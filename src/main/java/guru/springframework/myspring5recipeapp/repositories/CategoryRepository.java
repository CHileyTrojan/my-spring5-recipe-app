package guru.springframework.myspring5recipeapp.repositories;

import guru.springframework.myspring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
