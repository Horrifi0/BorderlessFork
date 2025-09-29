# BorderlessFork Changelog

## [1.2.0] - 2024-12-XX - Fork Release

This changelog documents the changes made when forking Borderless Mining to create BorderlessFork.

### **Fork Information**
- **Original Mod**: Borderless Mining v1.1.9 by comp500
- **Fork Author**: Horrifi0
- **Original Repository**: https://github.com/comp500/BorderlessMining
- **Fork Repository**: https://github.com/Horrifi0/BorderlessFork

### **Changes Made During Fork**

#### **Renaming & Branding**
- Renamed mod from "Borderless Mining" to "BorderlessFork"
- Updated display name in `fabric.mod.json`
- Changed `archives_base_name` in `gradle.properties` from `borderless-mining` to `borderlessfork`
- Updated all repository URLs to point to the new fork location

#### **Project Cleanup**
- Removed generated `remappedSrc/` directory (build artifact)
- Updated `.gitignore` to prevent `remappedSrc/` from being committed
- Ran `gradle clean` to ensure clean build state

#### **Documentation Updates**
- Completely rewrote README.md with:
  - Updated title and branding
  - Added proper installation instructions
  - Added build instructions
  - Added compatibility information
  - Clear fork attribution and credits
  - Professional formatting and structure

#### **Repository Changes**
- Changed origin remote from `comp500/BorderlessMining` to `Horrifi0/BorderlessFork`
- Updated all contact links in `fabric.mod.json`
- Updated source URLs in `gradle.properties`

### **Inherited Features** (from original mod)
All original functionality preserved:
- Borderless fullscreen window mode
- In-game toggle via Video Settings
- Mod Menu configuration support
- Multi-monitor friendly operation
- Custom window positioning support
- macOS compatibility handling

### **Technical Details**
- **Base Version**: 1.1.9 (original mod version)
- **Minecraft**: 1.21.5-1.21.8 compatibility
- **Fabric Loader**: 0.17.2+
- **Java**: 21
- **Fabric API**: 0.133.4+

### **Credits**
- **Original Author**: [comp500](https://github.com/comp500)
- **Fork Maintainer**: [Horrifi0](https://github.com/Horrifi0)
- **Original CurseForge Project ID**: 310205 (referenced for compatibility)

---

*This fork maintains full compatibility with the original mod's functionality while establishing an independent development path for future updates and improvements.*