package com.osip.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.osip.model.Project;

public interface ProjectRepository extends MongoRepository<Project, Integer>{

}
