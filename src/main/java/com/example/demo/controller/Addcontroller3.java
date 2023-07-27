package com.example.demo.controller;
import com.example.demo.model.AddModels3;
import com.example.demo.model.Wishlist;
import com.example.demo.repository.Wishrepo;
import com.example.demo.service.Addservice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Addcontroller3 {
	@Autowired
     Addservice3 stuService;
	@Autowired
	Wishrepo wishRep;
    @PostMapping("/addDetails")
    public ResponseEntity<String> addInfo(@RequestBody AddModels3 st) {
            stuService.saveDetails(st);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Details added successfully");
    }

    @GetMapping("/showDetails")
    public ResponseEntity<List<AddModels3>> fetchDetails() {
        List<AddModels3> details = stuService.getDetails();
        return new ResponseEntity<>(details, HttpStatus.OK);
    }

    @PutMapping("/updateDetails")
    public ResponseEntity<String> updateInfo(@RequestBody AddModels3 st1) {
        try {
            stuService.updateDetails(st1);
            return ResponseEntity.ok("Details updated successfully.");
        } catch (Addservice3.DetailNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Details not found.");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while updating the details.");
        }
    }
    @DeleteMapping("/deleteDetails/{id}")
	private String deletebook(@PathVariable int id) {
		return stuService.deleteDetails(id);
	}
    @PostMapping("/addtoWishlist")
    public String addtoWishlist(@RequestBody Wishlist book) {
    	wishRep.save(book);
    	return "Added to wishlist"; 
    }
    @GetMapping("/view/wishlist")
    public List<Wishlist> getAllWishlist() {
        return wishRep.findAll();
    }
    
    @DeleteMapping("/wishdelete/{id}")
    public String deleteWishbook(@PathVariable int id)
	{
		wishRep.deleteById(id);
		return "Removed";
	}
    
}
