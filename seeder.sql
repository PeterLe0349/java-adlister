use adlister_db;

insert into users (username, email, password) value
('cody','cody@codeup.com','quackquack'),
    ('batman','dc@marve.com','gothem');


insert into ads (user_id, title, description)
values (1, 'gatorade', 'quench the thirst'),
       (2, 'mountain dew', 'taste the dew');