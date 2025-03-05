package top.anyel.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.client.model.Client;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 05/03/2025
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
