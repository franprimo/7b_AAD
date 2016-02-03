import org.hibernate.Session;


public class Program {

	public static void main(String[] args) {
		
		Session session = HibernateUtilities.getSessionFactory().openSession();	
		
		
		//GUARDAR USUARIOS
		//Para empezar, tenemos que abrir una transaccion.
		session.beginTransaction();
		
		//Creamos un nuevo usuario.
		Usuario u = new Usuario();
		u.setNombre("Francisco");
		u.getDatosKm().setObjetivo(30);
		u.getDatosKm().setTotal(100);
		
		//A continuacion, tenemos que hacer un save del objeto creado.
		session.save(u);
		
		//Y ahora hacemos un commit de lo que hemos realizado.
		session.getTransaction().commit();
		
		//Y por ultimo cerramos la sesion y la factory.
		session.close();
		HibernateUtilities.getSessionFactory().close();
		//--------------------------------------------
		
		/*
		session.beginTransaction();
		
		//Utilizamos el metodo get() de session al que le pasamos como parametro la clase del objeto
		//que vamos a mapear y el identificador.
		Usuario u = session.get(Usuario.class, 1);
		
		//Lo mostramos por pantalla.
		System.out.println("Hemos recuperado a "+u.getNombre()+" con objetivo "+u.getObjetivo()+" de un total de "+u.getTotal());

		//Hacemos un commit.
		session.getTransaction().commit();
		
		//Cerramos sesion y factory.
		session.close();
		HibernateUtilities.getSessionFactory().close();
		*/
	}

}
