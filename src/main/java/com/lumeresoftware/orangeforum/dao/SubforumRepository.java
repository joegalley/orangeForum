package com.lumeresoftware.orangeforum.dao;

import com.lumeresoftware.orangeforum.model.Subforum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubforumRepository extends CrudRepository<Subforum, Integer> {
}
