Spring-Security-authentication-against-MongoDB-Using-Morphia
============================================================

This a demo example that demonstrate Spring authentication against mongoDB using Morphia API<br/>


This example developed using STS IDE with Gradle plugin. to run the application, follow these steps:<br/>

1-create MongodDB database named "authDB"<br/>
<br/>
2- Store users in the database "users" collection. Example: <br/>
 {<br/>
								"_id" : ObjectId("54563be84524039f074ed878"),<br/>
        "className" : "Person",<br/>
        "username" : "hashimati",<br/>
       "password" : "ahmed",<br/>
        "firstName" : "Ahmed",<br/>
        "lastName" : "Al-Hashmi",<br/>
        "role" : 1<br/>
}<br/>
{<br/>
        "_id" : ObjectId("54576ed778a117be49dcc90b"),<br/>
        "className" : "Person",<br/>
        "username" : "ahmed",<br/>
        "password" : "ahmed",<br/>
        "firstName" : "Ahmed",<br/>
        "lastName" : "Al-Hashmi",<br/>
        "role" : 2<br/>
}<br/>
<br/>
3- Make the "username" variable unique. <br/>
4- Refresh all the gradle dependencies. <br/>
5- Run the application. <br/>
