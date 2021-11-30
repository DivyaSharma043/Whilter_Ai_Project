package com.whilterAiProject.repositories;

import com.whilterAiProject.entities.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
    }
