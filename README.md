# This simply blocks the cancerous Mod Announcer packet [Firmament](https://modrinth.com/mod/firmament) attempts to send to servers.

This is NOT normal fabric behaviour - only Forge has a mod announcer, and Fabric does not need one. I should not have one of my mods snitching on my entire mods folder - no fabric server NEEDS to see my modids.

See: https://github.com/FirmamentMC/Firmament/blob/mc-1.21.11/src/main/kotlin/features/misc/ModAnnouncer.kt (this is what I'm blocking)

I am a catboy; therefore, everything is open source. Feel free to skid this 52 different times, I really don't care.
If it breaks dm me on discord - @axle.coffee or open a github issue or fix it yourself and open a PR
