package com.session3.JACM_test_WS.IRepository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.session3.JACM_test_WS.Dto.Vuelos;
import com.session3.JACM_test_WS.Entity.Schedules;

@Repository
public interface ISchedulesRepository extends IBaseRepository<Schedules,Long>{

	@Query(value="SELECT\r\n"
			+ "sch.id,\r\n"
			+ "dairport.name AS \"origen\",\r\n"
			+ "aairport.name AS \"destino\",\r\n"
			+ "sch.date AS \"fecha\",\r\n"
			+ "sch.time AS \"hora\",\r\n"
			+ "sch.flight_number AS \"numero\",\r\n"
			+ "sch.economy_pryce AS \"precio\",\r\n"
			+ "ai.total_seats AS \"asientos\"\r\n"
			+ "FROM schedules AS sch\r\n"
			+ "INNER JOIN aircrafts AS ai ON ai.id = sch.aircraft_id\r\n"
			+ "INNER JOIN routes AS r ON r.id = sch.route_id\r\n"
			+ "INNER JOIN airports AS aairport ON aairport.id = r.arrival_airportid\r\n"
			+ "INNER JOIN airports AS dairport ON dairport.id = r.departure_airportid\r\n"
			+ "WHERE dairport.name = :origen AND aairport.name = :destino AND sch.date BETWEEN :fecha1 AND :fecha2", nativeQuery=true)
	List<Vuelos> filtroVuelos(@Param("origen") String origen, @Param("destino")String destino, @Param("fecha1") LocalDate fecha1, @Param("fecha2") LocalDate fecha2);
}
