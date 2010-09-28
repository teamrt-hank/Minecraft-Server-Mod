#!/bin/bash

javac -sourcepath src -d build/classes -cp bin/minecraft_server.jar src/*.java

jar cvf build/jar/Minecraft_Mod.jar src/META-INF/MANIFEST.MF -C build/classes build/classes/*.class


cp build/jar/Minecraft_Mod.jar export/


