rm "log.txt"
javac Main/MySimbolo.java
javac Main/MySemantico.java
javac Main/Main.java
for entry in "Teste"/*
do
  	java Main/Main "$entry"  2>&1  | tee -a "log.txt"
done
