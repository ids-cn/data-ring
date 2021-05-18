package com.meet2025.dataring.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Roy Cao
 */
@ExtendWith(MockitoExtension.class)
public class DataCatalogServiceTest {

    @Test
    public void testDataCatalogService_Return(){
        Assertions.assertThat("1.0").isEqualTo("1.0");
    }
}