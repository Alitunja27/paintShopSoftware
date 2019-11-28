package it.academy.excercise.paintstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.academy.excercise.paintstore.domain.Shop;
import it.academy.excercise.paintstore.repository.ShopRepository;

@Service
public class ShopService {
	
	
	@Autowired
	private ShopRepository shopRepository;
	
	public List<Shop> getAllShops (){
		List<Shop> shops = new ArrayList<>();
		shopRepository.findAll().forEach(shops::add);//for each element of the findAll ::add to the shops list
		return shops;
	}
	
	public Optional<Shop> getShop (String shopNameId){
		return shopRepository.findById(shopNameId);
	}
	
	public void addShop(Shop shop) {
		shopRepository.save(shop);
	}
}
