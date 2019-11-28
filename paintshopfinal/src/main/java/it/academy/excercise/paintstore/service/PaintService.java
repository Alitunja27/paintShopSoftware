package it.academy.excercise.paintstore.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.academy.excercise.paintstore.domain.Paint;
import it.academy.excercise.paintstore.repository.PaintRepository;

@Service
public class PaintService {
	
	@Autowired
	private PaintRepository paintRepository;

	public List<Paint> getAllpaints(String shopNameId) {
		List<Paint> paints = new ArrayList<>();
		paintRepository.findByShopId(shopNameId)
		.forEach(paints::add);
		return paints;
	}
		
	public void addPaints(Paint paint) {
		paintRepository.save(paint);
	}
	public void deletePaints(String shopNameId) {
		paintRepository.deleteAll();
	}
	
	
	
	
}
