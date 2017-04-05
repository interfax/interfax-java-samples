// given an InterFAX fax ID
String faxId = "12345";
// resend the email
interfax.resendFax(
  faxId,
  Optional.of("test@example.com")
);
// mark as unread
interfax.markInboundFax(
  faxId,
  Optional.of(true)
);
