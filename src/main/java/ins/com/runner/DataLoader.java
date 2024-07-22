package ins.com.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import ins.com.entity.CitizenPlan;
import ins.com.repo.CitizenPlanRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private CitizenPlanRepository repo;
    @Override
    public void run(ApplicationArguments args) throws Exception{
        CitizenPlan c1=new CitizenPlan();
        c1.setCitizenName("John");
        c1.setGender("Male");
        c1.setPlanName("Cash");
        c1.setPlanStatus("Approved");
        c1.setPlanStartDate(LocalDate.now());
        c1.setPlanEndDate(LocalDate.now().plusDays(180));
        c1.setBenefitAmt(5000.00);
        
        CitizenPlan c2=new CitizenPlan();
        c2.setCitizenName("Elon");
        c2.setGender("Male");
        c2.setPlanName("Medicaid");
        c2.setPlanStatus("Active");
        c2.setPlanStartDate(LocalDate.now());
        c2.setPlanEndDate(LocalDate.now().plusDays(180));
        c2.setBenefitAmt(525.00);
        
        CitizenPlan c3=new CitizenPlan();
        c3.setCitizenName("Rachel");
        c3.setGender("Female");
        c3.setPlanName("Medicare");
        c3.setPlanStatus("Active");
        c3.setPlanStartDate(LocalDate.now());
        c3.setPlanEndDate(LocalDate.now().plusDays(180));
        c3.setBenefitAmt(2000.00);
        
        List<CitizenPlan> list = Arrays.asList(c1,c2,c3);
        repo.saveAll(list);
    }
}