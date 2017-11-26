CREATE TABLE person_task
(
  id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  person_id BIGINT,
  task_id BIGINT
);




CREATE TABLE chief
(
  chief_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  chief_title VARCHAR(30),
  chief_description VARCHAR(30)
);




CREATE TABLE department
(
  department_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  title VARCHAR(20),
  description VARCHAR(20)
);




CREATE TABLE person
(
  person_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  person_name VARCHAR(20) NOT NULL,
  person_middle_name VARCHAR(20) NOT NULL,
  person_surname VARCHAR(20) NOT NULL
);




CREATE TABLE position
(
  position_id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  position_title VARCHAR(20) NOT NULL,
  position_description VARCHAR(30) NOT NULL
);





CREATE TABLE person_position
(
  id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  person_id BIGINT NOT NULL,
  position_id BIGINT,
  CONSTRAINT person_position_person_person_id_fk FOREIGN KEY (person_id) REFERENCES person (person_id),
  CONSTRAINT person_position_position_position_id_fk FOREIGN KEY (position_id) REFERENCES position (position_id)
);
