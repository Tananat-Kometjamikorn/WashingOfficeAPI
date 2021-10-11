package th.ac.ku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.model.HeadQuarter;

@Repository
public interface HeadQuarterRepository extends JpaRepository<HeadQuarter,String> {
}
