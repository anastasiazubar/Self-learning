#!/bin/bash

# Thus script just displays various informaiton to the screen
# Display the text "Hello"

echo 'Hello'

#Assing value to a variable
WORD='script'

#Display that value using the variable
echo "$WORD"

#Dimonstrate that single quotes cause variables to NOT get expanded
echo '$WORD'

#Combine the variable with hard-coded text
echo "This is a shell $WORD"

# Diplay the content of the variable using an alternive syntax
echo "This is a shell ${WORD}"

#Append thext to the variable
echo "${WORD}ing is fun"

#Show how NOT to append text to a variable
#This is doesn't work
echo "$WORDing is fun!"

#Create a new variable
ENDING='ed'

#Combine the two variables
echo "This is ${WORD}${ENDING}."

#Change the value stored in the ENDING variable -> Reassigment
ENDING='ing'
echo "${WORD}${ENDING} is fun."

#Reassigment
ENDING='s'
echo "You are going to write many ${WORD}${ENDING} in this class."
