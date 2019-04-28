package domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Shoe {
    private String title;
    private String link;
    private String image;
    private Integer lprice;
    private Integer hprice;
    private String mallName;
    private Integer productType;
}
