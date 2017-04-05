// given an InterFAX fax ID
String faxId = "12345";
// retrieve the fax
InboundFaxStructure fax =
  interfax.getInboundFaxRecord(faxId);
// check the status
fax.getImageStatus();
// check the number of pages
fax.getPages();
