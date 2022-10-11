package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ImportXlsx {

    private static final Logger logger = LoggerFactory.getLogger(ImportXlsx.class);

    public Optional<Object> checkFileExist(String filePathString){
        File directory = new File(filePathString);
        if(directory.exists() && directory.isDirectory()){
            return Optional.of(Arrays.stream(directory.list()).toList());
        }
//
//
//        if(f.exists() && !f.isDirectory()) {
//            return Optional.of(f);
//        }
        return Optional.empty();
    }



}
