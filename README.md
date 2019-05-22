


# Improved Query Reformulation for Concept Location using CodeRank and Document Structures

Accepted Paper at ASE 2017
---------------------------------
```
Improved Query Reformulation for Concept Location using CodeRank and Document Structures
Mohammad Masudur Rahman and Chanchal K. Roy
```

**Abstract:** During software maintenance, developers usually deal with a significant number of software change requests. 
As a part of this, they often formulate an initial query from the request texts, and then attempt to map the concepts 
discussed in the request to relevant source code locations in the software system (a.k.a., concept location). 
Unfortunately, studies suggest that they often perform poorly in choosing the right search terms for a change task. 
In this paper, we propose a novel technique --ACER-- that takes an initial query, identifies appropriate search 
terms from the source code using a novel term weight --CodeRank, and then suggests effective reformulation to the 
initial query by exploiting the source document structures, query quality analysis and machine learning. 
Experiments with 1,675 baseline queries from eight subject systems report that our technique can improve 
71% of the baseline queries which is highly promising. Comparison with five closely related existing 
techniques in query reformulation not only validates our empirical findings but also demonstrates the 
superiority of our technique.

 **Download [this  <img src="http://homepage.usask.ca/~masud.rahman/img/pdf.png"
     alt="PDF" heigh="20px" width="20" />](http://homepage.usask.ca/~masud.rahman/papers/masud-ASE2017-pp.pdf)**



Subject Systems (8)
-------------------------------
1. ecf (154)
2.  eclipse.jdt.core (198)
3. eclipse.jdt.debug (154)
4.  eclipse.jdt.ui (309)
5. eclipse.pde.ui (302)
6. log4j (28)
7. sling (76)
8. tomcat70 (454)
 
**Total: 1675**

Materials Included
-----------------------------------------
**Baseline Method**
 - ```Query:``` Baseline queries
 - ```QE:``` Query Effectiveness achieved by the baseline queries

**ACER**
 - ```Query:``` Queries suggested by ACER
 - ```QE:``` Query Effectiveness achieved by the ACER queries
 
 **ACER (Method Signature Only)**
 - ```Query:``` Queries suggested by ACER using method signatures only
 - ```QE:``` Query Effectiveness achieved by ACER queries

 **ACER (Field Signature Only)**
 - ```Query:``` Queries suggested by ACER using field signatures only 
 - ```QE:``` Query Effectiveness achieved by ACER queries

 **ACER (Method Signature + Field Signature)**
 - ```Query:``` Queries suggested by ACER using method signatures + field signatures
 - ```QE:``` Query Effectiveness achieved by ACER queries
 
  **ACER-Query Difficulty Model**
 - Sampled training data
 - Query Difficulty prediction model
 

## Please cite our work as

```
@INPROCEEDINGS{ase2017masud, 
author={Rahman, M. M. and Roy, C. K.}, 
booktitle={Proc. ASE}, 
title={Improved Query Reformulation for Concept Location using CodeRank and Document Structures}, 
year={2017}, 
pages={428--439}}

```




## Something not working as expected?

Contact:  **Masud Rahman**  ([masud.rahman@usask.ca](mailto:masud.rahman@usask.ca))

OR

Create an issue from  [here](https://github.com/masud-technope/ACER-Replication-Package-ASE2017/issues/new)
