package service;

import entity.Faculty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import repository.FacultyRepository;


import java.util.Collection;

@Service
public class FacultyService {

    private final FacultyRepository facultyRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(AvatarService.class);

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        LOGGER.debug("Method createFaculty was invoked");
        return facultyRepository.save(faculty);
    }

    public Faculty getFaculty(Long id) {
        LOGGER.debug("Method getFaculty was invoked");
        return facultyRepository.findById(id).orElse(null);
    }

    public Faculty updateFaculty(Faculty faculty) {
        LOGGER.debug("Method updateFaculty was invoked");
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id) {
        LOGGER.debug("Method deleteFaculty was invoked");
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAll() {
        LOGGER.debug("Method getAll was invoked");
        return facultyRepository.findAll();
    }

    public Collection<Faculty> findFacultiesByName(String name) {
        LOGGER.debug("Method findFacultiesByName was invoked");
        return facultyRepository.findAllByNameIgnoreCase(name);
    }

    public Collection<Faculty> findFacultiesByColor(String color) {
        LOGGER.debug("Method findFacultiesByColor was invoked");
        return facultyRepository.findAllByColorIgnoreCase(color);
    }
}