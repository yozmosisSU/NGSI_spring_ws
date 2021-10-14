package com.ziddioglu.app.ws.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ziddioglu.app.ws.io.entity.Question;
import com.ziddioglu.app.ws.io.repository.QuestionsRepository;

@Service
public class QuestionService {
	
	@Autowired
	QuestionsRepository questionsRepository;
	
	public boolean alreadyRanOnce = false;
	
	List<Question> allQuestions;
	
	
	
	public List<Question> getAllQuestions() {
		
		if (!alreadyRanOnce) {
			generateDummyData();
			alreadyRanOnce = true;
		}
		
		
		
		allQuestions = (List<Question>) questionsRepository.findAll();
		Collections.shuffle(allQuestions);
		return allQuestions;
		
	}
	
	public void generateDummyData() {
		Question question1 = new Question("What is the capital of Turkey?", "Marmaris", "Washington", "Istanbul", "Ankara", "Antakya", "Ankara");
		Question question2 = new Question("What is the capital of USA?", "DC", "Washington", "Istanbul", "Ankara", "Antakya", "DC");
		Question question3 = new Question("What is the capital of Bahrain?", "Marmaris", "Washington", "Istanbul", "Manama", "Antakya", "Manama");
		Question question4 = new Question("What is the capital of Algeria?", "Algiers", "Washington", "Istanbul", "Manama", "Antakya", "Algiers");
		Question question5 = new Question("What is the capital of Argentina?", "Marmaris", "Buenos Aires", "Istanbul", "Manama", "Antakya", "Buenos Aires");
		Question question6 = new Question("What is the capital of Bahamas?", "Marmaris", "Washington", "Nassau", "Manama", "Antakya", "Nassau");
		Question question7 = new Question("What is the capital of Botswana?", "Gaborone", "Washington", "Istanbul", "Manama", "Antakya", "Gaborone");
		Question question8 = new Question("What is the capital of Chad?", "Marmaris", "Washington", "Istanbul", "Manama", "N'Djamena", "N'Djamena");
		Question question9 = new Question("What is the capital of Cuba?", "Marmaris", "Washington", "Istanbul", "Havana", "Antakya", "Havana");
		Question question10 = new Question("What is the capital of Dominican Republic?", "Santo Domingo", "Washington", "Istanbul", "Manama", "Antakya", "Santo Domingo");
		Question question11 = new Question("What is the capital of Ecuador?", "Marmaris", "Washington", "Istanbul", "Manama", "Quito", "Quito");
		Question question12 = new Question("What is the capital of Jamaica?", "Kingston", "Washington", "Istanbul", "Manama", "Antakya", "Kingston");
		Question question13 = new Question("What is the capital of Norway?", "Marmaris", "Oslo", "Istanbul", "Manama", "Antakya", "Oslo");
		Question question14 = new Question("What is the capital of Russia?", "Oslo", "Moscow", "Istanbul", "Manama", "Antakya", "Moscow");
		Question question15 = new Question("What is the capital of Sudan?", "Marmaris", "Washington", "Istanbul", "Manama", "Khartoum", "Khartoum");
		Question question16 = new Question("What is the capital of Tajikistan?", "Dushanbe", "Washington", "Istanbul", "Manama", "Antakya", "Dushanbe");
		Question question17 = new Question("What is the capital of Uzbekistan?", "Marmaris", "Washington", "Istanbul", "Manama", "Tashkent", "Tashkent");
		Question question18 = new Question("What is the capital of Venezuela?", "Marmaris", "Caracas", "Istanbul", "Manama", "Antakya", "Caracas");
		Question question19 = new Question("What is the capital of Zimbabwe?", "Marmaris", "Washington", "Harare", "Manama", "Antakya", "Harare");
		Question question20 = new Question("What is the capital of Nigeria?", "Marmaris", "Abuja", "Istanbul", "Manama", "Antakya", "Abuja");
		
		questionsRepository.save(question1);
		questionsRepository.save(question2);
		questionsRepository.save(question3);
		questionsRepository.save(question4);
		questionsRepository.save(question5);
		questionsRepository.save(question6);
		questionsRepository.save(question7);
		questionsRepository.save(question8);
		questionsRepository.save(question9);
		questionsRepository.save(question10);
		questionsRepository.save(question11);
		questionsRepository.save(question12);
		questionsRepository.save(question13);
		questionsRepository.save(question14);
		questionsRepository.save(question15);
		questionsRepository.save(question16);
		questionsRepository.save(question17);
		questionsRepository.save(question18);
		questionsRepository.save(question19);
		questionsRepository.save(question20);
	}

}
