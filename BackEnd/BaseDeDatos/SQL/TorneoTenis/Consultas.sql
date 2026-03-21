SELECT COUNT(*) AS Total_Participantes 
FROM Participantes;

SELECT * 
FROM Participantes;

SELECT * 
FROM Categorias;

SELECT COUNT(*) AS Total_Mujeres 
FROM Participantes 
WHERE sexo = 'F';

SELECT P.nombre, P.apellido
FROM Participantes P JOIN Inscripciones I 
	ON P.dni_participante = I.dni_participante
JOIN Categorias C 
	ON I.id_categoria = C.id_categoria
WHERE C.nombre = 'Caballeros B';

SELECT * 
FROM Participantes 
WHERE edad BETWEEN 25 AND 37;

SELECT I.num_inscripcion, I.fecha_insc, P.nombre, P.apellido, I.abono_inscrip
FROM Inscripciones I JOIN Participantes P 
	ON I.dni_participante = P.dni_participante;