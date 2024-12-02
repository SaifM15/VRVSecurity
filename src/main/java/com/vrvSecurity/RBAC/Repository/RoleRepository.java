package com.vrvSecurity.RBAC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrvSecurity.RBAC.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
