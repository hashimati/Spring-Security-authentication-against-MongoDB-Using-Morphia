Spring-Security-authentication-against-MongoDB-Using-Morphia
============================================================

This a demo example that demonstrate Spring authentication against mongoDB using Morphia API<br/>


This example developed using STS IDE with Gradle plugin. to run the application, follow these steps:<br/>

1-create MongodDB database named "authDB"<br/>
<br/>
2- Store users in the database. Example: <br/>
 {<br/>
&nbsp&nbsp&nbsp&nbsp        "_id" : ObjectId("54563be84524039f074ed878"),<br/>
&nbsp&nbsp&nbsp&nbsp        "className" : "Person",<br/>
&nbsp&nbsp&nbsp&nbsp        "username" : "hashimati",<br/>
&nbsp&nbsp&nbsp&nbsp        "password" : "ahmed",<br/>
&nbsp&nbsp&nbsp&nbsp        "firstName" : "Ahmed",<br/>
&nbsp&nbsp&nbsp&nbsp        "lastName" : "Al-Hashmi",<br/>
&nbsp&nbsp&nbsp&nbsp        "role" : 1<br/>
}<br/>
{<br/>
&nbsp&nbsp&nbsp&nbsp        "_id" : ObjectId("54576ed778a117be49dcc90b"),<br/>
&nbsp&nbsp&nbsp&nbsp        "className" : "Person",<br/>
&nbsp&nbsp&nbsp&nbsp        "username" : "ahmed",<br/>
&nbsp&nbsp&nbsp&nbsp        "password" : "ahmed",<br/>
&nbsp&nbsp&nbsp&nbsp        "firstName" : "Ahmed",<br/>
&nbsp&nbsp&nbsp&nbsp        "lastName" : "Al-Hashmi",<br/>
&nbsp&nbsp&nbsp&nbsp        "role" : 2<br/>
}<br/>
<br/>
3- Make the "username" variable unique. <br/>
4- Refresh all the gradle dependencies. <br/>
5- Run the application. <br/>
