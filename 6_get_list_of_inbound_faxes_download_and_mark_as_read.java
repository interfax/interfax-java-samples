// only get unread faxes
GetInboundFaxListOptions options =
  new GetInboundFaxListOptions();
options.setUnreadOnly(Optional.of(true));

// get the faxes
InboundFaxStructure[] faxes =
  interfax.getInboundFaxList(
    Optional.of(options)
);

for (InboundFaxStructure fax : faxes) {
  // save the fax image
  byte[] image = interfax.getInboundFaxImage(
      String.valueOf(fax.getMessageId())
  );
  FileOutputStream fos =
    new FileOutputStream(fax.getMessageId()+".pdf");
  fos.write(image);
  fos.close();

  // mark as read
  interfax.markInboundFax(
    String.valueOf(fax.getMessageId()),
    Optional.of(true)
  );
}
