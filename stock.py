from twilio.rest import TwilioRestClient
import urllib.request
import time

stock = 1

def get_stock():
	page = urllib.request.urlopen("http://money.rediff.com/index.html").read().decode("utf8")
	where = page.find('<title>BSE')
	start = where + 7
	end = where + 59
	return page[start:end]

stock_price = get_stock()

while stock == 1:
	time.sleep(43200)
	client = TwilioRestClient("your twilio AC no.", "your twilio id pass")
	client.messages.create(to="your registered no.", from_="your twilio phone no.", body= stock_price + "message delivered from python")
