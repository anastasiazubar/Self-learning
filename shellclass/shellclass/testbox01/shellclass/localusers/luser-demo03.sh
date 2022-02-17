#!/bin/bash

# Display the UID and password of the user executing this script
# Display if the user is the vargant user or not

#Display the UID
echo "Your UID id ${UID}"

#Only dispay if the UID does not match 1000
UID_FOR_TEST='1000'
if [[ "${UID}" -ne ${UID_FOR_TEST} ]]
then
  echo "UID does not match UID FOR TEST, ${UID} != ${UID_FOR_TEST} "
  exit 1
fi

#Display the USER_NAME
USER_NAME=$(id -un)

#Test if the command succeeded
if [[ "${?}" -ne 0 ]]
then
  echo 'The id comment did not execute succesfully'
  exit 1
fi
echo " Your user name is ${USER_NAME}"

#You can use a string test conditional
USER_NAME_TO_TEST='vargant'
if [[ "$USER_NAME" = "$USER_NAME_TO_TEST" ]]
then
echo "Your username matches ${USER_NAME_TO_TEST}"
fi

#Test for != (not equal) for the string
if [[ "$USER_NAME" != "$USER_NAME_TO_TEST" ]]
then
  echo "Your username does not match ${USER_NAME_TO_TEST}"
  exit 1
fi

exit 0
