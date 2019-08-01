package ots.andy.group.horizonsproj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ots.andy.group.horizonsproj.entities.Child;

import java.util.List;

@Repository
public interface ChildRepository extends JpaRepository<Child, Integer> {


    List<Child> findByFirst(String first);
    List<Child> findById(int id);

    void deleteByFirst(String first);
}
