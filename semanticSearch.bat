python search.py %1 %2 | python getText.py | java -cp src/htmlparser-1.4/htmlparser-1.4.jar;src Spotlight | java -cp graphGenerator GraphGenerator | java -jar similarity.jar %1 && java -jar ranking.jar %1 %3