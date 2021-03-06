package com.igeekhome.ccsv2.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkOrder {
    private int workOrderId;
    private String type;
    private String title;
    private String orderDesc;
    private String attachments;
    private String cclist;
    private int priority;
    private int state;
    private int customerServiceGroupId;
    private int customerServiceId;
    private int customerId;
    private String channel;
}
