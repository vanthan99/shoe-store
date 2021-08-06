package com.shoesstore;

import com.shoesstore.entity.Category;
import com.shoesstore.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class init {
    @Autowired
    CategoryRepository categoryRepository;

//    @PostConstruct
    public void initCategory(){
        List<String> strings = Arrays.asList("nike","adidas","vans","balenciaga","converse","mcqueen");
        strings.forEach(s -> {
            categoryRepository.save(new Category("giày "+s));
        });
    }
}
