package com.greatlearning.crudrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.crudrestapi.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}