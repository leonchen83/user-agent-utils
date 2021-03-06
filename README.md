user-agent-utils
================

Utilities for processing user-agent strings. Can be used to handle http requests in real-time or to analyze log files.

For the latest release, go to
https://github.com/leonchen83/user-agent-utils/tree/master

Maven
-----

Add dependency:
```xml
<dependency>
   <groupId>com.moilioncircle</groupId>
   <artifactId>user-agent-utils</artifactId>
   <version>1.53</version>
</dependency>
```

Contributors
------------
* accepting any new contributions.  

Contact
-------
chen.bao.yi@qq.com  

Changelog
---------

1.53
----
- Support JDK9, JDK10

1.52
----
- Added current Firefox and Chrome and Opera versions (until 2018-02-27)  
- Merged remote branch 1.21  

1.19
----
- #138 Improved future Microsoft Edge detection and added  Edge 13
- Added current and future Firefox and Chrome versions
- Improved detection of unsuported new Firefox versions
- Added detection of Firefox mobile for iOS devices
- Improved Phantom.js detection as BOT
- Added support for Android 6 and Android 6 tablets 

1.18
----
- #118 Updated Opera support
- #115 Improved Ubuntu detection
- #114 Fixed Microsoft Edge version detection
- #125 Improved Opera version detection
- Safari 9 support

1.17
----
- Added Ubuntu and Ubuntu Touch (mobile) detection  
- Added Windows 10 mobile detection  
- Added Microsoft Edge browser detection (contributed by https://github.com/nmaves)  
- Added future Firefox versions up to 42.

1.16
----
- iOS 8.2, 8.3, 8.4 and 9 added
- Chrome updated with latest versions
- Firefox updated with latest versions 
- Updated Opera browser detection
- Xbox OS and Internet Explorer for Xbox added  
- Improved CFNETWORK browser detection 
- Added Vivaldi browser
- Improved Windows 10 detection
- Improved bot detection
- Added Android 5 tablet detection
- Performance improvements

1.15
----
- Safari 7 and 8 added
- iOS 8.1 added
- Wearable device category added with detection of Google Glass
- Chrome OS added
- Windows 10 added
- Android 5 added

1.14
----
- IOS8 support added  
- added Opera Coast as new mobile browser  
- more Chrome and Firefox versions added, including future releases (up to Firefox 40 and Chrome 40)
- added 3 Opera versions  
- performance improvements

1.13  
----  
* Added additional Chrome and Opera browser versions
* Added current and future Firefox versons
* Added agent string handling for Microsoft RSS platform user-agents
* Added detection of Windows Phone 8.1 and IE Mobile 11.
* Fixed null pointer exception when user-agent-string was null
* Adjusted IE11 regex to match IE11 on Win8 


1.12
----
* Fix for version detection of Internet Explorer 11, contributed by https://github.com/parker
* Browser versions are now comparable (#33), contributed by https://github.com/reindyr
* Detect image proxy used by Google for Gmail
* Detect Google's mobile bot (#8)
* Internet Explorer 10 mobile version added (#28)
* Improved Chrome mobile detection (#30)

1.11
----

* Fixed none unique manufacturer id (issue #22)
* added IOS 7 detection and improved IOS detection for iPads (issue #21)
* added Chrome 30 and 31

1.10
----

* Fixed and extended OS and browser detection when using Firefox on mobiles or tablets
* Added additional and future Firefox versions
* Added Chrome 29
* Added Opera 11, 12, 15 & 16 
 
1.9
---

* Fixed version detection of Chrome Mobile
* Added Firefox 20 detection plus beta and future versions
* Added beta and future versions of Chrome

1.8
---

* Option just to check just for a given collection of browsers or operating systems
* Updated Chrome, Firefox and Safari detection to include the latest versions
* Minor code optimizations
* The package name has changed. Update import statements if you've been using the library before! 

