package kitchenpos.domain;

import kitchenpos.common.constant.ErrorCode;
import kitchenpos.order.domain.OrderLineItems;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OrderLineItemsTest {
    @DisplayName("주문 항목이 비어있으면 예외가 발생한다.")
    @Test
    void emptyException() {
        // when & then
        assertThatThrownBy(() -> new OrderLineItems(new ArrayList<>()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ErrorCode.ORDER_LINE_ITEMS_IS_EMPTY.getMessage());
    }
}
