JailHelper
===

JailHelper displays a message to a player at login and/or periodically throughout their jail sentance.

<h2>Commands</h2>
/jailhelper \<command\>

reload - reloads the config file

version - shows the current version of JailHelper

help - shows in-game help for the commands

<h2>Permissions</h2>
jailhelper.*<br/>
Gives all JailHelper permissions to a player

jailhelper.showonlogin<br/>
JailHelper shows a message to players with this permission on login if they're in jail

jailhelper.showperiodically<br/>
JailHelper shows a message to players with this message periodically while they're in jail

jailhelper.version<br/>
Allows the player to view the version of the plugin

jailhelper.reload<br/>
Allows the player to reload the config

jailhelper.help<br/>
Allows the player to view help for JailHelper


<h2>Config</h2>

loginMsg<br/>
The message that is displayed to players with the appropriate permission on login. Color codes will be interpreted. Use an & before the one character color code (0-f, r, etc). e.g. &4

repeatedMsg<br/>
The mesage that is displayed to players periodically while they are in jail. Color codes will function the same way they do for the login message

repeatTime<br/>
The time interval in mintues between when messages are displayed to players in jail. Set to 0 if you want to disable periodic messages to players
