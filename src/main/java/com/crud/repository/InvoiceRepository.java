package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
