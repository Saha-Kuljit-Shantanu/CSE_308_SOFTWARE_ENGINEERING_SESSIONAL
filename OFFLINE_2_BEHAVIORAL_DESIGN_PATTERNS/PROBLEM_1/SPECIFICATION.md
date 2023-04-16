ABC Company provides **server** as a service to its clients. But as the company is very new and small,
currently they have only one server. So, when maintenance or upgrading work is carried out, the
server maybe **partially** or **fully** down. The company has two types of clients: **premium user** and
**regular user**. **Premium users** must pay more than the **regular users** and in return, they receive
some benefits. As a part of an agreement, all the data of the premium users are backed up in a
server of DEF Company. When the server of ABC Company is partially down (some functionalities
are not available) or fully down, DEF Company helps to provide an uninterrupted service.

|Previous State of server|Current State of server|For Premium users|For Regular users|
|-|-|-|-|
|Operational|Partially down|ABC company asks the user whether he/she wants to use service from two servers (partially from the server of ABC and partially from the server of DEF) or from one server (DEF)|ABC company asks the user whether he/she wants to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF (this will copy all his/her data to the server of DEF)|

In addition to the notifications stated above, ABC company informs **all the users** of any state
changes. 
**You don’t need to calculate the total bill. Just use some arbitrary placeholder variable like x.**
For simplicity, create one instance of premium user and one instance of regular user. Sending
notifications from the ABC company to these two users will suffice.
