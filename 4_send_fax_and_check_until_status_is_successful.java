APIResponse response = interfax.sendFax(
	"+11111111112",
	new File("path/to/fax.pdf")
);

// extract the fax ID from the response
String url = (String) response.getHeaders().get("Location").get(0);
String faxId = url.substring(url.lastIndexOf('/') + 1);

// wait for the fax to send
// successfully
while (true) {
  //reload the fax data
	OutboundFaxStructure fax = interfax.getFaxRecord(faxId);
  // wait if fax is still sending
	if (fax.getStatus() < 0) {
	  System.out.println("Waiting 10s");
    Thread.sleep(10000);
  // if the status is 0 the fax has been sent
  } else if (fax.getStatus() == 0) {
	  System.out.println("Sent!");
	  break;
  // if the status is above 0 an error has occured
  } else if (fax.getStatus() > 0) {
	  System.out.println("Error: "+fax.getStatus());
	  break;
  }
}
