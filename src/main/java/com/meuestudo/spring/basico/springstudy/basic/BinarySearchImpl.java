package com.meuestudo.spring.basico.springstudy.basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sorting;

    public BinarySearchImpl (SortAlgorithm sortAlg){
        sorting = sortAlg;
    }
    public int binarySearch(int[] numberArr, int nToFind){
        int[] sortedArr = sorting.sort(numberArr);
        System.out.println(sorting);
        return 3;
    }
}
