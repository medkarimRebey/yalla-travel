package com.travel.travelAuth.repositories;


import com.travel.travelAuth.models.ERole;
import com.travel.travelAuth.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}