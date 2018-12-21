# Mention
A mention plugin for Spigot. Simple, fast & easy.

## How it works ?
Just put the name of a player in the chat and it will turn into `@player` !

## Commands / Permissions
```
Commands: 
/mention reload => Reload the plugin

Permissions:
mention.ignore => Ignore @mention
mention.everyone => Use @everyone
mention.reload => Use /mention reload
```

## Config
```
# Mention by Lxct
# Placeholders :
# %PLAYER% => The one who has mentioned
# %TARGET% => The one who was mentioned
# Minecraft color code is obviously supported.

symbol: "@" # @Name
color: "&6"
sendActionBar: true # Send a message in the action bar to the mentioned player
sendChatMessage: false # Send a message in the chat to the mentioned player
sendSound: true # Send a sound to the mentioned player
actionBarMessage: "&a&l%PLAYER% mentioned you!"
chatMessage: "&a&l%PLAYER% mentioned you!"
soundName: "ENTITY_PLAYER_LEVELUP" # List available at https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Sound.html
soundVolume: 1 # Volume (1 seems like a good value..)
soundPitch: 0 # Change Pitch of the sound (0 = default)
```

## Compilation
Bash/Zsh linux terminal :

```
git clone https://github.com/Lxct/Mention.git
cd Mention
sudo mvn clean install
```
The jar is in the `target/` folder.

## Contact
Add me on Discord => Lxct#9971
I'd like to hear your comments ! <3


## Info
Spigot Link: [https://www.spigotmc.org/resources/best-view-distance.61963/](https://www.spigotmc.org/resources/best-view-distance.61963/)
Github Link: [https://github.com/Lxct/Mention](https://github.com/Lxct/BestViewDistance)