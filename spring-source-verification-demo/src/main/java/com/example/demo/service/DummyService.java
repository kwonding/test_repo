package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public void checkNull() {
        String str = null;

        if (str != null) {
            int length = str.length();
            System.out.println("길이: " + length);
        } else {
            System.out.println("null");
        }
    }
}
