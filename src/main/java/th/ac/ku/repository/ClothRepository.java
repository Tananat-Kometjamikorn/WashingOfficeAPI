package th.ac.ku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.model.Cloth;

import java.util.UUID;

@Repository
public interface ClothRepository extends JpaRepository<Cloth, UUID> {}
