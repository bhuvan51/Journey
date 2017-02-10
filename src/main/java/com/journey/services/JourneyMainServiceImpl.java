package com.journey.services;

import org.springframework.stereotype.Component;

/**
 * Created by Surya on 2/9/2017.
 */

@Component
public class JourneyMainServiceImpl implements JourneyMainService{

    public String checkForName(String searchVal){
        String result;
        if("s".equalsIgnoreCase(searchVal.substring(0,1))){
            result = searchVal+" found in my database";
        }else{
            result = searchVal+" not found in my database";
        }

        return result;
    }
}
