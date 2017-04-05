// send a single fax
APIResponse response = interfax.sendFax(
	// a valid fax number
	"+11111111112",
	// a path to an InterFAX
  // compatible file
	new File("path/to/fax.pdf")
);
