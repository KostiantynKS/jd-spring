package com.ct.services.floor;

import com.ct.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Livingroom implements Floor {

    @Value("${width}")
    BigDecimal width;
    @Value("${length}")
    BigDecimal length;



    @Override
    public BigDecimal getAea() {
        return width.multiply(length);
    }
}
