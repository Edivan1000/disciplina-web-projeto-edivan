package br.ueg.desenvolvimento.web.projeto_edivan;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    //List<Aluno> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT a FROM Aluno a WHERE LOWER(a.nome) LIKE LOWER(CONCAT('%', :nome, '%'))")
    List<Aluno> buscarPorNome(@Param("nome") String nome);
    }//ALTERED BY EDIVAN JUNIOR