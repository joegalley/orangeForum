package com.lumeresoftware.orangeforum.dao;

import com.lumeresoftware.orangeforum.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, String> {
}
