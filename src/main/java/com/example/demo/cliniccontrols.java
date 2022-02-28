package com.example.demo;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/details")
public class cliniccontrols implements inter {

	@Override
	public <S extends clinic> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends clinic> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<clinic> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<clinic> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<clinic> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(clinic entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends clinic> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}
    
	private inter obj;
	public void inter (inter obj) {
		this.obj=obj;
	}
	

	
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public clinic createclinic(@RequestBody clinic clini) {
		return obj.save(clini);
	}
	@GetMapping("/")
	public Iterable<clinic> getclinic(){
		return obj.findAll();
	}
}
