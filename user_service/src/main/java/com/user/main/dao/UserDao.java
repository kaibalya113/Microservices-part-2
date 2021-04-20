package com.user.main.dao;

import com.user.main.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    @Query("Select u from User u where u.userId=:id")
    User findUserById(@Param("id") Long id);
}
