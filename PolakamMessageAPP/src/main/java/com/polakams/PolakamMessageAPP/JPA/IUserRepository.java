package com.polakams.PolakamMessageAPP.JPA;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.polakams.PolakamMessageAPP.Model.User;

public interface IUserRepository extends JpaRepository<User,Long> {

}
