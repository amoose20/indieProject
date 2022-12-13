delete from user_teams;
delete from user;
delete from team;
INSERT INTO user VALUES (1, "Austin", 30),(2,"TestUser", 20),(3,"AnotherTest", 21);
INSERT INTO team values (1, "Chicago Bulls"), (2, "Milwaukee Bucks"),(3, "New York Knicks");
INSERT INTO user_teams VALUES (1, 1), (1, 2);
