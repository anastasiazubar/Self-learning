apt-get -y update

dpkg -s npm &>/dev/null || {
  apt-get -y install nodejs npm
  ln -s /usr/bin/nodejs /usr/bin/node
}