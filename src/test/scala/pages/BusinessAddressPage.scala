/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages

import models.Address
import org.openqa.selenium.By

object BusinessAddressPage extends BasePage {
  private val houseNumberField: By = By.id("houseNumber")
  private val streetField: By = By.id("street")
  private val cityField: By = By.id("city")
  private val countyField: By = By.id("county")
  private val postcodeField: By = By.id("postcode")

  def submit(address: Address): Unit = {
    sendKeys(houseNumberField, address.houseNumber)
    sendKeys(streetField, address.street)
    sendKeys(cityField, address.city)
    sendKeys(countyField, address.county)
    sendKeys(postcodeField, address.postcode)
    click(submitButton)
  }
}
