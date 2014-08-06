# Script criado para facilitar o processo 
# de remover as pastas antigas e mover as pastas geradas 
# novas para o local certo 
rm -rf node/ lexer/ analysis/ parser/
sablecc Doc/portugol.grammar
mv -v Doc/node/ .
mv -v Doc/lexer/ .
mv -v Doc/analysis/ .
mv -v Doc/parser/ .