package ioc.dependency.spring.ioc_di_spring_boot.services;

import org.springframework.stereotype.Service;


@Service
public class DeliverService {
    
    //Definindo regra do deliver uilizando IF-ELSE
    public double region(String region){
            if("Norte".equalsIgnoreCase(region)){
                return 50.0;
            }
            else if("Nordeste".equalsIgnoreCase(region)){
                return 40.0;
            }
            else if("Centro-Oeste".equalsIgnoreCase(region)){
                return 30.0;
            }
            else if("Sudeste".equalsIgnoreCase(region)){
                return 20.0;
            }
            else if("Sul".equalsIgnoreCase(region)){
                return 10.0;
            }   
            return 0; 
        }
}
