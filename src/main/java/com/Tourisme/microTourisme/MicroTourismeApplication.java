package com.Tourisme.microTourisme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.Tourisme.microTourisme.Model.Services.Voyage;
import com.Tourisme.microTourisme.Model.Services.Voyageur;
import com.Tourisme.microTourisme.Model.Services.Repository.EvaluationRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageRepository;
import com.Tourisme.microTourisme.Model.Services.Repository.VoyageurRepository;


@SpringBootApplication
public class MicroTourismeApplication implements CommandLineRunner {
	
	
	
	@Autowired
	private VoyageRepository voyagerepository;
	public static void main(String[] args) {
		SpringApplication.run(MicroTourismeApplication.class, args);
	}
	
	public void run (String... args) throws Exception{
		/*
		evaluationRepository.findAll().forEach(v->{
    System.out.println(v.toString());
});*/	/*
		voyagerepository.save(new Voyage("Rabat, la capitale du Maroc, est bâtie sur les rives du fleuve Bouregreg et de l'océan Atlantique. Elle est connue pour ses sites d'intérêt, qui illustrent tant le patrimoine islamique que colonial français, notamment la kasbah des Oudayas","Culture","Rabat",1000));
		voyagerepository.save(new Voyage("Perle bleue : du fait de sa médina peinte de toutes les teintes de bleu, Chefchaouen est très certainement l’une des villes marocaines les plus féériques. Le Voyage est disponible entre le 04 Mars et le 05 Avril de chaque année","Nature","Chefchaouen",2000));
		voyagerepository.save(new Voyage("Partez à la découverte des plus beaux paysages du littoral sud marocain. Laissez-vous tenter par un séjour à Dakhla au cœur d'un havre de paix entre lagune et océan… Le voyage est disponible annuellement le début du mois Février , Aout et Decembre","Désert","Dakhla",2500));
		voyagerepository.save(new Voyage("Inscrit sur la liste du patrimoine mondial de l'UNESCO, Aït-ben-Haddou est un ksar du Maroc  dans la province","Culture","Ait Benhaddou",2500));
		voyagerepository.save(new Voyage("Sans doute l’une des plus belles villes impériales du Maroc, celle que les puristes qualifieront de «vraie ville marocaine», avec une ambiance et une architecture authentiques. La vieille ville classée au patrimoine mondial de l’UNESCO concentre un important patrimoine culturel, partagé entre souks traditionnels, musées et medersas (écoles coraniques).","Culture","Fès",1500));
		voyagerepository.save(new Voyage("tourisme, vie quotidienne… La nouvelle capitale du grand sud, avec son aéroport international qui transporte les touristes européens au porte du désert en 2 heures de vols.","Désert","Ouarzazat",2500));

		
	
/*

 * 
 *spring.datasource.url=jdbc:postgresql://ec2-54-86-170-8.compute-1.amazonaws.com:5432/d35ju8fv6dhi8n
spring.datasource.username=ddgfcsiovyteqi
spring.datasource.password=5bef11f72fb923a4bd7c2fa204fa75715268f0f649e181948cb417abdc455560
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto = update

 * server.port=9090

spring.datasource.url=jdbc:mysql://localhost:3306/participationschema?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database=MYSQL
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect*/
} }
