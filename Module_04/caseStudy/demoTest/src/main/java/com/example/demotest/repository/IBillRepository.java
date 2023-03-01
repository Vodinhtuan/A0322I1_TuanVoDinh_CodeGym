package com.example.demotest.repository;

import com.example.demotest.model.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBillRepository extends JpaRepository<Bill, Integer> {
    /*Page<Bill> findAllByProduct_ProductNameOrProduct_ProductType(@Param("keyword") String keyword, Pageable pageable);*/

    /*@Query(value = "select * from shop s where s.owner_name like %:keyword% or s.shop_type like %:keyword%", nativeQuery = true)
    List<Shop> findByKeyword(@Param("keyword") String keyword);*/

    /*@Query(value = "select b.* from bill b\n" +
            "join product p on b.product_id= p.product_id\n" +
            "join product_type pt on p.product_type_id = pt.id" +
            "where p.product_name like ?1 or pt.type_product like ?2"
            , countQuery= "select b.* from bill b\n" +
            "join product p on b.product_id= p.product_id\n" +
            "join product_type pt on p.product_type_id = pt.id" +
            "where p.product_name like ?1 or pt.type_product like ?2", nativeQuery= true)
    Page<Bill> getByKeyword(String keyword, Pageable pageable);*/

//    @Query(value = "select * from bill s where s.quantity like :keyword or s.description like :description", nativeQuery = true)
//    Page<Bill> findByKeyword(String keyword, String description, Pageable pageable);

    /*Query(value = "select s.* from bill s where s.quantity like ?1 or s.description like ?1"
            , countQuery = "select s.* from bill s where s.quantity like ?1 or s.description like ?1"
            ,nativeQuery = true)
    Page<Bill> findByKeyword(String keyword, String description, Pageable pageable);*/

    @Query(value = "select * from bill s where s.quantity like :keyword or s.description like :keyword", nativeQuery = true)
    Page<Bill> findByKeyword(@Param("keyword") String keyword, Pageable pageable);
}
