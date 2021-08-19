package br.pucpr.servico;

//CRUD
//CREATE, READ, UPDATE, DELETE
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {


    @GetMapping("/consulta/{id}")
    public Produto consulta(@PathVariable("id") int id){
        Produto a = new Produto();
        a.setId(id);
        a.setNome("Renan");
        return a;
    }

    @GetMapping("/consulta")
    public List<Produto> consultaTodos(){
        Produto a = new Produto();
        Produto b = new Produto();
        List<Produto> produtos = new ArrayList<Produto>();
        a.setId(1);
        a.setNome("Renan");
        b.setId(2);
        b.setNome("Claudio");
        produtos.add(a);
        produtos.add(b);
        return produtos;
    }

    @PostMapping("/cadastrar")
    public Produto criarCadastro(@RequestBody Produto produto){
        Produto p = new Produto();
        p = produto;

        return produto;
    }

    @PutMapping("/atualizar")
    public Produto atualizarProdutos(@RequestBody Produto produto){
        Produto p = new Produto();
        p.setNome("Renan");
        p.setId(1);
        p.setNome(produto.getNome());
        p.setId(produto.getId());
        return p;
    }

    @DeleteMapping("deletar/{id}")
    public List<Produto> deletarProdutos(@PathVariable("id") int id){
        Produto a = new Produto();
        Produto b = new Produto();
        List<Produto> produtos = new ArrayList<Produto>();
        a.setId(1);
        a.setNome("Renan");
        b.setId(2);
        b.setNome("Claudio");
        produtos.add(a);
        produtos.add(b);

        produtos.removeIf(p -> p.getId() == id);

        return produtos;
    }

}
