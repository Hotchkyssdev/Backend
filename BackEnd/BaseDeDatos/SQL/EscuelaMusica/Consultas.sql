--Consultas nivel 1

-- 1. Listar alumnos en "Guitarra Intermedio"
SELECT A.nombre, A.apellido
FROM Alumnos A JOIN Inscripciones I 
	ON A.id_alumno = I.id_alumno
JOIN Cursos C 
	ON I.id_curso = C.id_curso
WHERE C.nombre = 'Guitarra Intermedio';

-- 2. Inscripciones después del 1 de enero de 2024
SELECT * 
FROM Inscripciones 
WHERE fecha_insc > '2024-01-01';

-- 3. Cantidad de alumnos que han abonado
SELECT COUNT(DISTINCT id_alumno) AS Cantidad_Abonados
FROM Inscripciones 
WHERE abono_inscrip = 1;

-- 4. Cursos para alumnos avanzados
SELECT * 
FROM Cursos 
WHERE nivel_habilidad = 'Avanzado';

--Consultas nivel 2

-- 1. Nombres de alumnos y sus cursos
SELECT A.nombre, A.apellido, C.nombre AS curso
FROM Alumnos A JOIN Inscripciones I 
	ON A.id_alumno = I.id_alumno
JOIN Cursos C 
	ON I.id_curso = C.id_curso;

-- 2. Alumnos inscritos en más de un curso
SELECT A.nombre, A.apellido
FROM Alumnos A JOIN Inscripciones I 
	ON A.id_alumno = I.id_alumno
GROUP BY A.id_alumno, A.nombre, A.apellido
HAVING COUNT(I.id_curso) > 1;

-- 3. Nombre del curso y cantidad de alumnos
SELECT C.nombre, COUNT(I.id_alumno) AS Cantidad_Inscritos
FROM Cursos C LEFT JOIN Inscripciones I 
	ON C.id_curso = I.id_curso
GROUP BY C.id_curso, C.nombre;

--Consultas nivel 3

-- 1. Listar alumnos que no han abonado (alguna de sus inscripciones)
SELECT DISTINCT A.nombre, A.apellido
FROM Alumnos A JOIN Inscripciones I 
	ON A.id_alumno = I.id_alumno
WHERE I.abono_inscrip = 0;

-- 2. Cursos con al menos un alumno mayor de 20 años
SELECT DISTINCT C.nombre
FROM Cursos C JOIN Inscripciones I 
	ON C.id_curso = I.id_curso
JOIN Alumnos A 
	ON I.id_alumno = A.id_alumno
WHERE A.edad > 20;

-- 3. Alumnos y sus cursos, pero solo inscripciones de 2024
SELECT A.nombre, A.apellido, C.nombre AS curso
FROM Alumnos A JOIN Inscripciones I 
	ON A.id_alumno = I.id_alumno
JOIN Cursos C 
	ON I.id_curso = C.id_curso
WHERE YEAR(I.fecha_insc) = 2024;