SELECT * FROM producto 
ORDER BY precio ASC;

SELECT * FROM fabricante 
ORDER BY nombre ASC;

SELECT nombre, precio 
FROM producto 
WHERE precio > 10000;

SELECT TOP 1 nombre, precio 
FROM producto 
ORDER BY precio ASC;