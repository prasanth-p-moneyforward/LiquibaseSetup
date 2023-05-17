なぜリキベースなのか？
Liquibase は、データベースの変更を簡単に追跡できる DB 移行ツールです。
Liquibase は Spring Boot と簡単に統合でき、移行に追加のコードは必要ありません。
それはどのようにして起こるのでしょうか？

a) いくつかのテーブルを使用します
1) DATABASECHANGELOG: このテーブルは、変更された SQL ファイルを追跡します。
2) DATABASECHANGELOGLOCK: このテーブルは、移行プロセス中にデータベースをロックする必要があるかどうかを維持します。

移行のプロセス:
1) src/main/resources にフォルダー db/changelog を作成します。
2) ファイルchangelog-master.xmlを作成します --> このファイルは、すべての移行SQLファイルにアクセスするためのマスターファイルです。
3) 次に、テーブルを変更したいと思います。簡単な手順に従う必要があります。
4) db/changelog 内に新しい移行用のフォルダーを作成します。
5) SQL ファイルをフォルダーに追加します。ロールバックが必要な場合は、ロールバック ファイルも作成できます。
6) 完了
7) スプリング ブートを使用してアプリを実行すると、アプリは移行されます。


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
