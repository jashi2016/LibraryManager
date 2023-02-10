package com.kiran.LibraryManager.Service;

import com.kiran.LibraryManager.Model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryIntImpl implements LibraryInt{
    List<Library> libraries = new ArrayList<>();
    @Override
    public Library save(Library library) {
        libraries.add(library);
        return library;
    }

    @Override
    public List<Library> getAllLibraries() {
        return libraries;
    }
}
