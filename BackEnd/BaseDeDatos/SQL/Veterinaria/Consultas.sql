SELECT 
    P.nombre_paciente, 
    T.tipo_tratamiento, 
    T.fecha_tratamiento
FROM Pacientes P JOIN Tratamientos T 
	ON P.id_paciente = T.id_paciente
ORDER BY P.nombre_paciente ASC;

SELECT 
    P.nombre_paciente, 
    COUNT(T.id_tratamiento) AS Total_Tratamientos
FROM Pacientes P JOIN Tratamientos T 
	ON P.id_paciente = T.id_paciente
WHERE T.fecha_tratamiento BETWEEN '2024-01-01' AND '2024-03-31'
GROUP BY P.nombre_paciente;

SELECT TOP 1 
    P.nombre_paciente, 
    COUNT(T.id_tratamiento) AS Cantidad
FROM Pacientes P JOIN Tratamientos T 
	ON P.id_paciente = T.id_paciente
GROUP BY P.nombre_paciente
ORDER BY Cantidad DESC;