package com.costara.project_dikaion.config;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.costara.project_dikaion.entities.Category;
import com.costara.project_dikaion.entities.Order;
import com.costara.project_dikaion.entities.User;
import com.costara.project_dikaion.entities.enums.OrderStatus;
import com.costara.project_dikaion.repositories.CategoryRepository;
import com.costara.project_dikaion.repositories.OrderRepository;
import com.costara.project_dikaion.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Bethy White", "bethy@gmail.com", "8888-8888", "54321");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "7777-7777", "98745");
		
		Order o1 = new Order(null, Instant.parse("2024-03-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2024-06-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2024-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}