package com.ct.services.floor;

import com.ct.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Kitchen implements Floor {

    @Value("${radius}")
    BigDecimal radius;

    @Override
    public BigDecimal getAea() {
        return radius.pow(2).multiply(new BigDecimal(Math.PI));
    }
}
