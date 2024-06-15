package com.brixton.gestionProduccion.service;

import com.brixton.gestionProduccion.dto.request.CategoryRequestDTO;
import com.brixton.gestionProduccion.dto.request.ProductRequestDTO;
import com.brixton.gestionProduccion.dto.response.ProductResponseDTO;
import com.brixton.gestionProduccion.model.Category;
import com.brixton.gestionProduccion.model.Product;
import com.brixton.gestionProduccion.model.TypeCategory;
import com.brixton.gestionProduccion.model.mappers.CustomDateDeserializer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private static final String USER_APP = "YOSELIN";

    Map<Integer, Product> products =  new HashMap<>();
    Map<String, Category> categories = new HashMap<>();

    ObjectMapper objectMapper = new ObjectMapper();
    SimpleModule module = new SimpleModule();

    public ProductServiceImpl(){
        module.addDeserializer(LocalDate.class, new CustomDateDeserializer());
        module.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
            @Override
            public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        });

        //module.addSerializer(LocalDateTimeSerializer);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.registerModule(module);
        objectMapper.findAndRegisterModules();
    }

    @Override
    public Object createProduct(ProductRequestDTO newProduct) {

        try {
            String jsonInput = objectMapper.writeValueAsString(newProduct);

            Product product = objectMapper.readValue(jsonInput, Product.class);
            product.setCreatedAt(LocalDateTime.now());
            product.setCreatedBy(USER_APP);
            products.put(product.getId(), product);

            String jsonOutput = objectMapper.writeValueAsString(product);
            ProductResponseDTO output = objectMapper.readValue(jsonOutput, ProductResponseDTO.class);
            return output;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Object getProduct(int idProduct) {

        for(Product product: products.values()){
            try {
                String jsonOutput = objectMapper.writeValueAsString(product);
                ProductResponseDTO output = objectMapper.readValue(jsonOutput, ProductResponseDTO.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return products.get(idProduct);
    }

    @Override
    public Object updateProduct(int idProduct, ProductRequestDTO updateProduct) {

        try {
            String jsonInput = objectMapper.writeValueAsString(updateProduct);
            Product productTemporal = objectMapper.readValue(jsonInput, Product.class);

            Product original = products.get(idProduct);
            if(original != null){
                original.setName(productTemporal.getName());
                original.setPrice(productTemporal.getPrice());
                original.setCategory(productTemporal.getCategory());
                original.setInventory(productTemporal.getInventory());
                original.setUpdatedAt(LocalDateTime.now());
                original.setUpdatedBy(USER_APP);

                String jsonOutput = objectMapper.writeValueAsString(original);
                ProductResponseDTO output = objectMapper.readValue(jsonOutput, ProductResponseDTO.class);
                return output;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getCategory( String category) {
       // List<String>categoris = new ArrayList<>();
        for(Category categori: categories.values()){
            try {
                String jsonOutput = objectMapper.writeValueAsString(categori);
                //categoris.add(String.valueOf(categori.getName()));
                return jsonOutput;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return  null;
    }
}
