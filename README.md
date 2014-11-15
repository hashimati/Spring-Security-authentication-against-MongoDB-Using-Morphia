Spring-Security-authentication-against-MongoDB-Using-Morphia
============================================================

This a demo example that demonstrate Spring authentication against mongoDB using Morphia API


This example developed using STS IDE with Gradle plugin. to run the application, follow these steps:

1-create MongodDB database named "authDB"
2- Store users in the database. Example: 
 {
        "_id" : ObjectId("54563be84524039f074ed878"),
        "className" : "Person",
        "username" : "hashimati",
        "password" : "ahmed",
        "firstName" : "Ahmed",
        "lastName" : "Al-Hashmi",
        "role" : 1
}
{
        "_id" : ObjectId("54576ed778a117be49dcc90b"),
        "className" : "Person",
        "username" : "ahmed",
        "password" : "ahmed",
        "firstName" : "Ahmed",
        "lastName" : "Al-Hashmi",
        "role" : 2
}

3- Make the "username" variable unique. 
4- Refresh all the gradle dependencies. 
5- Run the application. 
