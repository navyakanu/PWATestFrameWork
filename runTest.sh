#As the ports are set as root property, the remaning tasks also need to get the parameters required
gradle -PviewPortWidthProp=677 -PviewPortHeightProp=900 runTestsForChrome
gradle -PviewPortWidthProp=414 -PviewPortHeightProp=534 runTestsForChrome
gradle -PviewPortWidthProp=677 -PviewPortHeightProp=900 runTestsForAndroidChrome
gradle -PviewPortWidthProp=677 -PviewPortHeightProp=900 runTestsForIOSSafari

