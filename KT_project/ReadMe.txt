{\rtf1\ansi\ansicpg1252\cocoartf1561\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red52\green52\blue52;}
{\*\expandedcolortbl;;\cssrgb\c26667\c26667\c26667;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 COMP90049 Knowledge Technology Project - Approximate String Matching\
\
The code is written in java.\
The code is written to analyse the precision and recall of two approximate string matching algorithms on a set of data.\
\
Dataset:\
1) misspell.txt : set of misspelled data which is 716 words\
2) dictionary.txt: Set of 400k words\
3) correct.txt : Set of 716 words which are the correct word for every misspelled words in 			   misspelled.txt\
\
The Project contains three java files:\
1) Soundex.java : The file contains the code for the sounder algorithm. The code has been taken from 			    
\fs26 \cf2 \expnd0\expndtw0\kerning0
https://goo.gl/KPJcti\
\
2)EditDistance.java: The file contains the code for the edit distance algorithm. the code has 				  been taken from https://goo.gl/5tZ6eT\
\
3)main.java: This file reads all the data, create an instance for above mentioned algorithms 		      and execute it\
\
Working:\
1)Download the file\
2)Open on any compiler\
3) Execute\
\
Output:\
\pard\pardeftab720\partightenfactor0

\f1\fs22 \cf0 \kerning1\expnd0\expndtw0 Edit Distance calculations:\
Number of predicted: 6642.0\
Number of correct: 285.0\
Precision: 4.29 \
Recall: 39.80 \
\
Soundex calculations:\
Number of predicted: 107945.0\
Number of correct: 423.0\
Precision: 0.39 \
Recall: 59.08 \
\
}