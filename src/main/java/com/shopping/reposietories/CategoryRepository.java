package com.shopping.reposietories;

import com.shopping.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories ,Long> {

    Categories getCategoryByName(String name);
}