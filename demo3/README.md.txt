# Demo Activiti BPMN Application

## Описание
Это простое веб-приложение, использующее Java 1.8, Spring Boot, Activiti и H2 для управления BPMN процессами.

## Технологии
- Java 1.8
- Spring Boot
- Activiti
- H2 Database

## Запуск приложения
1. Клонируйте репозиторий.
2. Перейдите в директорию с проектом.
3. Запустите приложение с помощью:
bash:
mvn spring-boot:run

4. Приложение будет доступно по адресу http://localhost:8080.

## REST API
### Запуск процесса
- URL: /process/start
- Метод: POST
- Параметры: postValue (число)
- Пример:
bash
curl -X POST
"http://localhost:8080/process/start?postValue=50"

### Получение списка задач
- URL: 
/process/tasks
- Метод: 
GET
- Пример:
bash
   curl -X GET "http://localhost:8080/process/tasks"
   
### Завершение задачи
- URL: 
/process/completetask
- Метод: 
POST
- Параметры: 
taskId
 (ID задачи)
- Пример:
bash
   curl -X POST "http://localhost:8080/process/completetask?taskId="
   
### Получение результата
- URL: 
/process/result
- Метод: 
GET
- Параметры: 
processInstanceId
 (ID экземпляра процесса)
- Пример:
bash
   curl -X GET "http://localhost:8080/process/result?processInstanceId="
   
## Консоль H2
Для доступа к консоли базы данных H2 перейдите по адресу 
http://localhost:8080/h2-console
.
