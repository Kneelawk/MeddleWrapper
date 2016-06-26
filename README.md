# MeddleWrapper
A wrapper for Meddle that allows it to be loaded with or by other tweakers

## Description
MeddleWrapper is **not** a Meddle mod. It must be loaded by LaunchWrapper with Meddle as a library.<br/>
MeddleWrapper is a subclass of Meddle that overrites Meddle's <code>getLaunchArguments()</code> 
method and returns an empty array of strings so as to not interfere with any other Tweaker that
has already provided the launch arguments.
