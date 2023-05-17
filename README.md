Why Liquibase?
Liquibase is a DB Migration tool using which you are given an opportunity to track the Databases changes with ease.
Liquibase can be easily integrated with Spring Boot no additional code required for migration.
How it happens?

a) It uses couple of tables
1) DATABASECHANGELOG: This table tracks the SQL Files that have been changed.
2) DATABASECHANGELOGLOCK: This table maintains if the database has to be locked during process of migration.

Process of Migration:
1) Create folder, db/changelog in src/main/resources
2) Create file changelog-master.xml --> This file is master file to have access to all the migration sql files.
3) Now i want to alter a table, simple steps to follow 
4) Create a folder inside db/changelog for the new migration
5) Add your sql file in the folder and if rollback is required you can create a rollback file as well.
6) Done
7) If you run the app using a spring boot then it will be migrated.