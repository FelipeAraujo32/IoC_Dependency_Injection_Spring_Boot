package ioc.dependency.spring.ioc_di_spring_boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlayService {
    
    @Autowired
    private TaxService taxService;
    @Autowired
    private DeliverService deliverService;

  
    public double finalPrice(double price, String region){ 
      return price + deliverService.region(region) + taxService.tax(price, region);
    }
}
