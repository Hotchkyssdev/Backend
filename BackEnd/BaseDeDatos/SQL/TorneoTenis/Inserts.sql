INSERT INTO Categorias (nombre, edad_min, edad_max, sexo) VALUES 
('Damas A', 18, 34, 'F'),
('Damas B', 35, 45, 'F'),
('Damas C', 46, 100, 'F'),
('Caballeros A', 18, 34, 'M'),
('Caballeros B', 35, 50, 'M'),
('Caballeros C', 51, 100, 'M'),
('Juveniles Varones', 13, 17, 'M'),
('Juveniles Mujeres', 13, 17, 'F');

INSERT INTO Participantes (dni_participante, apellido, nombre, edad, sexo) VALUES 
(11111111, 'Guzman', 'Ana', 25, 'F'),      -- Damas A
(22222222, 'Rios', 'Carlos', 40, 'M'),     -- Caballeros B
(33333333, 'Sosa', 'Luis', 15, 'M'),       -- Juveniles Varones
(44444444, 'Paz', 'Elena', 50, 'F');      -- Damas C

INSERT INTO Inscripciones (dni_participante, id_categoria, fecha_insc, abono_inscrip) VALUES 
(11111111, 1, '2026-03-01', 1), -- Ana en Damas A (Pagó)
(22222222, 5, '2026-03-02', 0), -- Carlos en Caballeros B (No pagó)
(33333333, 7, '2026-03-05', 1), -- Luis en Juveniles Varones (Pagó)
(44444444, 3, '2026-03-10', 1); -- Elena en Damas C (Pagó)