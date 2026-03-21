CREATE TABLE Categorias (
    id_categoria INT PRIMARY KEY IDENTITY(1,1),
    nombre VARCHAR(50) NOT NULL,
    edad_min INT NOT NULL,
    edad_max INT NOT NULL,
    sexo CHAR(1) NOT NULL -- 'F' o 'M'
);

CREATE TABLE Participantes (
    dni_participante INT PRIMARY KEY,
    apellido VARCHAR(50) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(100),
    edad INT NOT NULL,
    telefono VARCHAR(20),
    sexo CHAR(1) NOT NULL
);

CREATE TABLE Inscripciones (
    num_inscripcion INT PRIMARY KEY IDENTITY(1,1),
    dni_participante INT NOT NULL,
    id_categoria INT NOT NULL,
    fecha_insc DATE NOT NULL,
    abono_inscrip BIT NOT NULL, -- 1 = Pago, 0 = Pendiente
    CONSTRAINT FK_InscripcionParticipante FOREIGN KEY (dni_participante) 
        REFERENCES Participantes(dni_participante),
    CONSTRAINT FK_InscripcionCategoria FOREIGN KEY (id_categoria) 
        REFERENCES Categorias(id_categoria)
);