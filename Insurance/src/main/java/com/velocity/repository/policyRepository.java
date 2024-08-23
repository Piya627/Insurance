package com.velocity.repository;
import com.velocity.model.Policy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface policyRepository extends JpaRepository<Policy,Integer>{

}
