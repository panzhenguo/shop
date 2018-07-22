package com.pan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;


@Data
@Entity
@Table(name="test_order")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(name="order_no")
	private String orderNo;
	@Column
	private Integer price;
	@Column
	private String remark;
}
