package com.upemor.sesioncuatro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upemor.sesioncuatro.model.Member;
import com.upemor.sesioncuatro.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);
	
	boolean existsRolesByName(String name);
}
