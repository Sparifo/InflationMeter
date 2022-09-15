package com.example.demo.web.controller;

import com.example.demo.service.ImportXlsx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/import")
public class ImportController {

    private static final Logger logger = LoggerFactory.getLogger(ImportController.class);

    private ApplicationEventPublisher eventPublisher;
    private ImportXlsx importXlsx;

    @Value("${director.to.check}")
    private String directorToCheck;

    @Autowired
    public ImportController(ApplicationEventPublisher eventPublisher, ImportXlsx importXlsx) {
        this.eventPublisher = eventPublisher;
        this.importXlsx = importXlsx;
    }

    public ImportController() {
        super();
    }

    @GetMapping(value = "/")
    public ResponseEntity getImportXslx(final HttpServletResponse response) {

        importXlsx.checkFileExist(directorToCheck);

        return ResponseEntity.ok()
                .body("Work");
    }


}
