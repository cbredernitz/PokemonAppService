use pokemon;

Drop table pokemon;

Create table pokemon (
	id int not null
    ,name varchar(150) not null
    ,type_1 varchar(25) not null
    ,type_2 varchar(25)
    ,abilities varchar(750) not null
    ,category varchar(100) not null
    ,height_in_feet varchar(20)
    ,height_in_meters decimal
    ,weight_in_lbs decimal
    ,weight_in_kg integer
    ,capture_rate integer
    ,egg_steps integer
    ,exp_group varchar(30)
    ,total int not null
    ,hp int not null
    ,attack int not null
    ,defense int not null
    ,special_attack int not null
    ,special_defense int not null
    ,speed int not null
    ,moves text
);


Use pokemon;

LOAD DATA INFILE 'pokedexTxt.txt' 
INTO TABLE pokemon 
FIELDS TERMINATED BY '\t' 
ENCLOSED BY ''
LINES TERMINATED BY '\n';