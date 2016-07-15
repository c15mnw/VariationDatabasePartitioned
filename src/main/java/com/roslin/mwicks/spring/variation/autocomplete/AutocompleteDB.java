package com.roslin.mwicks.spring.variation.autocomplete;

import java.io.File;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.core.io.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import com.roslin.mwicks.utility.FileUtil;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Service
public class AutocompleteDB {
	
    public static final Logger LOG = LoggerFactory.getLogger(AutocompleteDB.class);

    
    public AutocompleteDB() {
    }
    
    
    public List<String> getEnsemblIds(String query) {
    	
    	LOG.trace("AutocompleteDB - getEnsemblIds");

    	final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    	
    	Resource resourceGeneNames = applicationContext.getResource("classpath:ensembl_gene_names.csv");
    	
    	List<String> matched = new ArrayList<String>();

		try {

			File genesFile = resourceGeneNames.getFile();

	        List<String> genesFileList;
        
			genesFileList = FileUtil.readRecords(genesFile);
	    	Iterator<String> iteratorFile = genesFileList.iterator();

	    	int matchCount = 0;

	    	while (iteratorFile.hasNext()) {
	    		
	    		String strGeneName = iteratorFile.next();
	    		if ( strGeneName.endsWith(query) ) {

	    			matchCount++;
	    			matched.add(strGeneName);
	    		}
	    		if ( matchCount > 9) {
	    			break;
	    		}
	    	}
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}

    	return matched;
    }
}
