INSERT INTO fabricante (nombre, direccion) VALUES 
('Samsung', 'Corea del Sur'),
('Apple', 'California, USA'),
('Logitech', 'Suiza');

INSERT INTO producto (nombre, precio, fk_fabricante) VALUES 
('Monitor Odyssey G5', 450000.00, 1),
('Celular Galaxy S24', 1200000.00, 1),
('SSD 1TB 980 Pro', 180000.00, 1),
('iPhone 15 Pro', 1500000.00, 2),
('MacBook Air M2', 1800000.00, 2),
('AirPods Pro 2', 350000.00, 2),
('Mouse MX Master 3S', 95000.00, 3),
('Teclado Mechanical Mini', 120000.00, 3),
('Cámara Web C920', 75000.00, 3),
('Headset G733', 160000.00, 3);