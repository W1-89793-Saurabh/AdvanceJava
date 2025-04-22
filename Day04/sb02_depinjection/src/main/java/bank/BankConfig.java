package bank;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sunbeam.Account;
import com.sunbeam.AccountImpl;
import com.sunbeam.Person;
import com.sunbeam.PersonImpl;

@Configuration
public class BankConfig {
	@Bean
	public Person p2() {
		PersonImpl p = new PersonImpl();
		p.setName("Nitin");
		p.setAge(50);
		return p;
	}

	@Bean
	public Account a3() {
		AccountImpl a = new AccountImpl();
		a.setId(301);
		a.setType("Saving");
		a.setBalance(80000.0);
		a.setAccHolder(p2());
		return a;
	}
	
	@Bean
	public Account a4() {
		AccountImpl a = new AccountImpl(302, "Current", 200000.0, p2());
		return a;
	}

	@Bean
	public Account a5(@Qualifier("p1") Person p) {
		AccountImpl a = new AccountImpl(103, "Fixed", 300000.0, p);
		return a;
	}
}

