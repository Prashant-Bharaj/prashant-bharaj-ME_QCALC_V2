package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator ob = new StandardCalculator();
		ob.add(1,1);
		System.out.println(ob.getResult());
	}

}
