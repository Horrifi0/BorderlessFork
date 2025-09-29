# BorderlessFork
A Minecraft mod that changes the fullscreen option to use a borderless window that fills the screen. This allows you to have Minecraft open on one monitor, while using other programs on another monitor - as normally Minecraft minimises when you unfocus it.

This mod adds the Borderless Windowed option to the Video Settings screen, so you can easily disable the mod ingame, and has a configuration menu accessible through Mod Menu.

**Note:** This is a fork of the original [Borderless Mining](https://github.com/comp500/BorderlessMining) mod, created to allow for independent development and updates.

## Features
- Borderless fullscreen window mode
- In-game toggle via Video Settings
- Mod Menu configuration support
- Multi-monitor friendly

## Building
This mod uses [Fabric](https://fabricmc.net/) and requires Java 21.

To build:
```bash
./gradlew build
```

## Installation
1. Install [Fabric Loader](https://fabricmc.net/use/)
2. Download the latest release from the [releases page](https://github.com/Horrifi0/BorderlessFork/releases)
3. Place the jar file in your `.minecraft/mods/` folder

## Compatibility
- Minecraft 1.21.5+
- Fabric Loader 0.17.2+
- Java 21+

On macOS this mod is disabled by default, as it is impossible to position the window above the menu bar, and macOS has better fullscreen support anyway.

## Credits
- Original mod by [comp500](https://github.com/comp500)
- Fork maintained by [Horrifi0](https://github.com/Horrifi0)