#!/bin/bash

#This script creates a new user on the local system.
#You will be promted to enter the username (login), the person name, and a password
# The username, password and host for the account will be displayed

echo "Your UID id ${UID}"

#Only dispay if the UID does not match 1000
UID_FOR_TEST='0'
if [[ "${UID}" -ne ${UID_FOR_TEST} ]]
then
  echo "Please run with sudo or as a root "
  exit 1
fi

#Ask for the user username
read -p 'Enter the username to create: ' USER_NAME

#Ask a real name
read -p 'Enter the name of the person who this accoint if for:' COMMENT

#Ask a password
read -p 'Enter the password to use for the account: ' PASSWORD

#Create a username
useradd -c "${COMMENT}" -m ${USER_NAME}

#Test if the command succeeded
if [[ "${?}" -ne 0 ]]
then
  echo 'Account did not create succesfully'
  exit 1
fi

#Set up a password for the user was collected earlier
echo ${PASSWORD} | passwd --stdin ${USER_NAME}

#Test if the command succeeded
if [[ "${?}" -ne 0 ]]
then
  echo 'Password did not create succesfully'
  exit 1
fi

#Force password change on first login
passwd -e ${USER_NAME}

#Display a username and password created
echo
echo 'Username'
echo ${USER_NAME}
echo
echo 'Password'
echo ${PASSWORD}
echo
echo 'Host'
echo ${HOSTNAME}
