// send multiple files as 1 fax
File[] files = new File[2];
files[0] = new File("path/to/fax.pdf");
files[1] = new File("path/to/fax.html");

// send the fax
APIResponse response = interfax.sendFax(
  // a valid fax number
	"+11111111112",
  // an array of File or
  // InputStream objects
	files
);
