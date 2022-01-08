package com.slevi.sdp.resources;

import com.slevi.sdp.domain.Categoria;
import com.slevi.sdp.services.CategoriaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class CategoriaResourceTest {
    @Mock
    CategoriaService service;
    @InjectMocks
    CategoriaResource categoriaResource;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFind() {
        Categoria cat1 = new Categoria(1, "Planners");
        when(service.findById(1)).thenReturn(Optional.of(cat1));

        ResponseEntity<?> result = categoriaResource.find(Integer.valueOf(1));
        assertEquals(200, result.getStatusCodeValue());
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertTrue(result.getBody().toString().contains("Planner"));

    }

}