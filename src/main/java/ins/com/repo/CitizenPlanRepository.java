package ins.com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ins.com.entity.CitizenPlan;

public interface CitizenPlanRepository  extends JpaRepository<CitizenPlan, Integer>{
	 @Query("select distinct (planName) from CitizenPlan")
	  	  public List<String> getPlanName();
	    @Query("select distinct (planStatus) from CitizenPlan")
	    public List<String> getPlanStatus();
}


