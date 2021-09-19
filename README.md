# Basis chat server and Client. 
- The Server starts a Thread pool with 500Threads. 
- The Server starts a ServerSocket with port 8080. 
- The Server Starts to listen on port 8080. 
- Every time a Client connects on port 8080 the Server starts a new instance of the Handler class. 
- The Handler class takes in a socket and set this.socket equal to it. 
- The Handler class starts a Scanner with a given inputStream from the socket.
- The Handler class starts a PrintWriter with a given outputStream from the socket. 
- The Handler class sends a message to the Client asking for a chat handle through the printWriter. 
- The Handler class reads in a String from the Scanner that gets this String from the Client. '
- If the name is Accepted, The Handler class will send a message with ""NAMEACCEPTED" + name" through the PrintWriter to the Client. 
- The Handler class will send a message to all clients on the server with "MESSAGE " + name + " has joined" though the PrintWriter.
- The Handler class starts and infinite loop that listens for input with the Scanner.
- When an input is received from a Client the Handle class will either
  - Return stopping the Handler Class from the given class if the message starts with /quit. 
  - send the following message "MESSAGE " + name + ": " + input to all the Clients through the PrintWriter.
- The Handler class removes all client == null. 
- The Handler class send a message saying name + "has left" through the PrintWriter to the Clients. 


### In the AdvChat folder is a more advance chat server that can send privat messages and list all users on the server though it follows the same protocol as above, just with ectra check on a given input String. 
