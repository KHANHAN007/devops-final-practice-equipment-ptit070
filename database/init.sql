SET NAMES utf8mb4;
USE equipment_practice;

CREATE TABLE equipment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    room VARCHAR(40) NOT NULL,
    quantity INT NOT NULL
);

INSERT INTO equipment (name, room, quantity) VALUES
('Máy chiếu', 'A101', 2),
('Máy tính', 'B202', 30),
('Router', 'C303', 4),
('Switch', 'C303', 6),
('Camera', 'D404', 8);
