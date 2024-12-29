package com.selleniumexpress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selleniumexpress.entity.Song;
import com.selleniumexpress.utils.Utility;

public class UpdadateApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = Utility.getSessionFactory();

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Song song = session.get(Song.class, 1);

		song.setSinger("Sukhivender");
		song.setSongName("7 samunder");

		session.getTransaction().commit();

		session.close();

		Session session2 = sessionFactory.openSession();

		session2.beginTransaction();

		session2.get(Song.class, 1);

		song.setSongName("samunder-updated1234");

		session2.merge(song);

		session2.getTransaction().commit();

	}
}
