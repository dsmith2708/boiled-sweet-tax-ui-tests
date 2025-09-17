/*
 * Copyright 2024 HM Revenue & Customs
 *
 */

package pages

import org.openqa.selenium.By

object BusinessDatePage extends BasePage {
  private val day: By = By.id("business-start-day")
  private val month: By = By.id("business-start-month")
  private val year: By = By.id("business-start-year")

  def submit(dayValue: Int, monthValue: Int, yearValue: Int): Unit = {
    sendKeys(day, dayValue.toString)
    sendKeys(month, monthValue.toString)
    sendKeys(year, yearValue.toString)
    click(submitButton)
  }
}
