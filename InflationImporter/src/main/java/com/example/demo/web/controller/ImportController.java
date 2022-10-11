package com.example.demo.web.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ImportXlsx;
import com.example.demo.service.ReadXlsx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/import")
public class ImportController {

    private static final Logger logger = LoggerFactory.getLogger(ImportController.class);

    private ApplicationEventPublisher eventPublisher;
    private ImportXlsx importXlsx;
    private ReadXlsx readXlsx;

    @Value("${director.to.check}")
    private String directorToCheck;

    @Autowired
    public ImportController(ApplicationEventPublisher eventPublisher, ImportXlsx importXlsx, ReadXlsx readXlsx) {
        this.eventPublisher = eventPublisher;
        this.importXlsx = importXlsx;
        this.readXlsx = readXlsx;
    }

    public ImportController() {
        super();
    }

    @GetMapping(value = "/")
    public ResponseEntity getImportXslx(final HttpServletResponse response) {

        Optional<Object> fileXlsxOptional = importXlsx.checkFileExist(directorToCheck);

        if(fileXlsxOptional.isPresent()){

            List<File> fileXls = (List<File>)fileXlsxOptional.get();

            for(File xsl : fileXls) {
                List<Product> products = readXlsx.readFile(xsl.getAbsolutePath());
            }


            return ResponseEntity.ok()
                    .body("Work");
        }else{
            return ResponseEntity.badRequest()
                    .body("Directory is empty");
        }


    }


}
