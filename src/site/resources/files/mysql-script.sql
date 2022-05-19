SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS OZ_TEST;

CREATE SCHEMA OZ_TEST;

-- -----------------------------------------------------
-- Table `OZ_TEST`.`CUSTOMER`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `OZ_TEST`.`CUSTOMER` ;

CREATE  TABLE IF NOT EXISTS `OZ_TEST`.`CUSTOMER` (
  `id_customer` INT NOT NULL ,
  `name` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id_customer`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `OZ_TEST`.`ACCOUNT`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `OZ_TEST`.`ACCOUNT` ;

CREATE  TABLE IF NOT EXISTS `OZ_TEST`.`ACCOUNT` (
  `id_account` INT NOT NULL AUTO_INCREMENT ,
  `balance` DOUBLE NOT NULL ,
  `id_customer` INT NOT NULL ,
  PRIMARY KEY (`id_account`) ,
  INDEX `fk_ACCOUNT_CLIENTE` (`id_customer` ASC) ,
  CONSTRAINT `fk_ACCOUNT_CLIENTE`
    FOREIGN KEY (`id_customer` )
    REFERENCES `OZ_TEST`.`CUSTOMER` (`id_customer` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `OZ_TEST`.`CUSTOMER`
-- -----------------------------------------------------
START TRANSACTION;
USE `OZ_TEST`;
INSERT INTO `OZ_TEST`.`CUSTOMER` (`id_customer`, `name`) VALUES (1, 'Alberto Sánchez');

COMMIT;

-- -----------------------------------------------------
-- Data for table `OZ_TEST`.`ACCOUNT`
-- -----------------------------------------------------
START TRANSACTION;
USE `OZ_TEST`;
INSERT INTO `OZ_TEST`.`ACCOUNT` (`id_account`, `balance`, `id_customer`) VALUES (1, 10000000.0, 1);

COMMIT;
