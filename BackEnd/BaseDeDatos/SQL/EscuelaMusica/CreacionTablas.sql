CREATE TABLE Alumnos (
    id_alumno INT PRIMARY KEY IDENTITY(1,1),
    apellido VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    edad INT,
    direccion VARCHAR(100),
    telefono VARCHAR(20),
    email VARCHAR(100)
);

CREATE TABLE Cursos (
    id_curso INT PRIMARY KEY IDENTITY(1,1),
    nombre VARCHAR(100) NOT NULL,
    nivel_habilidad VARCHAR(50) NOT NULL,
    tipo_instrumento VARCHAR(50) NOT NULL
);

CREATE TABLE Inscripciones (
    id_inscripcion INT PRIMARY KEY IDENTITY(1,1),
    fecha_insc DATE NOT NULL,
    abono_inscrip BIT NOT NULL, -- 1: Pagó, 0: Pendiente
    id_alumno INT NOT NULL,
    id_curso INT NOT NULL,
    CONSTRAINT FK_AlumnoInscripcion FOREIGN KEY (id_alumno) 
        REFERENCES Alumnos(id_alumno),
    CONSTRAINT FK_CursoInscripcion FOREIGN KEY (id_curso) 
        REFERENCES Cursos(id_curso)
);