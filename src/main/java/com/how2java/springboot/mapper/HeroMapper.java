package com.how2java.springboot.mapper;
 
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.how2java.springboot.pojo.Hero;
import com.how2java.springboot.pojo.Yonghu;
 
@Mapper
public interface HeroMapper {
    public int add(Hero hero); 
    
    public void delete(int id); 
        
    public Hero get(int id); 
      
    public int update(Hero hero);  
        
    public List<Hero> list();
    
    public long denglu(Yonghu yonghu);  
}