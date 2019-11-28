package it.academy.excercise.paintstore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.academy.excercise.paintstore.domain.Paint;

public interface PaintRepository extends CrudRepository<Paint, String> {

	public List<Paint> findByShopId (String shopId);	
}
