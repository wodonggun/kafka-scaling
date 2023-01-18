package kafka.scaling.domain;

import kafka.scaling.domain.*;
import kafka.scaling.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderModified extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private Integer qty;
    private Long customerId;
    private String address;
}


