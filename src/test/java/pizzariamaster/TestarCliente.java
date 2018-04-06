package pizzariamaster;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.pizzariamaster.modelo.Clientes;
import br.com.pizzariamaster.util.JPAUtil;

public class TestarCliente {
	
	public static void main(String[] args) {
		
		Clientes cliente = new Clientes();
	
		cliente.setCli_nome("rosemery tavares");
		cliente.setCli_rua("av. vice presidente jose alencar, 1515");
		cliente.setCli_bairro("rio de janeiro");
		cliente.setCli_telefone("2665-7913");
		cliente.setCli_Data_cad(Calendar.getInstance());
	/*	
		cliente.setCli_nome("rosangela pires tavares");
		cliente.setCli_rua("rua lagoa de itauna, 120");
		cliente.setCli_bairro("barra da tijuca");
		cliente.setCli_telefone("2665-4932");
		cliente.setCli_Data_cad(Calendar.getInstance());
		*/
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
	}
	

}
