USE BoasPraticas
GO
INSERT INTO PRODUTOS VALUES (1, 'Nome do Produto', GETDATE(), '12345678900', 0)
GO

-- Forçando erro 
INSERT INTO PRODUTOS(CODIGO, DESCRICAO, EAN) VALUES (1, 'Nome do Produto2', '12345678900')
GO


select * from produtos
GO

select * from produtos where codigo = 2;
GO

select * from produtos where descricao like '%produto%';
GO