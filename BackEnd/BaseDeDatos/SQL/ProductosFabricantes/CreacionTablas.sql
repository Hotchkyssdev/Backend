CREATE TABLE FABRICANTE (
    codigo INT PRIMARY KEY IDENTITY(1,1),
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(150)
);

CREATE TABLE PRODUCTO (
    codigo INT PRIMARY KEY IDENTITY(1,1),
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    fk_fabricante INT NOT NULL,
    CONSTRAINT FK_ProductoFabricante FOREIGN KEY (fk_fabricante) 
        REFERENCES FABRICANTE(codigo)
);