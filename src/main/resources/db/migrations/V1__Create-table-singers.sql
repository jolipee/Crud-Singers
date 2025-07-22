CREATE TABLE singers(

id TEXT PRIMARY Key UNIQUE not null,
name TEXT not null,
age INT not null,
active NOT NULL DEFAULT TRUE
);