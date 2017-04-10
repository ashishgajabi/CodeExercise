#!/bin/bash

#Create directory if it doesn't exists already
mkdir -p "$(dirname "$3")"

#Copy file from input directory to output directory
cp $1 $3

#update file in output directory with placeholder values from properties file
while IFS='=' read -r k v; do
 # echo "$k => $v"
  sed -i "s/\[\[$k\]\]/$v/g" $3
done < "$2"
#End of Script