#!/bin/bash

#This script creates an account on the local system.
#You will be promted for the account name and password

#Ask for the user username
read -p 'Enter the username to create: ' USER_NAME

#Ask a real name
read -p 'Enter the name of the person who this accoint if for:' COMMENT

#Ask a password
read -p 'Enter the password to use for the account: ' PASSWORD

#Create a username
useradd -c "${COMMENT}" -m ${USER_NAME}

#Set up a password for the user was collected earlier
echo ${PASSWORD} | passwd --stdin ${USER_NAME}

#Force password change on first login
passwd -e ${USER_NAME}
