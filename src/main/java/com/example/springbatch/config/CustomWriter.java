package com.example.springbatch.config;

import com.example.springbatch.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class CustomWriter implements ItemWriter {

    private final CustomerRepository customerRepository;

    @Override
    public void write(List list) throws Exception {
        System.out.println("Thread Name : -"+Thread.currentThread().getName());
        customerRepository.saveAll(list);
    }
}
