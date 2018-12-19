#!/bin/bash

cd /usr/local/apache2/htdocs/
while :
do
   
    echo "<HTML>" > index.html
    echo "<BODY>" >> index.html
    echo "Kubernetes multiple containers demo" >> index.html
	date +"+DATE: %Y-%m-%d%nTIME: %H:%M:%S" >> index.html
    echo "</BODY>" >> index.html
    echo "</HTML>" >> index.html

sleep 5s
done
