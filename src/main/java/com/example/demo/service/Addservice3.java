package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.AddModels3;
import com.example.demo.repository.Addrepository3;

import java.util.List;
@Service
public class Addservice3 {
    @Autowired
   Addrepository3 stuRepo; // Assuming CrudDemorepo is the repository class

    public AddModels3 saveDetails(AddModels3 st) {
        // Your implementation to save details here
        // You can check for existing records, throw DetailNotFoundException, and save the details in the repository
        return stuRepo.save(st);
    }

    public List<AddModels3> getDetails() {
        return stuRepo.findAll();
    }

    public AddModels3 updateDetails(AddModels3 st1) {
        // Your implementation to update details here
        // You can check for the existence of the record, throw DetailNotFoundException, and update the details in the repository
        return stuRepo.saveAndFlush(st1);
    }

    public String deleteDetails(int id) {
		stuRepo.deleteById(id);
		return "Deleted Successfully";
	}

    // Define a nested exception class (DetailNotFoundException) if necessary
    public static class DetailNotFoundException extends RuntimeException {
        public DetailNotFoundException(String message) {
            super(message);
        }
    }
}
