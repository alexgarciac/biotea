#Biotea
======
RDF as an Interface to scientific publications.

Read more at http://www.jbiomedsem.com/content/4/S1/S5

##Main Class
PmcOpenAccessRDFHandlerWithThreads

Usage: 

-in <xml papers dir> -out <output dir> -sections 

-all or -rdfAndAnnotations or any of -rdf -whatizit -ncboAnnotator -bio2rdf (all are optional, if none one present -all)

-pipeline <pipeline> (optional, whatizitEuropePmcAll by default, only used when -whatizit or all are present) Pipeline to be used by Whatizit AO annotator (values: whatizitEuropePmcGenesProteins, whatizitSwissprot, whatizitEuropePmcAll, etc)

-sections (optional) If present, paper sections will be rdfized

##Recommended flow
1. PmcOpenAccessRDFHandlerWithThreads -in <input dir> -out <output dir> -rdf -sections
2. PmcOpenAccessRDFHandlerWithThreads -in <input dir> -out <output dir> -ncboAnnotator
3. PmcOpenAccessRDFHandlerWithThreads -in <input dir> -out <output dir> -whatizit -pipeline whatizitEuropePmcAll

Note: Whatizit has not been updated lately so annotations will be out of sync with current versions of the ontologies used there.

##config.properties
* config.properties has information about the dirs where the WSDL for Whatizit is located, configure that first. If you are not going to use Whatizit annotations then that value will not be used.
* For whatizit annotator, ontologies that are also included in NCBOAnnotator, i.e., GO and CHEBI, can be included or not, check properties whatizit.CHEBI and whatizit.GO. By default they are set to true so they will be processed.
* For NCBO Annotator is possible to include only (ncbo.annotator.include.only) or exclude some ontologies (ncbo.annotator.exclude). You will need to specify the name of the ontology, see names at ontologies.properties. By default ICD9 and NCBITaxon are excluded.

IMPORTANT: If you are annotating with Whatiziti, remember to point to your local copy of whatizit.wsdl.dir

##Running environment
###Input and Output resources
* You will need an input dir with all dtds required, as those in /pmc_dtds; 
* You will need in the same input directory the NXML files that you want to process (a sample file is provided in /temp AAPS_J_2008_Apr_2_10(1)_193-199.nxml)
* You will need an output directory with one subdir output/AO_annotations

###jar file 
* Make sure the jar, config.properties, log4j.properties, server-bindings.xml, and whatizit.wsdl are all in the same directory, one next to each other.
* Modify config.properties and log4j.properties to point to the right paths in your machine

###logs
* Do not forget to modify log4j.properties according to what you want to include in the logs and where you want to locate them

##Running options, some examples
* RDF generation for articles only
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -rdf

* RDF generation for articles only, including sections
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -rdf -sections

* RDF generation for NCBO Annotator only (RDF for article and sections must already exist in the output directory)
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -ncboAnnotator

* RDF generation for Whatizit only (RDF for article and sections must already exist in the output directory)
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -pipeline whatizitEuropePmcAll -whatizit

* RDF for article, sections, and annotations
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp rdfAndAnnotations -sections -pipeline whatizitEuropePmcAll

* All (possible but not recommended)
-in D:\workspace\biotea_rdf4pmc\temp\toProcess -out D:\workspace\biotea_rdf4pmc\temp -pipeline whatizitEuropePmcAll -all
