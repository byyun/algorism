package com.phantom;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class SelectionTest {
    @Test
    @DisplayName("테스트")
    void sort() {
        int[] data = {1,2,15,6,7};
        int[] data1 = {1,2,15,6,7};
        Arrays.sort(data);
        Selection.minSelectionSort(data1, data1.length);
        /*
        for(int a : data1) {
            System.out.println(a);
        }

         */
        assertThat(data1).isEqualTo(data);
    }
}
