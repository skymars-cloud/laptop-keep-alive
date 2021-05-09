# laptop-keep-alive
Keeps the laptop alive for both windows and mac


auto start a user program in windows without admin rights

1. create a laptop-keep-alive.bat file and the add the following contents

@echo off
start javaw -jar C:\Users\palani.ram\HCL\Tools\laptop-keep-alive-0.1.0.jar > NUL 2>&1
echo laptop keep alive started
pause
exit

2. create short cut to laptop-keep-alive.bat and rename it to laptop-keep-alive.exe

3. place the laptop-keep-alive.exe file in following location.
C:\Users\palani.ram\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup\laptop-keep-alive.exe
   
done.
