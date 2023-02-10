package com.kiran.LibraryManager.Service;

import com.kiran.LibraryManager.Model.Library;

import java.util.List;

public interface LibraryInt {
    Library save(Library library);

    List<Library> getAllLibraries();
}
