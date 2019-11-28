package it.academy.excercise.paintstore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.academy.excercise.paintstore.domain.Paint;
import it.academy.excercise.paintstore.domain.Shop;
import it.academy.excercise.paintstore.service.PaintService;

@RestController
public class PaintController {
	
	@Autowired
	private PaintService paintService;
	
	@RequestMapping("/shops/{shopNameId}/paints")
	public List<Paint> getAllPaints (@PathVariable String shopNameId){
		return paintService.getAllpaints(shopNameId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/shops/{shopNameId}/paints")
	public void addPaints (@RequestBody Paint paint, @PathVariable String shopNameId) {
		paint.setShop(new Shop(shopNameId,"",""));		
		paintService.addPaints(paint);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/shops/{shopNameId}/paints")
	public void deletePaints (@PathVariable String shopNameId) {
		paintService.deletePaints(shopNameId);
	}
	
}
