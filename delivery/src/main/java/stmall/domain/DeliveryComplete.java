package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
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

    public DeliveryComplete(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryComplete() {
        super();
    }
}
//>>> DDD / Domain Event
