package com.how2java.springboot.service;

import java.util.List;


import com.how2java.springboot.pojo.Hero;
import com.how2java.springboot.pojo.Yonghu;

public interface HeroService {
    public int add(Hero hero); 
    
    public void delete(int id); 
        
    public Hero get(int id); 
      
    public int update(Hero hero);  
        
    public List<Hero> list();
    
    public Yonghu denglu(Yonghu yonghu);  
}
