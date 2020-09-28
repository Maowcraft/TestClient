# TestClient
A "console app to Minecraft" test mod that utilizes [Ncyclo](https://github.com/Maowcraft/NcycloAPI).

---

## Downloads

[Client/Endpoint](https://github.com/Maowcraft/TestClient/tree/client) (Receives commands from the server)<br>
[Console/Server](https://github.com/Maowcraft/TestClient/tree/console) (Sends commands to the client)

## Installation Steps

1. Download and install [Fabric](https://fabricmc.net/).
2. Download [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api).
3. Download client mod and drop it into your Minecraft mods folder.
4. Run Minecraft.
5. Download the console app.
6. Open a new console, and run the console app like so `java -jar <filename>.jar [true/false]` - The true/false enables logging on the clientside.
7. You're done.

## Commands

This is a very modular system, you're able to add and remove commands, but there are a few base commands in the project so far to give examples as to how it works.

* `chat <message>` - Pastes the contents of the message to the ingame chat, nobody but the client can see it.
* `giveitem <item id> <count>` - Adds a single type of item to the player's inventory, amount is based on count argument.

## Screenshots

*Taken in a development environment.*

![Sending commands](https://i.imgur.com/np2CgJ0.png "Sending commands")

![Client receiving and logging commands](https://i.imgur.com/2Vjd3pn.png "Client receiving and logging commands")

![The outcome](https://i.imgur.com/gwJsIRg.png "The outcome")

