/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.helloWorld.service;

import hello.helloWorld.bean.City;
import java.util.List;

/**
 *
 * @author Haylton
 */
public interface ICityService {
    public List<City> findAll();
    
    
}


