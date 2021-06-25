# laptop-keep-alive
Keeps the laptop alive for both windows and mac

Prerequisites:
jdk or java runtime environment

Notes:
When windows admins rights is provided, the background app may not keep the laptop live. in that case, run the batch file run the program in foreground.

Autostart a user program in Windows 10 without admin rights

Steps: (to run the laptop-keep-alive in background)

1. create a laptop-keep-alive.bat file and then add the following contents
`
@echo off
start javaw -jar C:\Users\palani.ram\Tools\laptop-keep-alive-0.1.0.jar > NUL 2>&1
echo laptop keep alive started
pause
exit
`
2. create shortcut to laptop-keep-alive.bat and rename it to laptop-keep-alive.exe

3. place the laptop-keep-alive.exe file in following location.
C:\Users\palani.ram\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup\laptop-keep-alive.exe
   
done.
