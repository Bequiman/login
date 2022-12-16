package com.example.simplifica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import com.example.simplifica.model.Pergunta;
import com.example.simplifica.model.PerguntaForm;
import com.example.simplifica.model.Resultado;
import com.example.simplifica.repository.PerguntaRepository;
import com.example.simplifica.repository.ResultadoRepository;

public class QuizService {
    @Autowired
	Pergunta pergunta;
	@Autowired
	PerguntaForm pForm;
	@Autowired
	PerguntaRepository pRepo;
	@Autowired
	Resultado resultado;
	@Autowired
	ResultadoRepository rRepo;

		
	public int getResult(PerguntaForm qForm) {
		int correct = 0;		
		for(Pergunta q: qForm.getPerguntas())
			if(q.getResposta() == q.getResposta())
				correct++;
		
		return correct;
	}

    public void saveScore(Resultado resultado) {
		Resultado saveResult = new Resultado();
		saveResult.setUsuario(resultado.getUsuario());
		saveResult.setTotalCorretas(resultado.getTotalCorretas());
		rRepo.save(saveResult);
	}
	
	public List<Resultado> getTopScore() {
		List<Resultado> sList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorretas"));		
		return sList;
	}
}
