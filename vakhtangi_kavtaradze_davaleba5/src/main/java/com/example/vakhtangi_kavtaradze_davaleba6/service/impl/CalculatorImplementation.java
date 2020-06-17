package com.example.vakhtangi_kavtaradze_davaleba6.service.impl;


import org.springframework.stereotype.Service;

@Service
public class CalculatorImplementation implements CalculatorService {
    @Override
    public int multiplication(int arg1, int arg2) {
        return arg1 * arg2;
    }
}