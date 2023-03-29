package com.flt.product2.flink;

/**
 * @Author : fenglingtong
 * @Date: 2022-12-17 16:17
 */
public class LoginEvent {
    public String userId;
    public String ipAddress;
    public String eventType;
    public Long eventTime;

    public LoginEvent(String userId, String ipAddress, String eventType, Long eventTime) {
        this.userId = userId;
        this.ipAddress = ipAddress;
        this.eventType = eventType;
        this.eventTime = eventTime;
    }

    public LoginEvent() {}

    @Override
    public String toString() {
        return "LoginEvent{" +
                "userId='" + userId + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", eventType='" + eventType + '\'' +
                ", eventTime=" + eventTime +
                '}';
    }
}
