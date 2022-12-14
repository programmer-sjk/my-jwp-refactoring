package kitchenpos.order.dto;

import kitchenpos.order.domain.NumberOfGuests;
import kitchenpos.order.domain.OrderTable;

public class OrderTableRequest {
    private int numberOfGuests;
    private boolean empty;

    protected OrderTableRequest() {}

    private OrderTableRequest(int numberOfGuests, boolean empty) {
        this.numberOfGuests = numberOfGuests;
        this.empty = empty;
    }

    public static OrderTableRequest of(int numberOfGuests, boolean empty) {
        return new OrderTableRequest(numberOfGuests, empty);
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public boolean isEmpty() {
        return empty;
    }

    public OrderTable createOrderTable() {
        return new OrderTable(new NumberOfGuests(numberOfGuests), empty);
    }
}
