package com.rakesh.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.rakesh.demo.dto.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{

}
