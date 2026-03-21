CREATE TABLE Pacientes (
    id_paciente INT PRIMARY KEY IDENTITY(1,1),
    nombre_paciente VARCHAR(50) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    especie VARCHAR(50) NOT NULL
);

CREATE TABLE Tratamientos (
    id_tratamiento INT PRIMARY KEY IDENTITY(1,1),
    id_paciente INT NOT NULL, -- FK
    tipo_tratamiento VARCHAR(100) NOT NULL,
    fecha_tratamiento DATE NOT NULL,
    CONSTRAINT FK_TratamientoPaciente FOREIGN KEY (id_paciente) 
        REFERENCES Pacientes(id_paciente)
);