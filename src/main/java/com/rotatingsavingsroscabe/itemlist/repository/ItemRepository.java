package com.rotatingsavingsroscabe.itemlist.repository;

import com.rotatingsavingsroscabe.itemlist.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
