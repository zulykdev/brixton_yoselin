package com.brixton.demoinput.service;

import com.brixton.demoinput.dto.request.StoreGenericRequestDTO;
import com.brixton.demoinput.dto.response.StoreResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import com.brixton.demoinput.model.store.Store;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class StoreServiceImpl implements StoreService{
    Map<String, Store> stores = new HashMap<>();
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Object createStore(StoreGenericRequestDTO inputStore) {
        return null;
    }

    @Override
    public List<Object> getInventories(String status) {
        return null;
    }

    @Override
    public Object getCount(String status) {
        return null;
    }

    @Override
    public Object getStore(String orderId) {
        return null;
    }

    @Override
    public Object deleteStore(int idStore) {
        return null;
    }
}
