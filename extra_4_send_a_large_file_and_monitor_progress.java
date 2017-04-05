File file = new File("test.pdf");

InterFAX interFAX = new DefaultInterFAXClient();
APIResponse response = interFAX.uploadDocument(file);

// extract the fax ID from the response
String url = (String) response.getHeaders().get("Location").get(0);
String documentId = url.substring(url.lastIndexOf('/') + 1);

// check the status of the document
UploadedDocumentStatus status
  = interFAX.getUploadedDocumentStatus(documentId);

// if the status is ready send the fax
if (status.getStatus() == 'Ready') {
  APIResponse fax = interfax.sendFax("+11111111112", url);
}
