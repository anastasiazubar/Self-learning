apt-get -y update
apt-get -y install nginx

rm -rf /etc/nginx/sites-enabled
cp -r /vagrant/sites-enables /etc/nginx

service nginx start