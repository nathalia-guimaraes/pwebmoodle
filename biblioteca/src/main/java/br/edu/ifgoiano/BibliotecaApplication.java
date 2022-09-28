package br.edu.ifgoiano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifgoiano.entidade.Livro;
import br.edu.ifgoiano.repository.LivroRepository;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner{
	
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Criar registros de Livros
		
		Livro livro1 = new Livro();
		livro1.setNome("O Poder da Ação");
		livro1.setAutor("Paulo Vieira");
		livro1.setIsbn("134245");
		
		Livro livro2 = new Livro();
		livro2.setNome("Quem Pensa Enriquece - O Legado");
		livro2.setAutor("Napoleon Hill");
		livro2.setIsbn("865769");
		
		Livro livro3 = new Livro();
		livro3.setNome("Pai Rico Pai Pobre");
		livro3.setAutor("Robert T. Kiyosaki");
		livro3.setIsbn("215698");
		
		Livro livro4 = new Livro();
		livro4.setNome("Do Mil Ao Milhão - Sem Cortar o Cafezinho");
		livro4.setAutor("Thiago Nigro");
		livro4.setIsbn("326513");
		
		Livro livro5 = new Livro();
		livro5.setNome("O Poder do Hábito");
		livro5.setAutor("Charles Duhigg");
		livro5.setIsbn("259785");
		
		livroRepository.save(livro1);
		livroRepository.save(livro2);
		livroRepository.save(livro3);
		livroRepository.save(livro4);
		livroRepository.save(livro5);
		
	}

}
