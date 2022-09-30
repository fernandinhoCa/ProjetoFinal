package testes;

import entidades.Categoria;
import persistencia.CategoriaDAO;


public class testeCategoria {
    /*public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Filme");
        categoria.setTipo('F');
        
        CategoriaDAO.inserir(categoria);
    }*/
    
    /* public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Senac");
        categoria.setTipo('F');
        
        categoria.setId(1);
         System.out.println(CategoriaDAO.alterar(categoria));
    }*/
     
      public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Senac");
        categoria.setTipo('F');
        
        categoria.setId(1);
         System.out.println(CategoriaDAO.excluir(1));
    }
}
