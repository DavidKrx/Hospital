package dad.proyect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dad.proyect.tablas.Articulos;

public class Main {

	public static void main(String arg[]) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Articulos.class).buildSessionFactory();
		
		Session sesion=factory.openSession();
		
		try {
			Articulos articulo1=new Articulos("Celereales", "Trigo inflado", "Salon 2", 40);
			sesion.beginTransaction();
			sesion.save(articulo1);
			sesion.getTransaction().commit();
			System.out.print("Registro insertado");
			sesion.close();
		} finally {
			factory.close();
		}
		
	} 
}
