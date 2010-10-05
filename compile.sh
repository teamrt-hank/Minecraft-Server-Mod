#!/bin/bash

javac -sourcepath src -d build/classes -cp bin/minecraft_server.jar src/*.java

jar cvfM export/Minecraft_Mod.jar -C build/classes/ build/classes/*.class -C build/classes/ BanSystem\$Ban.class -C src META-INF




