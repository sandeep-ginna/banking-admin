package com.prowesssoft.admin.repository;



import com.prowesssoft.admin.entity.Bank;
import com.prowesssoft.admin.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

    Optional<Branch> findByIfscCode(String ifscCode);
}
