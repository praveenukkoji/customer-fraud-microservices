package com.praveenukkoji.clients.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest implements Serializable {
    Integer toCustomerId;
    String toCustomerEmail;
    String message;
}
