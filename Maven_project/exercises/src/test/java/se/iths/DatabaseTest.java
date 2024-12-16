package se.iths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DatabaseTest {

    @Mock
    private Database mockDatabase;

    private Product testProduct;

    @BeforeEach
    void setUp() {
        mockDatabase = mock(Database.class);
        testProduct = new Product("1", "Test Product", 99.99, 5);
        mockDatabase.saveProduct(testProduct);
    }

    @Test
    void whenFindById_thenReturnCorrectProduct() {
        when(mockDatabase.findById("1")).thenReturn(testProduct);

        Product foudnProduct = mockDatabase.findById("1");

        assertEquals(testProduct.getName(), foudnProduct.getName());
        assertEquals(testProduct.getPrice(), foudnProduct.getPrice());
    }

    @Test
    void whenSavingProduct_thenVerifyMethodCalled() {
        Product prod = new Product("2", "Stina-Kalle choklad", 690.0, 1);
        mockDatabase.saveProduct(prod);
        verify(mockDatabase).saveProduct(prod);
    }

    @Test
    void whenUpdatingStock_thenVerifyNewQuantity() {
        mockDatabase.updateStock(String.valueOf(1), 12);
        verify(mockDatabase).updateStock(String.valueOf(1), 12);

    }
    @Test
    void whenProductNotFound_thenReturnNull() {
    }

    @Test
    void whenMultipleInteractions_thenVerifyAll() {

    }
}