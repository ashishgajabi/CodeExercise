###########################
#####INSTRUCTIONS##########
###########################

#Script is located at 'scripts' folder
#'input' folder contains 'index.html' file which needs to be updated with properties values 
#from property file located at 'conf' folder.

#Script creates output folder if it doesn't exists with name provided at execution.

#Enter in the scripts folder and set execute permission on script file
chmod +x replaceToken.sh

#Command to execute script is as below,

#1) Below script execution will create output file in 'output' folder using 'prod.properties' file
./replaceToken.sh ../input/index.html ../conf/prod.properties ../output/index.html


2) Below script execution will create output file in 'op' folder using 'test.properties' file
./replaceToken.sh ../input/index.html ../conf/test.properties ../op/index.html