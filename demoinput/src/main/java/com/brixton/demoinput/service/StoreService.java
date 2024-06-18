package com.brixton.demoinput.service;

import com.brixton.demoinput.dto.response.request.StoreGenericRequestDTO;

import java.util.List;

public interface StoreService {
    Object createStore(StoreGenericRequestDTO inputStore);
    List<Object> getInventories(String status);
    Object getCount(String status);
    Object getStore(String orderId);
    Object deleteStore(int idStore);

}
