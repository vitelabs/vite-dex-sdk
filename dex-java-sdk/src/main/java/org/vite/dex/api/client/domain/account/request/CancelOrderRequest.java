package org.vite.dex.api.client.domain.account.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CancelOrderRequest {

    private String symbol;

    private String orderId;

    private Long timestamp = System.currentTimeMillis();


    public CancelOrderRequest(String symbol, String orderId) {
        this.symbol = symbol;
        this.orderId = orderId;
        this.timestamp = System.currentTimeMillis();
    }
}
