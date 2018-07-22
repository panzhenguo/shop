package com.pan.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pan.entity.Order;

public interface OrderRepostiory extends JpaRepository<Order,Integer>	{

}
