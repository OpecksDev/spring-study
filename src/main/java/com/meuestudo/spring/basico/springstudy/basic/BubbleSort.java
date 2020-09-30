package com.meuestudo.spring.basico.springstudy.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {
    public int[] sort(int[] arr){
        //logic
        return arr;
    }
}
