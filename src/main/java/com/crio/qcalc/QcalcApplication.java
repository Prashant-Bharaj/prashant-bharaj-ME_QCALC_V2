package com.crio.qcalc;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator ob = new StandardCalculator();
		ob.add(Double.MAX_VALUE,173.0);
		System.out.println(ob.getResult());
	}

}
