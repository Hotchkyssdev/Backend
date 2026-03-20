SELECT * FROM SOCIO;

SELECT * FROM DEPORTE;

SELECT S.nombre, S.apellido
FROM SOCIO S
JOIN DEPORTE D ON S.fk_codigo = D.codigo
WHERE D.nombre = 'Tenis';

SELECT COUNT(*) AS Cantidad_Socios_Futbol
FROM SOCIO S
JOIN DEPORTE D ON S.fk_codigo = D.codigo
WHERE D.nombre = 'Fútbol';