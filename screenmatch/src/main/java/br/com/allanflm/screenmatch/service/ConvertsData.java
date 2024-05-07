package br.com.allanflm.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertsData  implements IConvertsData{

    public ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T getData(String json, Class<T> classe) {
         try{
             return mapper.readValue(json, classe);

         }catch (JsonProcessingException e){
             throw new RuntimeException(e);
         }
    }
}
