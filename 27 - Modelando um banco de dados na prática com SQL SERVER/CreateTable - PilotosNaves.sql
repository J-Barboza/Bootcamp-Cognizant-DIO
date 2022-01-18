USE EstrelaDaMorte;
GO
CREATE TABLE PilotosNaves(
	IdPiloto int NOT NULL,
	IdNave int NOT NULL,
	FlagAutorizado bit NOT NULL
)
GO
ALTER TABLE PilotosNaves ADD CONSTRAINT Pk_PilotosNaves PRIMARY KEY (IdPiloto, IdNave);
GO
ALTER TABLE PilotosNaves ADD CONSTRAINT Pk_PilotosNaves_Pilotos FOREIGN KEY (IdPiloto) REFERENCES Pilotos (IdPiloto);
GO
ALTER TABLE PilotosNaves ADD CONSTRAINT Pk_PilotosNaves_Navess FOREIGN KEY (IdNave) REFERENCES Naves (IdNave);
GO
ALTER TABLE PilotosNaves ADD CONSTRAINT DF_PilotosNaves_FlagAutorizado DEFAULT (1) FOR FlagAutorizado;