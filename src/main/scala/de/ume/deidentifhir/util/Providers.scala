package de.ume.deidentifhir.util

trait IDReplacementProvider {
  def getIDReplacement(resourceType: String, id: String) : String
}

trait IdentifierValueReplacementProvider {
  def getValueReplacement(system: String, value: String) : String
}

trait IdentifierValueReplacementProviderWithResourcetype {
  def getValueReplacement(system: String, value: String, resourceType: String) : String
}

trait ShiftDateProvider {
  def getDateShiftingValueInMillis(key: String): java.lang.Long
}
