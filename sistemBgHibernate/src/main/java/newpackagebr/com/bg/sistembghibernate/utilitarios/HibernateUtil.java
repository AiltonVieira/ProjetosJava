/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackagebr.com.bg.sistembghibernate.utilitarios;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;




public class HibernateUtil {
    private static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();

	public static SessionFactory getFabricaDeSessoes() {
		return fabricaDeSessoes;
	}

	private static SessionFactory criarFabricaDeSessoes(){
		try{
			Configuration configuracao = new Configuration().configure();

			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();

			SessionFactory fabrica  = configuracao.buildSessionFactory(registro);

			return fabrica;

		}catch(HibernateException ex){
			System.err.println("A fabrica não foi criada" + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}
}
