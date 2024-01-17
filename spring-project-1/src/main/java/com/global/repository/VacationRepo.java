package com.global.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.global.entity.VacationRequest;

@Repository
public interface VacationRepo extends JpaRepository<VacationRequest, Long> {
    
	//@Query(value = "select vr1.id,vr1.emp_id,vr1.end_date,vr1.start_date from vacation vr1 left join employee e1 on e1.id=vr1.emp_id where e1.id= :emp_id")
	List<VacationRequest> findByEmployeeId(Long emp_id);
}
