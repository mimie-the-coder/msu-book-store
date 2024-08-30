package com.dev.spring.boot.commons.repository;


import com.dev.spring.boot.commons.repository.dao.Role;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByRoleName(String name);

    Boolean existsByRoleName(String roleName);

    @Override
    List<Role> findAll();


}
