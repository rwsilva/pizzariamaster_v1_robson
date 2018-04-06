package br.com.pizzariamaster.controller;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


	//@RequestMapping("ListaClientes")
	//public ModelAndView Lista() {
		//Clientes cliente = new Clientes();
		
		//EntityManager em = new JPAUtil().getEntityManager();
		//TypedQuery<Clientes> query = em.createQuery("select c from clientes c", Clientes.class);
		
		//em.getTransaction().begin();
		//List<Clientes> lista = (List<Clientes>) em.find(Clientes.class, 2);
		//em.getTransaction().commit();
		
		//List<Clientes> results = query.getResultList();
		
		//ModelAndView mv = new ModelAndView("lista");
		//mv.addObject("todosCliente", lista);
	//return mv;	
	//}
}
