package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryComplete extends AbstractEvent {

    private Long id;
    private String itemid;
    private String address;
    private String status;
    private String oderid;
    private String customerid;
    private Integer qty;
}
