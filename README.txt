##############################
#Main Class
##############################
PmcOpenAccessRDFHandlerWithThreads
Usage: -in <xml papers dir> -out <output dir> -sections 
-all or -rdfAndAnnotations or any of -rdf -whatizit -ncboAnnotator -bio2rdf (all are optional, if none one present -all)
-pipeline <pipeline> (optional, whatizitEuropePmcAll by default, only used when -whatizit or all are present) Pipeline to be used by Whatizit AO annotator (values: whatizitEuropePmcGenesProteins, whatizitSwissprot, whatizitEuropePmcAll, etc)" + 
-sections (optional) If present, paper sections will be rdfized");

Recommended flow
1. PmcOpenAccessRDFHandlerWithThreads -in <input dir> -out <output dir> -rdf -sections
2. PmcOpenAccessRDFHandlerWithThreads -in <input dir> -out <output dir> -ncboAnnotator
3. PmcOpenAccessRDFHandlerWithThreads -in <input dir> -out <output dir> -whatizit -pipeline whatizitEuropePmcAll

##############################
#config.properties
##############################
config.properties has information about the dirs where the WSDL for Whatizit is located, 
configure that first

For whatizit, GO and CHEBI can be included or not, check config.properties

For NCBO Annoator is possible to include only or exclude some ontologies. You will need to specify
the enumeration name of the ontology, see names at ws.biotea.ld2rdf.util.ncbo.annotator.Ontology

IMPORTANT: Remember to point to your local copy of whatizit.wsdl.dir

##############################
#Running environment
##############################
###Input and Output resources
You will need an input dir with all dtds required, as those in /pmc_dtds; 
You will need in the same input directory the NXML files that you want to process 
(a sample file is provided in /temp AAPS_J_2008_Apr_2_10(1)_193-199.nxml)
You will need an output directory with one subdirs output/AO_annotations

###jar file 
Make sure the jar, config.properties, log4j.properties, server-bindings.xml, and whatizit.wsdl 
are all in the same directory, one next to each other.
Modify config.properties and log4j.properties to point to the right paths in your machine

###logs
Do not forget to modify log4j.properties according to what you want to include in the logs and
where you want to locate them
  
##############################
#Running options, some examples
##############################
RDF generation for articles only
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -rdf

RDF generation for articles only, including sections
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -rdf -sections

RDF generation for NCBO Annotator only (RDF for article and sections must already exist in the output directory)
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -ncboAnnotator

RDF generation for Whatizit only (RDF for article and sections must already exist in the output directory)
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -pipeline whatizitEuropePmcAll -whatizit

RDF for article, sections, and annotations
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp rdfAndAnnotations -sections -pipeline whatizitEuropePmcAll

All
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -pipeline whatizitEuropePmcAll -all