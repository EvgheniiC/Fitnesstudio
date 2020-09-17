EN
Create a Fitness club application.
The fitness club has several halls (male and female).
The user can enter characteristics (weight (actual / desired), height, age, the period for which the person wants to achieve the desired weight, the desired coach)
and the application should determine the appropriate training program.
User can be subscribed to several programs
The application must allow:
1)
- Create a branch of a fitness club (city, city district, telephones (separate entity), address (separate entity), name, e / mail (separate entity), the possibility of round-the-clock work)
- Create a training program (number of kg., Spent in a one-time visit, name,
recommended number of lessons per week, desired department in the city, type of program (Very light, Light, Medium, Intensive),
variety (Cross fit, Cycling, Running, Swimming, Yoga), cost).
- Store statistics for the user (actual weight, visits by dates), display how many classes are left to attend to achieve the desired weight, how many classes attended.
  Generate a pdf file with statistics.
  Use View for statistics.
- Save and edit data about the coach (name, age, number of programs that can lead).
2) Edit the program, coach's personal information, club information.
3) Delete the program.
4) Delete branch, club.
5) Display information about the club / branch of the club.
6) Display information about the visitor.
7) Subscribe a visitor to promotions (if the user is subscribed to this program and its price has become lower) (send a certain HTML template by mail).
8) Delete visitors who have not visited for more than 90 days. (Scheduling).

To step 7, create a collection of domains with fields:
Program type
Price

Use Spring 5, JPA (JPQL, NamedQueries, Criteria queries) in the application.
**** Technical requirements****
The application must:
- be as densely covered with tests as possible.
- contain a clear logical separation between presentation, logic and data source.
- the assembly of the project / launch of tests should be done using maven tools.
- all key points of the application logic must contain explanatory JavaDocs.
- data validation must be present.




RU
Создать приложение Фитнесс клуб.
В фитнесс клубе есть несколько залов(мужской и женский).
Пользователь может ввести характеристики(вес(фактический/желаемый), рост, возраст, период, за который человек хочет достичь желаемого веса, желаемый тренер)
и приложение должно определить подходящую программу занятий.
Пользователь может быть подписан на несколько программ
Приложение должно позволять:
1)
- Создавать отделение фитнесс клуба(город, район города, телефоны(отдельная сущность), адрес(отдельная сущность), название, э/почта(отдельная сущность), возможность круглосточной работы)
- Создавать программу занятий(кол-во кг., затрачиваемых при одноразовом посещении, название,
рекомендуемое кол-во занятий в неделю, желаемое отделение в городе, тип программы(Very light, Light, Medium, Intensive),
разновидность(Cross fit, Cycling, Running, Swimming, Yoga), стоимость).
- Хранить статистику для пользователя(фактический вес, посещение по датам), выводить сколько занятий осталось посетить для достижения желаемого веса, сколько посетил занятий.
  Формировать pdf файл со статистикой.
  Использовать View для статистики.
- Сохранять и редактировать данные о тренере(ФИО, возраст, количество программ, которые может вести).
2) Редактировать программу, личную информацию тренера, информацию о клубе.
3) Удалять программу.
4) Удалять отделение, клуб.
5) Выводить информацию о клубе/отделении клуба.
6) Выводить информацию о посетителе.
7) Подписывать посетителя на акции(если пользователь подписан на данную программу и цена ее стала ниже)(отправлять по почте определенный HTML шаблон).
8) Удалять посетителей, который не посещали более 90 дней.(Scheduling).

К 7 пункту создать коллекцию доменов с полями:
Тип программы
Price

В приложении использовать Spring 5, JPA(JPQL, NamedQueries, Criteria queries).
		      **** Технические требования****
Приложение должно:
- быть максимально плотно покрыто тестами.
- содержать четкое логическое разделение между представление, логикой и источником данных.
- cборка проекта/запуск тестов должна производится средствами gradle.
- готовое приложение должно быть доступно на bitbucket репозитории.
- все ключевые моменты логики приложения должны содержать поясняющие JavaDocs.
- обязательно должна присутствовать валидация данных.
