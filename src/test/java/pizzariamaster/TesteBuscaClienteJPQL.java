package pizzariamaster;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.pizzariamaster.modelo.Clientes;
import br.com.pizzariamaster.util.JPAUtil;


public class TesteBuscaClienteJPQL {
	
	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Clientes cliente = new Clientes();
		cliente.setCli_id(3);
		
		String jpql ="select c from clientes c";
		TypedQuery<Clientes> query = em.createQuery(jpql, Clientes.class);
		//query.setParameter("pCliente", cliente.getCli_id());
		
		//List<Clientes> resultado =  query.getResultList();
		
		List<Clientes> results = query.getResultList();
				
		for (Clientes cli : results) {
			System.out.println("Nome: " + cli.getCli_nome());
			System.out.println("Id  : " + cli.getCli_id());
		}

		em.getTransaction().commit();
		em.close();
	}
}
