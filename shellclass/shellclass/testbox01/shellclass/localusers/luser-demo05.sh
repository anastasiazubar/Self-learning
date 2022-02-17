# Generate a list of random passwords
# A random number as a password

PASSWORD="${RANDOM}"
echo "${PASSWORD}"

#Three random number together
PASSWORD="${RANDOM}${RANDOM}${RANDOM}"
echo "${PASSWORD}"

# Use the current date/time as the basic for the passwd
PASSWORD="$(date +%s)"
echo "${PASSWORD}"

# Use nanoseconds to generate random passwd
PASSWORD="$(date +%s%N)"
echo "${PASSWORD}"

#A better password
PASSWORD="$(date +%s%N | sha256sum | head -c32)"
echo "${PASSWORD}"

#An even better passwd
PASSWORD="$(date +%s%N${RANDOM}${RANDOM} | sha256sum | head -c48)"
echo "${PASSWORD}"

#An even better passwd
SPECIAL_CH=$(echo '!@#$%^&*()_+=-' | fold -b1 | shuf | head -c1)
echo "${PASSWORD}${SPECIAL_CH}"
