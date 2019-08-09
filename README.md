


# Improved Query Reformulation for Concept Location using CodeRank and Document Structures

Accepted Paper at ASE 2017   
---------------------------------
```
Improved Query Reformulation for Concept Location using CodeRank and Document Structures
Mohammad Masudur Rahman and Chanchal K. Roy
```
**Download this paper:**  [<img src="http://homepage.usask.ca/~masud.rahman/img/pdf.png"
     alt="PDF" heigh="16px" width="16px" />](http://homepage.usask.ca/~masud.rahman/papers/masud-ASE2017-pp.pdf)

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



Subject Systems (8)
-------------------------------
1. **ecf** (154)
2. **eclipse.jdt.core** (198)
3. **eclipse.jdt.debug** (154)
4. **eclipse.jdt.ui** (309)
5. **eclipse.pde.ui** (302)
6. **log4j** (28)
7. **sling** (76)
8. **tomcat70** (454)
 
**Total: 1,675**

Materials Included
-----------------------------------------
**Baseline Method**
 - ```Query:``` Baseline queries
 - ```QE:``` Query Effectiveness achieved by the baseline queries

**ACER-Proposed Method**
 - ```Query:``` Queries suggested by ACER
 - ```QE:``` Query Effectiveness achieved by the ACER queries
 - ```ACER (Method Signature Only)```
     - ```Query:``` Queries suggested by ACER using method signatures only
      - ```QE:``` Query Effectiveness achieved by ACER queries
 - ```ACER (Field Signature Only)```
     - ```Query:``` Queries suggested by ACER using field signatures only 
     - ```QE:``` Query Effectiveness achieved by ACER queries
- ```ACER (Method Signature + Field Signature)```
     - ```Query:``` Queries suggested by ACER using method signatures + field signatures
     - ```QE:``` Query Effectiveness achieved by ACER queries

**Queries & Goldset**
- ```bugIDs:``` Issue IDs of the selected change requests
- ```goldset:``` Ground truth for the selected change requests

**System Corpora & Lucene Indices**
- ```corpus:``` Source code (raw + preprocessed) of the subject systems, and their file mapping indices.
- ```lucene:``` Lucene index of all subject systems

**ACER Prototype & External Dependencies**
- ```acer-runner.jar:``` Working prototype of ACER
- ```candidates:``` Reformulation candidates generated by ACER
- ```models:``` Auxiliary data for a dependency library
- ```pp-data:``` Stop words for text preprocessing
- ```query-difficulty:``` Query difficulty metrics calculated for search queries
- ```samurai-data:``` Auxiliary data for token splitting with Samurai
- ```ACER-QD-Model:``` Artifacts of the developed query difficulty model
    - ```acer-qd-model-2019:``` ARFF model file
    - ```acer-model-header:``` ARFF model header
    - ```master-model-dataset:``` Query difficulty metrics dataset
    - ```resampling-*-*``` Query difficulty prediction results using resampled data
- ```ACER-query:``` Sample queries suggested by ACER 
- ```ACER-rank:``` Query Effectiveness (QE) of the ACER queries 

**Installing, Building & Execution**
- ```README:``` Tool overview, available operations and the required commands
- ```INSTALL:``` Steps of installation and system requirements for ACER

**Licensing & Others**
- ```LICENSE:``` Our artifacts are under MIT license
- ```CITATION:``` It shows how this work should be cited.
- ```Screenshots:``` It contains the screenshots of the available operations.

Available Operations
---------------------------
- ```getBaselinePerformance:``` Shows performances of the baseline queries
- ```getACERCandidateReformulations:``` Generates the reformulation candidates for the given queries 
- ```makeQueryDifficultyModel:``` Constructs query difficulty models for ACER
- ```getACERQueries:``` Delivers the reformulated queries using the candidates and the query difficulty model
- ```getACERPerformance:``` Shows the document retrieval performance of ACER queries
- ```getCandidatePerformance:``` Shows the document retrieval performance of ACER reformulation candidates
- ```getACERPerformanceQE:``` Shows the Query Effectiveness (QE) of ACER queries
- ```getCandidatePerformanceQE:``` Shows the Query Effectiveness (QE) of ACER reformulation candidates

Required Parameters for the Operations
--------------------------------------
- **-task** expects a task to be performed (e.g., ```getBaselinePerformance```)
- **-K** expects the number of top results to be analysed during evaluation, default is **100**
- **-candidateFolder** expects an existing empty folder within the home directory (e.g., ```test-candidates```)
- **-queryDiffFolder** expects an existing empty folder within the home directory (e.g., ```test-query-difficulty```)
- **-queryFileKey** expects a file identifier from ```ACER-query``` folder (e.g., ```acer-best-Aug08```)
- **-candidateKey** expects a candidate reformulation key (e.g., ```method-sig```, ```field-sig```, ```both-sig```)

Getting Started
-------------------------
Q1: How to install ACER tool?
-------------------------------------
- Execute git clone ```https://github.com/masud-technope/ACER-Replication-Package-ASE2017.git ACER```
- Run the tool from within the ```ACER``` directory.

Q2: How to reformulate queries with ACER tool?
--------------------------------------------------
Make sure that you have the queries within the **baseline** folder. Reformulating given queries with ACER involves three steps: (1) Generate **reformulation candidates**, (2) Construct a **query difficulty model**, and (3) Generate the **ACER queries**.

**Step I: Generate Reformulation Candidates**
```
java -jar acer-runner.jar  -task getACERCandidateReformulations -candidateFolder test-candidates
```
The above command generates four reformulation candidates for each given query : ```method-sig```, ```field-sig```, ```both-sig``` and ```base```, and stores them in the **test-candidates** directory. 

**Step II: Construct Query Difficulty Model**
```
java -jar acer-runner.jar  -task makeQueryDifficultyModel -candidateFolder test-candidates -queryDiffFolder test-query-difficulty
```
The above command calculates query difficulty metrics for the candidate queries, and stores them in **test-query-difficulty** folder. It also constructs query difficulty models and collects prediction results from them in the **ACER-QD-Model** directory.

**Step III: Generate ACER Queries**
```
java -jar acer-runner.jar  -task getACERQueries -candidateFolder test-candidates -queryFileKey test-acer-best-query
```
The above command delivers the best reformulation candidates as the ACER queries using the above query difficulty model, and stores them as **test-acer-best-query** in the **ACER-query** folder.

Q3: How to calculate the document retrieval performance of ACER queries?
--------------------------
```
java -jar acer-runner.jar  -task getACERPerformance -K 100 -queryFileKey test-acer-best-query
```
The above command shows the Top-100 accuracy (a.k.a., Hit@100), MAP and MRR of the ACER queries

Q4: How to calculate the document retrieval performance of ACER reformulation candidates?
-------------------------------------------
```
java -jar acer-runner.jar  -task getCandidatePerformance -candidateKey method-sig -K 100
```
The above command shows the Top-100 accuracy (a.k.a., Hit@100), MAP and MRR of the ACER reformulation candidates.

Q5: How to calculate the document retrieval performance of the baseline queries?
--------------------------------------------
```
java -jar acer-runner.jar  -task getBaselinePerformance -K 100
```
The above command shows the Top-100 accuracy (a.k.a., Hit@100), MAP and MRR of the baseline queries.

Q6: How to determine the query improvement and worsening of baseline by ACER queries?
-------------------------------
```
java -jar acer-runner.jar  -task getACERPerformanceQE -queryFileKey test-acer-best-query
```
The above command shows improvement, worsening and preserving of baseline queries by ACER 

Q7: How to determine the query improvement and worsening of baseline by ACER candidates?
------------------------------
```
java -jar acer-runner.jar  -task getCandidatePerformanceQE -candidateKey method-sig
```
The above command shows improvement, worsening and preserving of baseline queries by ACER candidates 


## Please cite our work as

```
@INPROCEEDINGS{ase2017masud, 
author={Rahman, M. M. and Roy, C. K.}, 
booktitle={Proc. ASE}, 
title={Improved Query Reformulation for Concept Location using CodeRank and Document Structures}, 
year={2017}, 
pages={428--439}}

```
**Download this paper:**  [<img src="http://homepage.usask.ca/~masud.rahman/img/pdf.png"
     alt="PDF" heigh="16px" width="16px" />](http://homepage.usask.ca/~masud.rahman/papers/masud-ASE2017-pp.pdf)


# Related Projects: [BLIZZARD](https://github.com/masud-technope/BLIZZARD-Replication-Package-ESEC-FSE2018), [STRICT](https://github.com/masud-technope/STRICT-Replication-Package), and [QUICKAR](https://github.com/masud-technope/QUICKAR-Replication-Package-ASE2016)


## Something not working as expected?

Contact:  **Masud Rahman**  ([masud.rahman@usask.ca](mailto:masud.rahman@usask.ca))

OR

Create an issue from  [here](https://github.com/masud-technope/ACER-Replication-Package-ASE2017/issues/new)
