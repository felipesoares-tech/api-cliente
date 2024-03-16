package br.com.felipesoarestech.api.cliente.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductResponseDTO{
    private Integer id;
    private String name;
    private Double price;

}
