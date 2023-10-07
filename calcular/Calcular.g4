grammar Calcular;

program: calcula;

calcula: NUMERO MAIS NUMERO;
MAIS: '+';
NUMERO: [0-9][0-9]*;
WS: [ \t\n\r\f]+ -> skip ;