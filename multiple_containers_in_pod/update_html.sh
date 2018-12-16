#!/bin/bash
# Recommend syntax for setting an infinite while loop
while :
do
    cat > /usr/local/apache2/htdocs/index.html << EOF
    echo "<HTML>"
    echo "<BODY>"
    echo "Kubernetes multiple containers demo"
	date +"+DATE: %Y-%m-%d%nTIME: %H:%M:%S"
    echo "</BODY>"
    echo "</HTML>"
    sleep 5s

EOF
done