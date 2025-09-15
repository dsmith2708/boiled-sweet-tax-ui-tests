/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages


import org.openqa.selenium.By

object BusinessNamePage extends BasePage {
  private val inputField: By = By.id("businessName")

  def submit(name: String): Unit = {
    sendKeys(inputField, name)
    click(submitButton)
  }
}
