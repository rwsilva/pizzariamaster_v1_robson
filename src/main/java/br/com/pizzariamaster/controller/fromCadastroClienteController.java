package br.com.pizzariamaster.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.pizzariamaster.modelo.Clientes;
import br.com.pizzariamaster.util.JPAUtil;

@Controller
public class fromCadastroClienteController{

	@RequestMapping("/form")
	public String formulario() {

		System.out.println("executando uma logica com string MVC");

		return "formCadastroClientes";
	}

	@RequestMapping("/adicionaCliente")
	public String Adicionar(Clientes cliente) {
		
		System.out.println("cliente adicionado é : " + cliente.getCli_nome());	
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
	return "cliente-adicionado";
	}


	@RequestMapping("/listaClientes")
	public ModelAndView Lista() {
		EntityManager em = new JPAUtil().getEntityManager();
		
		String jpql = "select c from Clientes c";	
		TypedQuery<Clientes> query = em.createQuery(jpql, Clientes.class);
		List<Clientes> lista = query.getResultList();
		
		ModelAndView mv = new ModelAndView("lista");
		mv.addObject("todosCliente", lista);
	return mv;	
	}
}
