-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 31-Out-2022 às 14:09
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_ga`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `iD_Aluno` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Telefone` varchar(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `Nascimento` date NOT NULL,
  `Endereco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `ficha_saude`
--

CREATE TABLE `ficha_saude` (
  `nivelAtv` int(11) NOT NULL,
  `TempoAtv` double NOT NULL,
  `VezesSe` int(11) NOT NULL,
  `Pcardio` text NOT NULL,
  `PbResp` text NOT NULL,
  `PbOrto` text NOT NULL,
  `Preumatismo` varchar(1) NOT NULL,
  `Cirurgia` text NOT NULL,
  `MediReg` text NOT NULL,
  `Diabetes` varchar(1) NOT NULL,
  `Epilepsia` varchar(1) NOT NULL,
  `Fumante` varchar(1) NOT NULL,
  `Atestado` varchar(1) NOT NULL,
  `Obs` text NOT NULL,
  `ID_aluno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `iD_Fornecedor` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Telefone` varchar(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `CNPJ` varchar(14) NOT NULL,
  `Endereço` varchar(100) NOT NULL,
  `Lista_Produtos` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `iD_Funcionario` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Telefone` varchar(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `Nascimento` date NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Salario` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `iD_Produto` int(11) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `Marca` varchar(100) NOT NULL,
  `Data_Validade` date NOT NULL,
  `Preco_Compra` double NOT NULL,
  `Preco_Venda` double NOT NULL,
  `ID_Fornecedor` int(11) NOT NULL,
  `Estoque` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`iD_Aluno`);

--
-- Índices para tabela `ficha_saude`
--
ALTER TABLE `ficha_saude`
  ADD KEY `fk_fichaSaude` (`ID_aluno`);

--
-- Índices para tabela `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`iD_Fornecedor`);

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`iD_Funcionario`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`iD_Produto`),
  ADD KEY `fk_Forncecedor` (`ID_Fornecedor`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `iD_Aluno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `iD_Funcionario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `iD_Produto` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `ficha_saude`
--
ALTER TABLE `ficha_saude`
  ADD CONSTRAINT `fk_fichaSaude` FOREIGN KEY (`ID_aluno`) REFERENCES `aluno` (`iD_Aluno`);

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
  ADD CONSTRAINT `fk_Forncecedor` FOREIGN KEY (`ID_Fornecedor`) REFERENCES `fornecedor` (`iD_Fornecedor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
