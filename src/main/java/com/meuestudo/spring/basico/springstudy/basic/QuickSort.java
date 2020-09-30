package com.meuestudo.spring.basico.springstudy.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {
    public int[] sort(int[] arr){
        //logic
        return arr;
    }
}
