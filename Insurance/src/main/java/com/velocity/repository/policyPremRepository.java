package com.velocity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.PolicyPremiun;

@Repository
public interface policyPremRepository extends JpaRepository<PolicyPremiun,Integer> {

}
