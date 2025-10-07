package com.KrishnaBabu.demo.Controller;


import org.springframework.web.bind.annotation.*;

    @RestController
    public class BasicWebAnnotation {
        @GetMapping
        public String getEndpoint(){

            return "Get End point is triggred Baburavi";
        }

        @PostMapping
        public String PostData(){
            return "Post Endpoint is Triggred Baburavi";
        }

        @PutMapping
        public String putEndpoint(){
            return "Put Endpoint is Triggred Baburavi";
        }

        @DeleteMapping
        public String deleteEndpoint(){

            return "Delete Endpoint is triggred Baburavi";
        }

        @PatchMapping
        public String patchEndpoint(){

            return "Patch Mapping Endpoint Baburavi";
        }
    }

