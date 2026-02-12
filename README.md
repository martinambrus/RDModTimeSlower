⚠️ Effort moved to Fabric-enabled RubyDung
------------------------------------------
Go to **[RDForward](https://github.com/martinambrus/RDForward)** if modding a nearly 20-years old game (in 2026) is your niche :-{}

----------

RubyDung Time Slower Mod
========================
Version: 1.0

This is a sample mod for the 
***[RubyDung 2009 Modded](https://github.com/martinambrus/RDModded)*** game project 
(i.e. the very first _Minecraft_ version), implementing ***[the RDAPI modding API](https://github.com/martinambrus/RDApi)***.

What it does?
-------------
This mod will temporarily slow down time upon pressing the T button 
(also known as bullet-time).


![Slowing time while jumping](https://github.com/martinambrus/RDModTimeSlower/assets/7406402/a9f82fd0-ac7e-46e7-b7e1-1c3750f0666d "Bullet-Time, RubyDung style!")

Installation
------------
Copy the JAR file from the releases page into your *mods* folder inside *.minecraft* folder.

You'll need to be running [RDModded game version](https://github.com/martinambrus/RDModded) 
for this mod to be picked up and start working.

I highly recommend using [MultiMC](https://multimc.org/) for this, since you can easily 
create a separate pre-release Minecraft instance there and it's very easy to replace the 
MC client JAR file or locate the *.minecraft* folder with MultiMC.

Building
--------
Just run the ***first_time_run*** gradle task and have fun coding :)

Once ready, you can run the ***jar*** gradle task to create your plugin file (a single JAR file found in build/libs).

Additional info
---------------

You may want to check the [RDAPI repository]()https://github.com/martinambrus/RDModTimeSlower.git for some info about the API if you'd like to code a RubyDung mod of your own.

You may also want to check the [Minecraft Veteran Servers YouTube Channel](https://www.youtube.com/channel/UCMiKrpX4ViX4PGBOq1UXlvQ) for videos on creation of all this nonsense and perhaps some inspiration for creation of your own game / Minecraft clone :-D 

No source code from Notch, Mojang or Microsoft is used in this or any other repositories related to this project.
