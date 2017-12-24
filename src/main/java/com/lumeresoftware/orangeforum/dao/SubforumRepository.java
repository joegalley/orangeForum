package com.lumeresoftware.orangeforum.dao;

import com.lumeresoftware.orangeforum.model.Subforum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubforumRepository extends JpaRepository<Subforum, Integer> {
}
