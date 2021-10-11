package th.ac.ku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch,String> {}
