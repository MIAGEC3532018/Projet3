package fr.emiage.agence.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.emiage.agence.entity.User_App;

public interface UserAppRepository extends CrudRepository<User_App, Long> {

    List<User_App> findByLastName(String lastName);
    
}
