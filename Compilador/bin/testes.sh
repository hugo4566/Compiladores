rm "log.txt"
for entry in "Teste"/*
do
  	java Main/Main "$entry"  2>&1  | tee -a "log.txt"
done
