# Comment out if the grid is already up


docker-compose up --build -d

response=$(curl --write-out %{http_code} --silent --output /dev/null http://localhost:4444/status)

while [ ${response} != "200" ]
do
     response=$(curl --write-out %{http_code} --silent --output /dev/null http://localhost:4444/status)
done

echo "Grid is Up"


#As the ports are set as root property, the remaning tasks also need to get the parameters required
gradle -PviewPortWidthProp=677 -PviewPortHeightProp=900 -Pplatform="web" runTestsForChrome
gradle -PviewPortWidthProp=414 -PviewPortHeightProp=534 -Pplatform="web" runTestsForChrome
gradle -PviewPortWidthProp=677 -PviewPortHeightProp=900 -Pplatform="android" runTestsForAndroidChrome
gradle -PviewPortWidthProp=677 -PviewPortHeightProp=900 -Pplatform="android" runTestsForIOSSafari

