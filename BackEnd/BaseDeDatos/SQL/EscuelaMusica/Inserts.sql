INSERT INTO Cursos (nombre, nivel_habilidad, tipo_instrumento) VALUES 
('Guitarra Principiante', 'Principiante', 'Guitarra'),
('Guitarra Intermedio', 'Intermedio', 'Guitarra'),
('Guitarra Avanzado', 'Avanzado', 'Guitarra'),
('Piano Principiante', 'Principiante', 'Piano'),
('Piano Intermedio', 'Intermedio', 'Piano'),
('Piano Avanzado', 'Avanzado', 'Piano'),
('Violín Principiante', 'Principiante', 'Violín'),
('Violín Intermedio', 'Intermedio', 'Violín'),
('Violín Avanzado', 'Avanzado', 'Violín');

INSERT INTO Alumnos (apellido, nombre, edad, email) VALUES 
('García', 'Juan', 20, 'juan@mail.com'),
('Martínez', 'Elena', 15, 'elena@mail.com'),
('López', 'Marcos', 30, 'marcos@mail.com'),
('Sánchez', 'Lucía', 12, 'lucia@mail.com');

INSERT INTO Inscripciones (fecha_insc, abono_inscrip, id_alumno, id_curso) VALUES 
('2026-03-01', 1, 1, 1), -- Juan en Guitarra Principiante (Pago)
('2026-03-02', 1, 2, 4), -- Elena en Piano Principiante (Pago)
('2026-03-05', 0, 3, 3), -- Marcos en Guitarra Avanzado (No pago)
('2026-03-10', 1, 4, 7), -- Lucía en Violín Principiante (Pago)
('2026-03-12', 0, 1, 4); -- Juan también se anotó en Piano Principiante (No pago)