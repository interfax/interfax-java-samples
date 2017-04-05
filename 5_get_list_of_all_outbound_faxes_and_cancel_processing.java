// get all recent faxes
OutboundFaxStructure[] faxes
  = interfax.getFaxList();

// cancel all processing faxes
for (OutboundFaxStructure fax : faxes) {
	if (fax.getStatus() < 0) {
    interfax.cancelFax(fax.getId());
	}
}
