// given an InterFAX fax ID
String faxId = "12345";
// retrieve the fax
OutboundFaxStructure fax =
  interfax.getFaxRecord(faxId);
// check the status
fax.getStatus();
