package com.osip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osip.model.Project;
import com.osip.repository.ProjectRepository;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectRepository repository;

    @PostMapping("/addProject")
    public String saveProject(@RequestBody Project project) {
        repository.save(project);
        return "Added project with id : "+ project.getProjectId();
    }

    @GetMapping("/findAllProject")
    public List<Project> getProject(){
        return repository.findAll();
    }

    @GetMapping("/findAllProject/{id}")
    public Optional<Project> getProject(@PathVariable int id){
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProject(@PathVariable int id) {
        repository.deleteById(id);
        return "Project deleted with id: "+id;
    }
}
