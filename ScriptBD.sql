DROP database LOCADORABD;
CREATE DATABASE LOCADORABD;
USE LOCADORABD;
CREATE TABLE VEICULO(
ID int not null auto_increment,
MARCA varchar(40) NOT NULL,
ANO varchar(10)NOT NULL,
PLACA varchar(10)NOT NULL,
TIPO varchar(20)NOT NULL,
KILOMETRAGEM DECIMAL(9.3)NOT NULL,
MODELO varchar(40)NOT NULL,
TANQUE varchar(20)NOT NULL,
DISPONIBILIDADE varchar(20)NOT NULL,
PRIMARY KEY(ID)
);
select * from veiculo;
INSERT INTO veiculo (ID,MARCA, ANO, PLACA, TIPO, KILOMETRAGEM, MODELO, TANQUE, DISPONIBILIDADE) 
VALUES ('1', 'VOLKSWAGEN', '2019', 'PIO2A17', 'SUV', '0.0', 'AMAROK', 'UM QUARTO (1/4)', 'DISPONÍVEL'),
		('2', 'VOLKSWAGEN', '2019', 'AMN2A18', 'PRÊMIUN', '0.0', 'JETTA GLI', 'UM QUARTO (1/4)', 'DISPONÍVEL'),
		('3', 'CHEVROLET', '2019', 'RIO2A18', 'ECONÔMICO', '0.0', 'ÔNIX', 'UM QUARTO (1/4)', 'DISPONÍVEL'),
		('4', 'CHEVROLET', '2020', 'SAOO2B10', 'SEDAN', '0.0', 'ÔNIX', 'METADE (1/2)', 'DISPONÍVEL'),
        ('5', 'CHEVROLET', '2017', 'RIO2A18', 'SUV', '100.000', 'TRACKER', 'VAZIO', 'DISPONÍVEL'),
        ('6', 'Hyundai ', '2019', 'GB4795', 'ECONÔMICO', '87.000', 'HB20X', 'CHEIO', 'INDISPONÍVEL'),
        ('7', 'Hyundai ', '2005', 'BEE4R22', 'SEDAN', '210.000', 'AZERA', 'CHEIO', 'DISPONÍVEL'),
        ('8', 'Hyundai ', '2004', 'BRA2E19', 'SUV', '195.000', 'TUCSON', 'CHEIO', 'INDISPONÍVEL'),
        ('9', 'Nissan', '2020', 'FP5T7Q', 'SEDAN', '0.0', 'VERSA', 'VAZIO', 'DISPONÍVEL'),
        ('10', 'Nissan', '2021', '3CB58K', 'SUV', '0.0', 'FRONTIER', 'TRÊS QUARTO (3/4)', 'DISPONÍVEL'),
        ('11', 'CHEVROLET', '2007', 'BRA20E4', 'ECONÔMICO', '110.150', 'S10', 'VAZIO', 'DISPONÍVEL'),
        ('12', 'CHEVROLET', '2009', 'BOK3C58', 'SUV', '250.451', 'SPIN', 'VAZIO', 'DISPONÍVEL'),
        ('13', 'Nissan', '2015', 'OYW4R26', 'SUV', '87.121', 'KICKS', 'METADE (1/2)', 'DISPONÍVEL'),
        ('14', 'Toyota', '2010', 'MSK9B10', 'SEDAN', '61.454', 'ETIOS', 'UM QUARTO (1/4)', 'DISPONÍVEL'),
        ('15', 'Toyota', '2012', 'DKV0I01', 'ECONÔMICO', '54.564', 'COROLA', 'CHEIO', 'DISPONÍVEL'),
        ('16', 'Toyota', '2020', 'CXZ7B41', 'ECONÔMICO', '0.0', 'CAMRY', 'CHEIO', 'DISPONÍVEL'),
        ('17', 'VOLKSWAGEN', '2021', 'AOB1CD2', 'ECONÔMICO', '0.0', 'GOL', 'METADE (1/2)', 'INDISPONÍVEL'),
        ('18', 'VOLKSWAGEN', '2020', 'JDR0312', 'ECONÔMICO', '0.0', 'GOL', 'CHEIO', 'DISPONÍVEL'),
        ('19', 'Toyota', '2009', 'BRAOS17', 'SUV', '96.959', 'SW4', 'METADE (1/2)', 'DISPONÍVEL'),
        ('20', 'Volkswagen', '2011', 'AOB1CD2', 'PRÊMIUM', '58.969', 'FOX', 'CHEIO', 'INDISPONÍVEL'),
        ('21', 'Toyota', '2013', 'X41BCZ7', 'SUV', '51.321', 'HILUX', 'TRÊS QUARTO (3/4)', 'DISPONÍVEL'),
        ('22', 'Honda ', '2016', 'AB123CD', 'SEDAN', '69.484', 'CIVIC', 'CHEIO', 'DISPONÍVEL'),
        ('23', 'Honda ', '2015', 'BSE3R52', 'SEDAN', '59.495', 'CITY', 'UM QUARTO (1/4)', 'DISPONÍVEL')
 ;

