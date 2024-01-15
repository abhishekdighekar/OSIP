package com.osip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osip.model.Project;
import com.osip.repository.ProjectRepository;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping("/addProject")
    public String saveProject(@RequestBody Project project) {
    	projectRepository.save(project);
        return "Added project with id : "+ project.getProjectId();
    }

    @GetMapping("/findAllProject")
    public List<Project> getProject(){
        return projectRepository.findAll();
    }

    @GetMapping("/findAllProject/{id}")
    public Optional<Project> getProject(@PathVariable int id){
        return projectRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable String id, @RequestBody Project newProject) {
        newProject.setProjectId(id);
        return projectRepository.save(newProject);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProject(@PathVariable int id) {
    	projectRepository.deleteById(id);
        return "Project deleted with id: "+id;
    }
}
