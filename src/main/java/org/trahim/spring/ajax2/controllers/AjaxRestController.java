package org.trahim.spring.ajax2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trahim.spring.ajax2.entities.Product;
import org.trahim.spring.ajax2.models.ProductModel;

import java.util.List;

@RestController
@RequestMapping("api/ajaxrest")
public class AjaxRestController {

    @GetMapping(value = "demo1", produces = MimeTypeUtils.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> demo1() {
        try {
            return new ResponseEntity<>("Demo 1 from service", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping(value = "demo2/{fullName}", produces = MimeTypeUtils.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> demo2(@PathVariable String fullName) {
        try {
            return new ResponseEntity<>("Hi " + fullName, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping(value = "demo3", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> demo3() {
        try {
            ProductModel productModel = new ProductModel();
            return new ResponseEntity<>(productModel.find(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
        }
    }


    @GetMapping(value = "demo4", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> demo4() {
        try {
            ProductModel productModel = new ProductModel();
            return new ResponseEntity<>(productModel.findAllProduct(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
