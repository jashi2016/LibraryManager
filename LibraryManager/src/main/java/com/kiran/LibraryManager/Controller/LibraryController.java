package com.kiran.LibraryManager.Controller;

import com.kiran.LibraryManager.Model.Library;
import com.kiran.LibraryManager.Service.LibraryInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("library")
public class LibraryController {

    @Autowired
    private LibraryInt libraryInt;

    @PostMapping("/add")
    public ResponseEntity<Library> addLibrary(@RequestBody Library library){
        Library library1 = libraryInt.save(library);
        return new ResponseEntity<>(library1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Library>> getAllLibraries(){
        List<Library> l = libraryInt.getAllLibraries();
        return new ResponseEntity<>(l,HttpStatus.OK);
    }
}
