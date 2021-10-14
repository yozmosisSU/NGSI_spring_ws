package com.ziddioglu.app.ws.io.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ziddioglu.app.ws.io.entity.Question;


@Repository
public interface QuestionsRepository extends CrudRepository<Question, Long>{
	
	

}
