<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.roslin.mwicks.spring.variation.autocomplete.AutocompleteDB"%>
<%

    AutocompleteDB db = new AutocompleteDB();
 
    String query = request.getParameter("q");
     
    List<String> ensemblgenes = db.getEnsemblIds(query);
 
    Iterator<String> iteratorensemblgenes = ensemblgenes.iterator();
    
    while(iteratorensemblgenes.hasNext()) {
    	
        String ensemblgene = (String) iteratorensemblgenes.next();

        out.println(ensemblgene);
    }
    
%>