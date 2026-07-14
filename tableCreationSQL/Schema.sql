-- DROP SCHEMA dbo;

CREATE SCHEMA dbo;
-- GameLibraryDB.dbo.Games definition

-- Drop table

-- DROP TABLE GameLibraryDB.dbo.Games;

CREATE TABLE GameLibraryDB.dbo.Games (
	GameID int IDENTITY(1,1) NOT NULL,
	Title varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	ReleaseYear varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	IsFavorite bit DEFAULT 0 NULL,
	CONSTRAINT PK__Games__2AB897DDE7DE5ECE PRIMARY KEY (GameID)
);


-- GameLibraryDB.dbo.Platforms definition

-- Drop table

-- DROP TABLE GameLibraryDB.dbo.Platforms;

CREATE TABLE GameLibraryDB.dbo.Platforms (
	PlatformID int IDENTITY(1,1) NOT NULL,
	Name varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	CONSTRAINT PK__Platform__F559F6DAF1B0B772 PRIMARY KEY (PlatformID)
);


-- GameLibraryDB.dbo.GamePlatform definition

-- Drop table

-- DROP TABLE GameLibraryDB.dbo.GamePlatform;

CREATE TABLE GameLibraryDB.dbo.GamePlatform (
	GameID int NOT NULL,
	PlatformID int NOT NULL,
	ID int IDENTITY(1,1) NOT NULL,
	CONSTRAINT GamePlatform_PK PRIMARY KEY (ID),
	CONSTRAINT UQ_GamePlatform_Combo UNIQUE (GameID,PlatformID),
	CONSTRAINT FK__GamePlatf__GameI__6C190EBB FOREIGN KEY (GameID) REFERENCES GameLibraryDB.dbo.Games(GameID),
	CONSTRAINT FK__GamePlatf__Platf__6D0D32F4 FOREIGN KEY (PlatformID) REFERENCES GameLibraryDB.dbo.Platforms(PlatformID)
);