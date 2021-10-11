package th.ac.ku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.model.OrderInfo;

import java.util.UUID;

@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo, UUID> {
}
