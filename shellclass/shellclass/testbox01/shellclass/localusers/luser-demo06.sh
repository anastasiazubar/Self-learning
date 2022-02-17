#!/bin/bash

#This script generates a random password for each user specified on the command line

#Display what user typed on the command line
echo "You executed this command: ${0}"

#Display the path and filename of the script
echo "You used $(dirname ${0}) as the path to the $(basename ${0}) script"

#Tell the user how many arguments they passed in
# (Inside the script they are parameters, outside they are arguments )
NUM_OF_PARAMETRS="${#}"
echo "You supplied ${NUM_OF_PARAMETRS}  argument(s) on command line"

#Make sure they at least supply one argument
if [[ "${NUM_OF_PARAMETRS}" -lt 1 ]]
then
  echo "Usage: ${0} USER_NAME [USER_NAME] ..."
  exit 1
fi

#Generate and display a password for each parameter
for  USER_NAME in "${@}"
do
  PASSWORD="$(date +%s%N | sha256sum | head -c48)"
  echo "${USER_NAME} : ${PASSWORD}"
done
